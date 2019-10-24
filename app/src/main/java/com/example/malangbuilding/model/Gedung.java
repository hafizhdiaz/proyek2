package com.example.malangbuilding.model;

import android.graphics.drawable.Drawable;

public class Gedung {

    public String namaGedung;
    public Drawable image;

    public Gedung(String namaGedung, Drawable image) {
        this.namaGedung = namaGedung;
        this.image = image;
    }

    public String getNamaGedung() {
        return namaGedung;
    }

    public void setNamaGedung(String namaGedung) {
        this.namaGedung = namaGedung;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
