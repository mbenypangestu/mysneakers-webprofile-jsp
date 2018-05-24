package dao;

import config.Database;
import helper.IBaseDao;
import model.Produk;
import model.User;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdukDao extends Database implements IBaseDao {
    private Produk tableModel               = null;
    private List<Produk> listTableModel     = null;

    public ProdukDao() {
        super();
        this.tableName  = "produk";
    }

    @Override
    public List<Produk> findAll() {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return null;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "SELECT * FROM " + this.tableName;
            this.resultSet  = statement.executeQuery(this.query);

            if (!this.resultSet.wasNull()) {
                this.listTableModel = new ArrayList<>();
                while (this.resultSet.next()) {
                    Produk itemProduk = new Produk();

                    this.setResultset(this.resultSet, itemProduk);
                    this.listTableModel.add(itemProduk);
                }

                this.resultSet.close();
            } else return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }

        return this.listTableModel;
    }

    @Override
    public Produk findById(int id) {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return null;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "SELECT * FROM " + this.tableName + " WHERE id = " + id;
            this.resultSet  = statement.executeQuery(this.query);

            if (this.resultSet.first()) {
                this.tableModel = new Produk();
                this.setResultset(this.resultSet, this.tableModel);

                this.resultSet.close();
            } else return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return this.tableModel;
    }

    private void setResultset(ResultSet rs, Produk produk) {
        try {
            produk.setId(rs.getInt("id"));
            produk.setBrand_id(rs.getInt("brand_id"));
            produk.setJenis_id(rs.getInt("jenis_id"));
            produk.setNama(rs.getString("nama"));
            produk.setDeskripsi(rs.getString("deskripsi"));
            produk.setBahan(rs.getString("bahan"));
            produk.setHarga(rs.getDouble("harga"));
            produk.setStok(rs.getInt("stok"));
            produk.setGambar(rs.getString("gambar"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean save() {
        return false;
    }

    @Override
    public boolean update(int id) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
