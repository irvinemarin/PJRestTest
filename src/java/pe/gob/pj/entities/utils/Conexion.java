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
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/db_mpartes";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection instance = null;

//    public static void main(String[] args) {
//        getInstanceConexion();
//    }

    public static Connection getInstanceConexion() {
        try {
            Class.forName(DRIVER);
            if (instance == null) {
                instance = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("Connection");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: conections  " + e.getMessage());
        }
        return instance;
    }

    public void cerrarConexion() {
        try {
            instance.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
