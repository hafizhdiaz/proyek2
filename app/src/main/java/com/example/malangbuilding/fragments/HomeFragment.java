package com.example.malangbuilding.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.malangbuilding.R;
import com.example.malangbuilding.adapters.GedungAdapter;
import com.example.malangbuilding.model.Gedung;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    RecyclerView rvGedung;
    List<Gedung> listGedung = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View v = inflater.inflate(R.layout.fragment_home, container, false);
//menyambungkan rvSuperHero ke layout
        rvGedung = v.findViewById(R.id.txtor);
        //Membuat object hero
        Gedung gedung = new Gedung("Dome", this.getResources().getDrawable(R.drawable.dome));
        //menambahkan hero ke listSuperHero
        listGedung.add(gedung);
        //membuat object hero baru
        gedung = new Gedung("Auper", this.getResources().getDrawable(R.drawable.poltek));
        //menambahkan hero baru ke listSuperhero
        listGedung.add(gedung);
        //Instansiasi Adapter
        GedungAdapter gedungAdapter = new GedungAdapter(listGedung);
        //set adapter dan layoutmanager
        rvGedung.setAdapter(gedungAdapter);
        rvGedung.setLayoutManager(new LinearLayoutManager(this.getActivity()));
      return v;
    }
}
