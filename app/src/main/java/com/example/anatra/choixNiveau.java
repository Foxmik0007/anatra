package com.example.anatra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class choixNiveau extends AppCompatActivity {

    private Button Universitaire;
    private Button Lycee;
    private Button College;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_niveau);

        Universitaire = (Button) findViewById(R.id.btnNvUniversitaire);
        Lycee = (Button) findViewById(R.id.btnNvLycéen);
        College = (Button) findViewById(R.id.btnNvCollege);


    }
}