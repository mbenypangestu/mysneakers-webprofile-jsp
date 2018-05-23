/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import javax.security.sasl.SaslServer;
import java.sql.*;

/**
 *
 * @author dell
 */
public class Database extends Variable {

    protected Connection conn               = null;
    protected Statement statement           = null;
    protected ResultSet resultSet           = null;
    protected String query                  = null;
    protected String tableName              = null;

    public Database() {
        this.connectDb();
    }

    public void connectDb() {
        try {
            Class.forName(DRIVER);
            this.conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connection Opened !");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void disconnectDb() {
        try {
            if (this.conn != null) this.conn.close();
            System.out.println("Connection Closed !");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean isConnectionExist() {
        if (this.conn != null)
            return true;
        return false;
    }

    public void showFailedConnect() {
        System.out.println(CONNECT_SUCCESS);
    }

    public void showSaveSucceded() {
        System.out.println(SAVE_SUCCESS);
    }

    public void showSaveFailed() {
        System.out.println(SAVE_FAILED);
    }

    public void showEditSucceded() {
        System.out.println(EDIT_SUCCESS);
    }

    public void showEditFailed() {
        System.out.println(EDIT_FAILED);
    }

    public void showDeleteSucceded() {
        System.out.println(DELETE_SUCCESS);
    }

    public void showDeleteFailed() {
        System.out.println(DELETE_FAILED);
    }
}
