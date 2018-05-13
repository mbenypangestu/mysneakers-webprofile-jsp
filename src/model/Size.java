/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dell
 */
public class Size {
    int id;
    double US;
    double UK;
    double EU;
    double CM;
    double IN;

    public Size(int id, double US, double UK, double EU, double CM, double IN) {
        this.id = id;
        this.US = US;
        this.UK = UK;
        this.EU = EU;
        this.CM = CM;
        this.IN = IN;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getUS() {
        return US;
    }

    public void setUS(double US) {
        this.US = US;
    }

    public double getUK() {
        return UK;
    }

    public void setUK(double UK) {
        this.UK = UK;
    }

    public double getEU() {
        return EU;
    }

    public void setEU(double EU) {
        this.EU = EU;
    }

    public double getCM() {
        return CM;
    }

    public void setCM(double CM) {
        this.CM = CM;
    }

    public double getIN() {
        return IN;
    }

    public void setIN(double IN) {
        this.IN = IN;
    }
    
}
