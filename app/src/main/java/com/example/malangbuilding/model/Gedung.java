package com.example.malangbuilding.model;

import android.graphics.drawable.Drawable;

public class Gedung {
    public String judul;
    public Drawable image;

    public Gedung(String judul, Drawable image) {
        this.judul = judul;
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
