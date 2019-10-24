package com.example.malangbuilding.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.malangbuilding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LihatDome extends Fragment {


    public LihatDome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lihat_dome, container, false);
    }

}
