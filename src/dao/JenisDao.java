package dao;

import config.Database;
import helper.IBaseDao;
import model.Brand;
import model.Jenis;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JenisDao extends Database implements IBaseDao {
    private Jenis tableModel               = null;
    private List<Jenis> listTableModel     = null;

    public JenisDao() {
        super();
        this.tableName  = "jenis";
    }

    @Override
    public List<Jenis> findAll() {
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
                    Jenis itemJenis = new Jenis();

                    this.setResultset(this.resultSet, itemJenis);
                    this.listTableModel.add(itemJenis);
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
    public Jenis findById(int id) {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return null;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "SELECT * FROM " + this.tableName + " WHERE id = " + id;
            this.resultSet  = statement.executeQuery(this.query);

            if (this.resultSet.first()) {
                this.tableModel = new Jenis();
                this.setResultset(this.resultSet, this.tableModel);

                this.resultSet.close();
            } else return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return this.tableModel;
    }

    private void setResultset(ResultSet rs, Jenis jenis) {
        try {
            jenis.setId(rs.getInt("id"));
            jenis.setJenis(rs.getString("jenis"));
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
