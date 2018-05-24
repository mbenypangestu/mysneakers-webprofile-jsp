package controller;

import dao.ProdukDao;
import model.Produk;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProdukController {
    public boolean addProduk(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        int brand_id    = Integer.parseInt(request.getParameter("brand_id"));
        int jenis_id    = Integer.parseInt(request.getParameter("jenis_id"));
        String nama     = request.getParameter("nama");
        String deskripsi= request.getParameter("deskripsi");
        String bahan    = request.getParameter("bahan");
        double harga    = Double.parseDouble(request.getParameter("harga"));
        int stok        = Integer.parseInt(request.getParameter("stok"));
//        String gambar   = request.getParameter("gambar");

        ProdukDao produkDao     = new ProdukDao();
        Produk produk           = new Produk();

        produk.setBrand_id(brand_id);
        produk.setJenis_id(jenis_id);
        produk.setNama(nama);
        produk.setDeskripsi(deskripsi);
        produk.setBahan(bahan);
        produk.setHarga(harga);
        produk.setStok(stok);
//        produk.setGambar(gambar);

        produkDao.setTableModel(produk);

        if(produkDao.save()) return true;
        else return false;
    }

    public boolean editProduk(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        int id          = Integer.parseInt(request.getParameter("id"));
        int brand_id    = Integer.parseInt(request.getParameter("brand_id"));
        int jenis_id    = Integer.parseInt(request.getParameter("jenis_id"));
        String nama     = request.getParameter("nama");
        String deskripsi= request.getParameter("deskripsi");
        String bahan    = request.getParameter("bahan");
        double harga    = Double.parseDouble(request.getParameter("harga"));
        int stok        = Integer.parseInt(request.getParameter("stok"));
//        String gambar   = request.getParameter("gambar");

        ProdukDao produkDao     = new ProdukDao();
        Produk produk           = new Produk();

        produk.setBrand_id(brand_id);
        produk.setJenis_id(jenis_id);
        produk.setNama(nama);
        produk.setDeskripsi(deskripsi);
        produk.setBahan(bahan);
        produk.setHarga(harga);
        produk.setStok(stok);
//        produk.setGambar(gambar);

        produkDao.setTableModel(produk);

        if(produkDao.update(id)) return true;
        else return false;
    }

    public boolean deleteProduk(HttpServletRequest request, HttpServletResponse response) throws ServletException {
        int id          = Integer.parseInt(request.getParameter("id"));

        ProdukDao produkDao     = new ProdukDao();
        if(produkDao.delete(id)) return true;
        else return false;
    }

    public boolean addProduk(int brand_id, int jenis_id, String nama, String deskripsi,
                             String bahan, double harga, int stok, String gambar) {

        ProdukDao produkDao     = new ProdukDao();
        Produk produk           = new Produk();

        produk.setBrand_id(brand_id);
        produk.setJenis_id(jenis_id);
        produk.setNama(nama);
        produk.setDeskripsi(deskripsi);
        produk.setBahan(bahan);
        produk.setHarga(harga);
        produk.setStok(stok);
        produk.setGambar(gambar);

        produkDao.setTableModel(produk);

        if(produkDao.save()) return true;
        else return false;
    }
}
