package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "produk", schema = "mysneakersby", catalog = "")
public class ProdukModel {
    private int id;
    private int brandId;
    private String nama;
    private int jenisId;
    private String bahan;
    private double harga;
    private int stok;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "brand_id", nullable = false)
    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "nama", nullable = false, length = 50)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Basic
    @Column(name = "jenis_id", nullable = false)
    public int getJenisId() {
        return jenisId;
    }

    public void setJenisId(int jenisId) {
        this.jenisId = jenisId;
    }

    @Basic
    @Column(name = "bahan", nullable = false, length = 50)
    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    @Basic
    @Column(name = "harga", nullable = false, precision = 0)
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Basic
    @Column(name = "stok", nullable = false)
    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdukModel that = (ProdukModel) o;
        return id == that.id &&
                brandId == that.brandId &&
                jenisId == that.jenisId &&
                Double.compare(that.harga, harga) == 0 &&
                stok == that.stok &&
                Objects.equals(nama, that.nama) &&
                Objects.equals(bahan, that.bahan);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, brandId, nama, jenisId, bahan, harga, stok);
    }
}
