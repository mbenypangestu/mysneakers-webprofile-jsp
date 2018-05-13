package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "promo_produk", schema = "mysneakersby", catalog = "")
public class PromoProdukModel {
    private int id;
    private int produkId;
    private int diskon;
    private double hargaPromo;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "produk_id", nullable = false)
    public int getProdukId() {
        return produkId;
    }

    public void setProdukId(int produkId) {
        this.produkId = produkId;
    }

    @Basic
    @Column(name = "diskon", nullable = false)
    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    @Basic
    @Column(name = "harga_promo", nullable = false, precision = 0)
    public double getHargaPromo() {
        return hargaPromo;
    }

    public void setHargaPromo(double hargaPromo) {
        this.hargaPromo = hargaPromo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PromoProdukModel that = (PromoProdukModel) o;
        return id == that.id &&
                produkId == that.produkId &&
                diskon == that.diskon &&
                Double.compare(that.hargaPromo, hargaPromo) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, produkId, diskon, hargaPromo);
    }
}
