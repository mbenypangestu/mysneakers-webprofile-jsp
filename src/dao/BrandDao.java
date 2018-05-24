package dao;

import config.Database;
import helper.IBaseDao;
import model.Brand;
import model.Produk;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BrandDao extends Database implements IBaseDao {
    private Brand tableModel               = null;
    private List<Brand> listTableModel     = null;

    public BrandDao() {
        super();
        this.tableName  = "brand";
    }

    @Override
    public List<Brand> findAll() {
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
                    Brand itemBrand = new Brand();

                    this.setResultset(this.resultSet, itemBrand);
                    this.listTableModel.add(itemBrand);
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
    public Brand findById(int id) {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return null;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "SELECT * FROM " + this.tableName + " WHERE id = " + id;
            this.resultSet  = statement.executeQuery(this.query);

            if (this.resultSet.first()) {
                this.tableModel = new Brand();
                this.setResultset(this.resultSet, this.tableModel);

                this.resultSet.close();
            } else return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return this.tableModel;
    }

    private void setResultset(ResultSet rs, Brand brand) {
        try {
            brand.setId(rs.getInt("id"));
            brand.setNama(rs.getString("nama"));
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

    public Brand getTableModel() {
        return tableModel;
    }

    public void setTableModel(Brand tableModel) {
        this.tableModel = tableModel;
    }

    public List<Brand> getListTableModel() {
        return listTableModel;
    }

    public void setListTableModel(List<Brand> listTableModel) {
        this.listTableModel = listTableModel;
    }
}
