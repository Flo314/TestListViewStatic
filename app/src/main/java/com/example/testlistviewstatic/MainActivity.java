package com.example.testlistviewstatic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // on récupère ListView
        ListView list = findViewById(R.id.maliste);

        // on intancie un adapteur avec notre liste et notre textView
        ArrayAdapter<String> tableau = new ArrayAdapter<>(list.getContext(),R.layout.mon_texte);

        // on ajoute nos chaînes de caractère
        for(int i = 1; i<40; i++){
            tableau.add("Bonjour n°" + i);
        }

        // on affiche cet adapteur
        list.setAdapter(tableau);
    }
}
