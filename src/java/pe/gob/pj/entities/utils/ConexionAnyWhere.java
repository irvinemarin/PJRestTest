/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PJUDICIAL
 */
public class ConexionAnyWhere {

    //private static final String URL = "jdbc:sybase:Tds:127.0.0.1:2530/SIJ11_001_09_01";
    private final String DRIVER = "com.sybase.jdbc4.jdbc.SybDataSource";
    private Connection instance = null;

    //    public static void main(String[] args) {
    //        //cerrarConexion();
    //        getConexion("dba", "sql", "2530", "127.0.0.1", "SIJ11_001_09_01");
    //    }
    
    public Connection getConexion(String Username, String password, String puerto, String host, String DBName) {
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
