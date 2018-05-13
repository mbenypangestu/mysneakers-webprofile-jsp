package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "warna_produk", schema = "mysneakersby", catalog = "")
public class WarnaProdukModel {
    private int produkId;
    private int warnaId;

    @Basic
    @Column(name = "produk_id", nullable = false)
    public int getProdukId() {
        return produkId;
    }

    public void setProdukId(int produkId) {
        this.produkId = produkId;
    }

    @Basic
    @Column(name = "warna_id", nullable = false)
    public int getWarnaId() {
        return warnaId;
    }

    public void setWarnaId(int warnaId) {
        this.warnaId = warnaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarnaProdukModel that = (WarnaProdukModel) o;
        return produkId == that.produkId &&
                warnaId == that.warnaId;
    }

    @Override
    public int hashCode() {

        return Objects.hash(produkId, warnaId);
    }
}
