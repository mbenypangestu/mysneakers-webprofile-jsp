/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class Database {
    private static final String  DRIVER      = "com.mysql.jdbc.Driver";    
    private static final String  HOST        = "localhost";
    private static final String  DB_NAME     = "mysneakersby";
    private static final String  USER        = "root";
    private static final String  PASS        = "";
    
    private static final String  DB_URL      = "jdbc:mysql://" + HOST + ":3306/" + DB_NAME;
    
    public static Connection connect() throws SQLException, ClassCastException, Exception {        
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(DRIVER, USER, PASS);
        
        return conn;
    }
}
