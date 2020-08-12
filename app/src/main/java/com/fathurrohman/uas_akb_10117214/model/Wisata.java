package com.fathurrohman.uas_akb_10117214.model;

import java.io.Serializable;

/*
 * 12 Agustus 2020 - 10117214 - M Fathurrohman Mauludin - IF7
 */

public class Wisata implements Serializable {
    public String nama;
    public String deskripsi;
    public String jalan;
    public double koordinat1;
    public double koordinat2;
    public int gambar;

    public Wisata(String nama, String deskripsi, String jalan, double koordinat1, double koordinat2, int gambar) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.jalan = jalan;
        this.koordinat1 = koordinat1;
        this.koordinat2 = koordinat2;
        this.gambar = gambar;
    }

    public String getJalan() {
        return jalan;
    }

    public double getKoordinat1() {
        return koordinat1;
    }

    public double getKoordinat2() {
        return koordinat2;
    }

    public String getNama() {
        return nama;
    }

    public int getGambar() {
        return gambar;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

}
