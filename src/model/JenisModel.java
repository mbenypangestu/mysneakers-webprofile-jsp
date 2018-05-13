package model;

import javax.persistence.*;
import java.util.Objects;

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
        return id == that.id &&
                Objects.equals(jenis, that.jenis);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, jenis);
    }
}
