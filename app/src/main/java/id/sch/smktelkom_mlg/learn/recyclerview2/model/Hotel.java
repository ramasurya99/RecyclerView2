package id.sch.smktelkom_mlg.learn.recyclerview2.model;

/**
 * Created by Master on 16/11/2016.
 */

import android.graphics.drawable.Drawable;


public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}