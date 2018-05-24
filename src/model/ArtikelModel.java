package model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "artikel", schema = "mysneakersby", catalog = "")
public class ArtikelModel {
    private int id;
    private String judul;
    private String konten;
    private String gambar;
    private Timestamp tglPos;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "judul", nullable = false, length = 50)
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Basic
    @Column(name = "konten", nullable = false, length = 65535)
    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    @Basic
    @Column(name = "gambar", nullable = false, length = 50)
    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    @Basic
    @Column(name = "tgl_pos", nullable = false)
    public Timestamp getTglPos() {
        return tglPos;
    }

    public void setTglPos(Timestamp tglPos) {
        this.tglPos = tglPos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtikelModel that = (ArtikelModel) o;

        if (id != that.id) return false;
        if (judul != null ? !judul.equals(that.judul) : that.judul != null) return false;
        if (konten != null ? !konten.equals(that.konten) : that.konten != null) return false;
        if (gambar != null ? !gambar.equals(that.gambar) : that.gambar != null) return false;
        if (tglPos != null ? !tglPos.equals(that.tglPos) : that.tglPos != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (judul != null ? judul.hashCode() : 0);
        result = 31 * result + (konten != null ? konten.hashCode() : 0);
        result = 31 * result + (gambar != null ? gambar.hashCode() : 0);
        result = 31 * result + (tglPos != null ? tglPos.hashCode() : 0);
        return result;
    }
}
