package com.example.anatra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class choix_examen extends AppCompatActivity {

    private Button concours;
    private Button examenOfficiel;
    private Button normal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_examen);

        concours = (Button) findViewById(R.id.btnConcours);
        examenOfficiel = (Button) findViewById(R.id.btnOfficiel);
        normal = (Button) findViewById(R.id.btnNormal);

    }
}