package model;

import javax.persistence.*;

@Entity
@Table(name = "brand", schema = "mysneakersby", catalog = "")
public class BrandModel {
    private int id;
    private String nama;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nama", nullable = false, length = 50)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrandModel that = (BrandModel) o;

        if (id != that.id) return false;
        if (nama != null ? !nama.equals(that.nama) : that.nama != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nama != null ? nama.hashCode() : 0);
        return result;
    }
}
