package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "detail_order", schema = "mysneakersby", catalog = "")
public class DetailOrderModel {
    private int orderId;
    private int jumlah;
    private int produkId;
    private double subtotal;

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "jumlah", nullable = false)
    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
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
    @Column(name = "subtotal", nullable = false, precision = 0)
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DetailOrderModel that = (DetailOrderModel) o;

        if (orderId != that.orderId) return false;
        if (jumlah != that.jumlah) return false;
        if (produkId != that.produkId) return false;
        if (Double.compare(that.subtotal, subtotal) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        result = 31 * result + jumlah;
        result = 31 * result + produkId;
        temp = Double.doubleToLongBits(subtotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
