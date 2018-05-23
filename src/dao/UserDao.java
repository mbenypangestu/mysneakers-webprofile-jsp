package dao;

import config.Database;
import helper.IBaseDao;
import model.User;
import model.UserModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao extends Database implements IBaseDao {
    private User        tableModel      = null;
    private List<User>  listTableModel  = null;

    public UserDao() {
        super();
        this.tableName  = "user";
    }

    @Override
    public List<User> findAll() {
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
                    User itemUser = new User();

                    this.setResultset(this.resultSet, itemUser);
                    this.listTableModel.add(itemUser);
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
    public User findById(int id) {
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return null;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "SELECT * FROM " + this.tableName + " WHERE id = " + id;
            this.resultSet  = statement.executeQuery(this.query);

            if (this.resultSet.first()) {
                this.tableModel = new User();
                this.setResultset(this.resultSet, this.tableModel);

                this.resultSet.close();
            } else return null;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return this.tableModel;
    }

    private void setResultset(ResultSet rs, User user) {
        try {
            user.setId(rs.getInt("id"));
            user.setNama(rs.getString("nama"));
            user.setUsername(rs.getString("username"));
            user.setEmail(rs.getString("email"));
            user.setPassword(rs.getString("password"));
            user.setRemember_token(rs.getString("remember_token"));
            user.setAlamat(rs.getString("alamat"));
            user.setTelp(rs.getString("telp"));
            user.setFoto(rs.getString("foto"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public boolean save() {
        boolean status = false;
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return false;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "INSERT INTO " + this.tableName + " set " +
                    "nama = '" + tableModel.getNama() + "', " +
                    "username = '" + tableModel.getUsername() + "', " +
                    "email = '" + tableModel.getEmail() + "', " +
                    "password = '" + tableModel.getPassword() + "', " +
                    "remember_token ='" + tableModel.getRemember_token() + "', " +
                    "alamat = '" + tableModel.getAlamat() + "', " +
                    "telp = '" + tableModel.getTelp() + "', " +
                    "foto = '" + tableModel.getFoto() + "'";

            if (this.statement.executeUpdate(this.query) == 1) status = true;
            else status = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        this.disconnectDb();
        return status;
    }

    @Override
    public boolean update(int id) {
        boolean status = false;
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return false;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "UPDATE " + this.tableName + " set " +
                    "nama = '" + tableModel.getNama() + "', " +
                    "username = '" + tableModel.getUsername() + "', " +
                    "email = '" + tableModel.getEmail() + "', " +
                    "password = '" + tableModel.getPassword() + "', " +
                    "remember_token ='" + tableModel.getRemember_token() + "', " +
                    "alamat = '" + tableModel.getAlamat() + "', " +
                    "telp = '" + tableModel.getTelp() + "', " +
                    "foto = '" + tableModel.getFoto() + "' " +
                    "WHERE id = " + id;

            if (this.statement.executeUpdate(this.query) == 1) status = true;
            else status = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        this.disconnectDb();
        return status;
    }

    @Override
    public boolean delete(int id) {
        boolean status = false;
        try {
            if (!isConnectionExist()) {
                showFailedConnect();
                return false;
            }

            this.statement  = this.conn.createStatement();
            this.query      = "DELETE FROM " + this.tableName + " WHERE id = " + id;

            if (this.statement.executeUpdate(this.query) == 1) status = true;
            else status = false;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        this.disconnectDb();
        return status;
    }

    public User getTableModel() {
        return tableModel;
    }

    public void setTableModel(User tableModel) {
        this.tableModel = tableModel;
    }

    public List<User> getTableModelAll() {
        return listTableModel;
    }

    public void setTableModelAll(List<User> listTableModel) {
        this.listTableModel = listTableModel;
    }
}
