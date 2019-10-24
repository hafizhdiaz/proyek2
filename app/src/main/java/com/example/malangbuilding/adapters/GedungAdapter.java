package com.example.malangbuilding.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.malangbuilding.R;
import com.example.malangbuilding.model.Gedung;

import java.util.List;

public class GedungAdapter extends RecyclerView.Adapter<GedungAdapter.MyViewHolder>{

    List<Gedung> gedungList;
    public GedungAdapter(List<Gedung> gedungList) {
        this.gedungList = gedungList;
    }

    @NonNull
    @Override
    public GedungAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter degnan layout)
        View gedungView = layoutInflater.inflate(R.layout.list_gedung,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(gedungView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GedungAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        Gedung gedung = gedungList.get(position);
        //set text heroName berdasarkan data dari model hero
        holder.gedungName.setText(gedung.getNamaGedung());
        holder.gambarName.setImageDrawable(gedung.getImage());
    }

    @Override
    public int getItemCount() {
        return (gedungList != null) ? gedungList.size() : 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView gedungName;
        public ImageView gambarName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            gedungName = itemView.findViewById(R.id.TxtNama);
            gambarName = itemView.findViewById(R.id.Gambargedung);
        }
    }
}
