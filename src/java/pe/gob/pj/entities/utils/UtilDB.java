/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import pe.gob.pj.entities.BaseDatos;
import pe.gob.pj.entities.Expediente;
import pe.gob.pj.entities.Parte;

/**
 *
 * @author Irvin
 */
public class UtilDB {

    private static PreparedStatement ps;
    private static ResultSet rs;
    private static Connection cx;

    public static void main(String[] args) {
        getDBData("10");
    }

    private static String getDBData(String c_distrito_juz) {
        BaseDatos dbInformaction = null;
        String result = "";
        //adfadf
        try {
            cx = ConexionMySQL.getInstanceConexion();
            String SQL = "Select bds.* "
                    + "from mae_base_datos bds  "
                    + "INNER JOIN mae_dis_judicial dj on bds.N_ID_DISTRITO=dj.N_ID_DISTRITO "
                    + "where X_NOM_DISTRITO= '" + c_distrito_juz + "' ";

            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            System.out.println(ps.toString());

            while (rs.next()) {
                result = "1";
                dbInformaction = new BaseDatos();
                dbInformaction.setN_ID_DISTRITO(rs.getInt("N_ID_DISTRITO"));
                dbInformaction.setN_SECUENCIAL(rs.getString("N_SECUENCIAL"));
                dbInformaction.setX_USUARIO(rs.getString("X_USUARIO"));
                dbInformaction.setX_CLAVE(rs.getString("X_CLAVE"));
                dbInformaction.setL_IND_TIPO_CONEXION(rs.getString("L_IND_TIPO_CONEXION"));
                dbInformaction.setX_NOM_CORTE(rs.getString("X_NOM_CORTE"));
                dbInformaction.setX_NOM_SERVICIO(rs.getString("X_NOM_SERVICIO"));
                dbInformaction.setX_NOM_BASE(rs.getString("X_NOM_BASE"));
                dbInformaction.setX_NOM_ODBC(rs.getString("X_NOM_ODBC"));
                dbInformaction.setN_PUERTO(rs.getString("N_PUERTO"));
                dbInformaction.setX_HOST(rs.getString("X_HOST"));

                System.out.println(" asd : " + rs.getInt("N_ID_DISTRITO"));
            }

            ps.close();
            rs.close();

        } catch (SQLException e) {
            System.out.println("Error: " + e);
            result = e.toString();
        }

        return "succes";
    }

    public static List<Expediente> getListExpediente() {

        List<Expediente> list = new ArrayList<>();

        Expediente epx1 = new Expediente("1002020012302221", "CASACION", "ORDINARIO LABORAL", "LABORAL", "CSJ CUSCO", "43809", "1289-2019", 53, "REMITASE A SALA", "PAGO DE REINTEGRO DE BONO JURISDICCIONAL", "12/11/2019", "12/11/2019", 1094, 2018, 0, "LIMA NORTE", "LIMA NORTE", "SALA SUPERIOR", "1 SALA LABORAL", "SENTENCIA DE VISTA", "CONFIRMARON SENTENCIA", "12/11/2019", 231, 1094, 2018, 0, "LIMA NORTE", "LIMA NORTE", "JUZGADO ESPECIALIZADO", "4 JUZGADO DE TRABAJO DEL CUSCO", "SENTENCIA", "FUNDADA EN PARTE LA DEMANDA", "12/11/2019", 129);
        epx1.setPartes(getListParte());
        list.add(epx1);
        list.add(new Expediente("1002020012302222", "CASACION", "ORDINARIO LABORAL", "LABORAL", "CSJ CUSCO", "43809", "128987-2019", 53, "REMITASE A SALA", "PAGO DE REINTEGRO DE BONO JURISDICCIONAL", "12/11/2019", "12/11/2019", 1094, 2018, 0, "CUSCO", "CUSCO", "SALA SUPERIOR", "1 SALA LABORAL", "SENTENCIA DE VISTA", "CONFIRMARON SENTENCIA", "12/11/2019", 231, 1094, 2018, 0, "CUSCO", "CUSCO", "JUZGADO ESPECIALIZADO", "4 JUZGADO DE TRABAJO DEL CUSCO", "SENTENCIA", "FUNDADA EN PARTE LA DEMANDA", "12/11/2019", 129));

        return list;
    }

    public static List<Parte> getListParte() {
        List<Parte> list = new ArrayList<>();
        list.add(new Parte("DEMANDANTE", "NATURAL", "DNI", "92828222", "CHAVEZ", "LUDEÑA", "PEDRO ANTONIO", "", "24/9/1981", "NO"));
        list.add(new Parte("DEMANDADO", "JURIDICA ESTATAL", "", "", "", "", " ", "EMPRESA PATROL", "24/9/1981", "SI"));

        return list;
    }
}
