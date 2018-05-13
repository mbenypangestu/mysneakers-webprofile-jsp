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
public class PromoProduk {
    int id;
    int produk_id;
    int diskon;
    double harga_promo;

    public PromoProduk(int id, int produk_id, int diskon, double harga_promo) {
        this.id = id;
        this.produk_id = produk_id;
        this.diskon = diskon;
        this.harga_promo = harga_promo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProduk_id() {
        return produk_id;
    }

    public void setProduk_id(int produk_id) {
        this.produk_id = produk_id;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public double getHarga_promo() {
        return harga_promo;
    }

    public void setHarga_promo(double harga_promo) {
        this.harga_promo = harga_promo;
    }
    
}
