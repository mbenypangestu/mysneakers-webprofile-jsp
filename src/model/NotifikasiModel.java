package model;

import javax.persistence.*;

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

        if (id != that.id) return false;
        if (orderId != that.orderId) return false;
        if (notif != null ? !notif.equals(that.notif) : that.notif != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + orderId;
        result = 31 * result + (notif != null ? notif.hashCode() : 0);
        return result;
    }
}
