package dao;

import config.Database;
import helper.BaseDao;
import model.User;
import model.UserModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;

public class UserDao extends Database implements BaseDao {
    private User tableModel = null;

    public UserDao() {
        super();
        this.tableName  = "user";
    }

    @Override
    public void findAll() {

    }

    @Override
    public void findById(int id) {

    }

    @Override
    public void save() {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "INSERT INTO " + this.getTableName() + " set " +
                    "nama = '" + tableModel.getNama() + "', " +
                    "username = '" + tableModel.getUsername() + "', " +
                    "email = '" + tableModel.getEmail() + "', " +
                    "password = '" + tableModel.getPassword() + "', " +
                    "remember_token ='" + tableModel.getRemember_token() + "', " +
                    "alamat = '" + tableModel.getAlamat() + "', " +
                    "telp = '" + tableModel.getTelp() + "', " +
                    "foto = '" + tableModel.getFoto() + "'";

            if (this.statement.executeUpdate(this.query) == 1)
                System.out.println("Test success table : " + getTableName() + " : " + getTableModel());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(int id) {

    }

    @Override
    public void delete(int id) {

    }

    public User getTableModel() {
        return tableModel;
    }

    public void setTableModel(User tableModel) {
        this.tableModel = tableModel;
    }
}
