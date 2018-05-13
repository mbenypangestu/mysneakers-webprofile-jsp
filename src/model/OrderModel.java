package model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "mysneakersby", catalog = "")
public class OrderModel {
    private int id;
    private Timestamp tglOrder;
    private double total;
    private int statusKirim;
    private int statusTerima;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "tgl_order", nullable = false)
    public Timestamp getTglOrder() {
        return tglOrder;
    }

    public void setTglOrder(Timestamp tglOrder) {
        this.tglOrder = tglOrder;
    }

    @Basic
    @Column(name = "total", nullable = false, precision = 0)
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Basic
    @Column(name = "status_kirim", nullable = false)
    public int getStatusKirim() {
        return statusKirim;
    }

    public void setStatusKirim(int statusKirim) {
        this.statusKirim = statusKirim;
    }

    @Basic
    @Column(name = "status_terima", nullable = false)
    public int getStatusTerima() {
        return statusTerima;
    }

    public void setStatusTerima(int statusTerima) {
        this.statusTerima = statusTerima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderModel that = (OrderModel) o;
        return id == that.id &&
                Double.compare(that.total, total) == 0 &&
                statusKirim == that.statusKirim &&
                statusTerima == that.statusTerima &&
                Objects.equals(tglOrder, that.tglOrder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tglOrder, total, statusKirim, statusTerima);
    }
}
