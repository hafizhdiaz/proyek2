package com.example.malangbuilding.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.malangbuilding.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private String[] spinner_array1 = {"--- Pilih ---", "Kurang dari 5.000.000", "5.100.000 - 7.000.000", "7.100.000 - 13.000.000", "Lebih dari 13.000.000"};
    private String[] spinner_array2 = {"--- Pilih ---", "Kurang dari 500", "501 - 1000", "1001 - 10.000", "10.001 - 20.000"};
    private String Selected;

    private Spinner spinner;



    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        // Inflate the layout for this fragment
        Spinner spinner = (Spinner) v.findViewById(R.id.choose_harga);
        Spinner spinner2 = (Spinner) v.findViewById(R.id.choose_kap);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, spinner_array1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, spinner_array2);
        // mengeset Array Adapter tersebut ke Spinner
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        return v;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long id) {
        Selected=spinner_array1[i];
        Selected=spinner_array2[i];
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}
