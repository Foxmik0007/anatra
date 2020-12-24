package com.example.anatra;

import android.widget.ImageView;

public class Matiere {

    private String nom;
    private String niveau;

    public Matiere() {
    }

    public Matiere(String nom,String niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public String getNiveau() {
        return niveau;
    }
}
