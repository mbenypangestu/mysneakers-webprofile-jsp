package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "size_produk", schema = "mysneakersby", catalog = "")
public class SizeProdukModel {
    private int produkId;
    private int sizeId;

    @Basic
    @Column(name = "produk_id", nullable = false)
    public int getProdukId() {
        return produkId;
    }

    public void setProdukId(int produkId) {
        this.produkId = produkId;
    }

    @Basic
    @Column(name = "size_id", nullable = false)
    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeProdukModel that = (SizeProdukModel) o;

        if (produkId != that.produkId) return false;
        if (sizeId != that.sizeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = produkId;
        result = 31 * result + sizeId;
        return result;
    }
}
