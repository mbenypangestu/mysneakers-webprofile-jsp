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
public class Database {
    private static final String  DRIVER     = "com.mysql.jdbc.Driver";
    private static final String  HOST       = "localhost";
    private static final String  DB_NAME    = "mysneakersby";
    private static final String  USER       = "mygetzu";
    private static final String  PASS       = "P@ssw0rd|mysql";
    
    private static final String  DB_URL     = "jdbc:mysql://" + HOST + ":3306/" + DB_NAME;

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
        System.out.println("Sorry, Connection Failed !");
    }

    public void showSaveSucceded() {
        System.out.println("Success saving data !");
    }

    public void showSaveFailed() {
        System.out.println("Failed saving data !");
    }

    public void showEditSucceded() {
        System.out.println("Success editing data !");
    }

    public void showEditFailed() {
        System.out.println("Failed editing data !");
    }

    public void showDeleteSucceded() {
        System.out.println("Success deleting data !");
    }

    public void showDeleteFailed() {
        System.out.println("Failed deleting data !");
    }
}
