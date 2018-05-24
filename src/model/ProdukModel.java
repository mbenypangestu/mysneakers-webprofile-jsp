package model;

import javax.persistence.*;

@Entity
@Table(name = "produk", schema = "mysneakersby", catalog = "")
public class ProdukModel {
    private int id;
    private int brandId;
    private String nama;
    private String deskripsi;
    private String gambar;
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
    @Column(name = "deskripsi", nullable = false, length = 65535)
    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @Basic
    @Column(name = "gambar", nullable = false, length = 65535)
    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
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

        if (id != that.id) return false;
        if (brandId != that.brandId) return false;
        if (jenisId != that.jenisId) return false;
        if (Double.compare(that.harga, harga) != 0) return false;
        if (stok != that.stok) return false;
        if (nama != null ? !nama.equals(that.nama) : that.nama != null) return false;
        if (deskripsi != null ? !deskripsi.equals(that.deskripsi) : that.deskripsi != null) return false;
        if (gambar != null ? !gambar.equals(that.gambar) : that.gambar != null) return false;
        if (bahan != null ? !bahan.equals(that.bahan) : that.bahan != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + brandId;
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        result = 31 * result + (deskripsi != null ? deskripsi.hashCode() : 0);
        result = 31 * result + (gambar != null ? gambar.hashCode() : 0);
        result = 31 * result + jenisId;
        result = 31 * result + (bahan != null ? bahan.hashCode() : 0);
        temp = Double.doubleToLongBits(harga);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + stok;
        return result;
    }
}
