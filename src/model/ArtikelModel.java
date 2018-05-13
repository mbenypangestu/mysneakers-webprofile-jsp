package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

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
        return id == that.id &&
                Objects.equals(judul, that.judul) &&
                Objects.equals(konten, that.konten) &&
                Objects.equals(gambar, that.gambar) &&
                Objects.equals(tglPos, that.tglPos);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, judul, konten, gambar, tglPos);
    }
}
