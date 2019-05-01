package com.example.android.apptrabalho2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recebe_lista_de_objeto);

        Intent i = getIntent();
        List<Disciplina> listaDisciplinas = i.getParcelableArrayListExtra("listaDisciplina");

        ArrayAdapter<Disciplina> adapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1, listaDisciplinas);

        ListView listView = findViewById(R.id.listViewId);


        listView.setAdapter(adapter);
    }
}
