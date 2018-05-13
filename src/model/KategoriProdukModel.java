package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "kategori_produk", schema = "mysneakersby", catalog = "")
public class KategoriProdukModel {
    private int id;
    private String kategori;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "kategori", nullable = false, length = 50)
    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KategoriProdukModel that = (KategoriProdukModel) o;
        return id == that.id &&
                Objects.equals(kategori, that.kategori);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, kategori);
    }
}
