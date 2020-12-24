package com.example.anatra;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    ListView listView;
    List<Matiere> listeDeMatiereDisponible;
    List<String> strings;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

       listView = (ListView) view.findViewById(R.id.listViewIte);

        listeDeMatiereDisponible = new ArrayList<>();
        strings = new ArrayList<>();

        String m = "Mot1";
        String n = "Mot2";

        strings.add(m);
        strings.add(n);

        Matiere physique = new Matiere("Physique", "BEPC");
        Matiere Science = new Matiere("Science","BAC");

        listeDeMatiereDisponible.add(physique);
        listeDeMatiereDisponible.add(Science);

        ArrayAdapter<Matiere> matiereArrayAdapter = new ArrayAdapter<Matiere>(getActivity(), R.layout.activity_liste, listeDeMatiereDisponible);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, strings);

        listView.setAdapter(matiereArrayAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}