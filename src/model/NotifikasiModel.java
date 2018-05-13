package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "notifikasi", schema = "mysneakersby", catalog = "")
public class NotifikasiModel {
    private int id;
    private int orderId;
    private String notif;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "order_id", nullable = false)
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "notif", nullable = false, length = 50)
    public String getNotif() {
        return notif;
    }

    public void setNotif(String notif) {
        this.notif = notif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotifikasiModel that = (NotifikasiModel) o;
        return id == that.id &&
                orderId == that.orderId &&
                Objects.equals(notif, that.notif);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, orderId, notif);
    }
}
