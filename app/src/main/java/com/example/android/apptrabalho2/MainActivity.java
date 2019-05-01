package com.example.android.apptrabalho2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button listButton;
    Button gridListButton;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    ArrayList<Disciplina> gradeDeDisciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listButton = findViewById(R.id.listButton);
        gridListButton = findViewById(R.id.gridButton);

        listButton.setOnClickListener(this);
        gridListButton.setOnClickListener(this);

    }

    private void enviaLista() {

        Disciplina disciplina = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina3 = new Disciplina();

        disciplina.setCargaHoraria(100);
        disciplina.setCodigo(1);
        disciplina.setDescricao("Matematica");

        disciplina2.setCargaHoraria(150);
        disciplina2.setCodigo(2);
        disciplina2.setDescricao("Portugues");

        disciplina3.setCargaHoraria(180);
        disciplina3.setCodigo(3);
        disciplina3.setDescricao("Artes");

        if (disciplinas.isEmpty()) {
            disciplinas.add(disciplina);
            disciplinas.add(disciplina2);
            disciplinas.add(disciplina3);
        }

        Intent intent = new Intent(this, ListViewActivity.class);

        intent.putParcelableArrayListExtra("listaDisciplina", disciplinas);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.listButton:
                enviaLista();
                break;
            case R.id.gridButton:
                enviaListaParaGrid();
                break;
        }
    }

    private void enviaListaParaGrid() {
        Disciplina gradeDeDisciplina = new Disciplina();
        Disciplina gradeDedisciplina2 = new Disciplina();
        Disciplina gradeDeDisciplina3 = new Disciplina();

        gradeDeDisciplina.setCargaHoraria(100);
        gradeDeDisciplina.setCodigo(1);
        gradeDeDisciplina.setDescricao("Matematica");

        gradeDedisciplina2.setCargaHoraria(150);
        gradeDedisciplina2.setCodigo(2);
        gradeDedisciplina2.setDescricao("Portugues");

        gradeDeDisciplina3.setCargaHoraria(180);
        gradeDeDisciplina3.setCodigo(3);
        gradeDeDisciplina3.setDescricao("Artes");

        if (gradeDeDisciplinas.isEmpty()) {
            gradeDeDisciplinas.add(gradeDeDisciplina);
            gradeDeDisciplinas.add(gradeDedisciplina2);
            gradeDeDisciplinas.add(gradeDeDisciplina3);
        }

        Intent intent = new Intent(this, GridViewActivity.class);
        intent.putParcelableArrayListExtra("listaDisciplina", gradeDeDisciplinas);
        startActivity(intent);
    }
}
