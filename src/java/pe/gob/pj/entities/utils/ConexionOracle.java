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
 * @author Irvin
 */
public class ConexionOracle {

    public ConexionOracle() {
    }

    public static void main(String[] args) {
        getConnection();
    }

    private static Connection instance = null;

    public static Connection getConnection() {
        try {
            // METHOD #2
            String dbURL2 = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "dev";
            String password = "1234";
            String DRIVER = "oracle.jdbc.OracleDriver";
            Class.forName(DRIVER);
            if (instance == null) {
                instance = DriverManager.getConnection(dbURL2, username, password);
                System.out.println("Connected with connection #2");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ConexionOracle.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionOracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return instance;
    }

    public static void cerrarConexion() {
        try {
            instance.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
