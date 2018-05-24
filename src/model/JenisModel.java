package model;

import javax.persistence.*;

@Entity
@Table(name = "jenis", schema = "mysneakersby", catalog = "")
public class JenisModel {
    private int id;
    private String jenis;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "jenis", nullable = false, length = 50)
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JenisModel that = (JenisModel) o;

        if (id != that.id) return false;
        if (jenis != null ? !jenis.equals(that.jenis) : that.jenis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (jenis != null ? jenis.hashCode() : 0);
        return result;
    }
}
