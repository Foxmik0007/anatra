package com.example.anatra;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;

public class liste extends ArrayAdapter<Matiere> {

    private Activity context;
    private List<Matiere> listeDesMatieres;

    public liste (Activity context, List<Matiere> matieres){
        super(context, R.layout.activity_liste, matieres);
        this.context = context;
        this.listeDesMatieres = matieres;
    }

    @NonNull
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View listViewItem = layoutInflater.inflate(R.layout.activity_liste, null, true);

       ImageView previsualisation = (ImageView) listViewItem.findViewById(R.id.previsualiser);
        TextView nomMatiere = (TextView) listViewItem.findViewById(R.id.nomMatiere);
        TextView niveau = (TextView) listViewItem.findViewById(R.id.niveauMatiere);

        Matiere matiere = listeDesMatieres.get(position);

        previsualisation.setImageResource(R.drawable.wallpaper);
        nomMatiere.setText(matiere.getNom());
        niveau.setText(matiere.getNiveau());

        return listViewItem;
    }


}