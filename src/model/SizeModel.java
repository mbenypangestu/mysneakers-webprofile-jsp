package model;

import javax.persistence.*;

@Entity
@Table(name = "size", schema = "mysneakersby", catalog = "")
public class SizeModel {
    private int id;
    private double us;
    private double uk;
    private double eu;
    private double cm;
    private double in;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "US", nullable = false, precision = 0)
    public double getUs() {
        return us;
    }

    public void setUs(double us) {
        this.us = us;
    }

    @Basic
    @Column(name = "UK", nullable = false, precision = 0)
    public double getUk() {
        return uk;
    }

    public void setUk(double uk) {
        this.uk = uk;
    }

    @Basic
    @Column(name = "EU", nullable = false, precision = 0)
    public double getEu() {
        return eu;
    }

    public void setEu(double eu) {
        this.eu = eu;
    }

    @Basic
    @Column(name = "CM", nullable = false, precision = 0)
    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    @Basic
    @Column(name = "IN", nullable = false, precision = 0)
    public double getIn() {
        return in;
    }

    public void setIn(double in) {
        this.in = in;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeModel sizeModel = (SizeModel) o;

        if (id != sizeModel.id) return false;
        if (Double.compare(sizeModel.us, us) != 0) return false;
        if (Double.compare(sizeModel.uk, uk) != 0) return false;
        if (Double.compare(sizeModel.eu, eu) != 0) return false;
        if (Double.compare(sizeModel.cm, cm) != 0) return false;
        if (Double.compare(sizeModel.in, in) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(us);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(uk);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(eu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cm);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(in);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
