/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.DaoImpl;

import com.google.gson.Gson;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import pe.gob.pj.Dao.ExpedienteDao;
import pe.gob.pj.entities.BaseDatos;
import pe.gob.pj.entities.Expediente;
import pe.gob.pj.entities.utils.ConexionMySQL;
import pe.gob.pj.entities.utils.UtilDB;

/**
 *
 * @author Irvin
 */
public class ExpedienteDaoImpl implements ExpedienteDao {

    private static ExpedienteDaoImpl ISNTANCE;
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection cx;

    public static ExpedienteDaoImpl getInstance() {
        if (ISNTANCE == null) {
            ISNTANCE = new ExpedienteDaoImpl();
        }
        return ISNTANCE;
    }

    public ExpedienteDaoImpl() {
        //cx = Conexion.getInstanceConexion();
    }

    @Override
    public String getExpedienteByCode(String code) {
        Expediente exp = null;
        for (Expediente find : UtilDB.getListExpediente()) {
            String codeItem = find.getC_codigoBarras();
            if (codeItem.equals(code)) {
                exp = find;
            }
        }
        if (exp != null) {
            System.out.println("Distrito nombre : " + exp.getC_distrito_juz());
            exp.setDbInfo(getDBData(exp.getC_distrito_juz()));

            return new Gson().toJson(exp);
        } else {
            return "Expediente no Encontrado";
        }

    }

    private BaseDatos getDBData(String c_distrito_juz) {
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
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            result = e.toString();
        }
        return dbInformaction;

    }

}
