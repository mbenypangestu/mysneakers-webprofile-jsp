/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dell
 */
public class Artikel {
    int id;
    String judul;
    String konten;
    String gambar;
    String tgl_pos;

    public Artikel(int id, String judul, String konten, String gambar, String tgl_pos) {
        this.id = id;
        this.judul = judul;
        this.konten = konten;
        this.gambar = gambar;
        this.tgl_pos = tgl_pos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getTgl_pos() {
        return tgl_pos;
    }

    public void setTgl_pos(String tgl_pos) {
        this.tgl_pos = tgl_pos;
    }
}
