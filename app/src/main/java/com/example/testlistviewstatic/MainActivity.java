package com.example.testlistviewstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on récupère ListView
        ListView myListView = findViewById(R.id.myListView);

        // on intancie un adapteur avec notre liste et notre layout et l'id de notre textView
        ArrayAdapter<String> tableau = new ArrayAdapter<>(myListView.getContext(),R.layout.list_element,R.id.test_list_view);

        // on ajoute nos chaînes de caractère
        for(int i = 1; i<40; i++){
            tableau.add("Bonjour n°" + i);
        }

        // on affiche cet adapteur
        myListView.setAdapter(tableau);
    }
}
