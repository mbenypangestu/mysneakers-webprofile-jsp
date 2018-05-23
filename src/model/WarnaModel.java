package model;

import javax.persistence.*;

@Entity
@Table(name = "warna", schema = "mysneakersby", catalog = "")
public class WarnaModel {
    private int id;
    private String warna;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "warna", nullable = false, length = 20)
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WarnaModel that = (WarnaModel) o;

        if (id != that.id) return false;
        if (warna != null ? !warna.equals(that.warna) : that.warna != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (warna != null ? warna.hashCode() : 0);
        return result;
    }
}
