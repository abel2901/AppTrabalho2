package com.example.android.apptrabalho2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_objeto);

        Intent intent = getIntent();
        List<Disciplina> listaDisciplinas = intent.getParcelableArrayListExtra("listaDisciplina");

        ArrayAdapter<Disciplina> adapterDisciplina = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaDisciplinas);

        GridView gridViewDisciplinas = findViewById(R.id.gridDisciplinas);
        gridViewDisciplinas.setAdapter(adapterDisciplina);
    }
}
