/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities.utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PJUDICIAL
 */
public class ConexionAnyWhere {

    private static final String DRIVER = "com.sybase.jdbc4.jdbc.SybDataSource";
    private static Connection instance = null;

//    public static void main(String[] args) {
//        getConexion("dba", "sql");
//    }
    public static Connection getConexion(String Username, String password, String puerto, String host, String DBName) {
        String URL = "jdbc:sybase:Tds:" + host + ":" + puerto + "/" + DBName;
        try {
            Class.forName(DRIVER);
            if (instance == null) {
                instance = DriverManager.getConnection(URL, Username, password);
            }
            System.out.println("connected  ");

        } catch (ClassNotFoundException e) {
            System.out.println("Error: conections  " + e.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ConexionAnyWhere.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }

    public void cerrarConexion() {
        try {
            instance.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionAnyWhere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
