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
public class Order {
    int id;
    String tgl_order;
    double total;
    int status_kirim;
    int status_terima;

    public Order(int id, String tgl_order, double total, int status_kirim, int status_terima) {
        this.id = id;
        this.tgl_order = tgl_order;
        this.total = total;
        this.status_kirim = status_kirim;
        this.status_terima = status_terima;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTgl_order() {
        return tgl_order;
    }

    public void setTgl_order(String tgl_order) {
        this.tgl_order = tgl_order;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getStatus_kirim() {
        return status_kirim;
    }

    public void setStatus_kirim(int status_kirim) {
        this.status_kirim = status_kirim;
    }

    public int getStatus_terima() {
        return status_terima;
    }

    public void setStatus_terima(int status_terima) {
        this.status_terima = status_terima;
    }
    
}
