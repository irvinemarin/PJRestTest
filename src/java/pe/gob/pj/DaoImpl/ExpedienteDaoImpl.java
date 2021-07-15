/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.DaoImpl;

import com.google.gson.Gson;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
import pe.gob.pj.Dao.ExpedienteDao;
import pe.gob.pj.entities.BaseDatos;
import pe.gob.pj.entities.Expediente;
import pe.gob.pj.entities.Parte;
import pe.gob.pj.entities.utils.ConexionAnyWhere;
import pe.gob.pj.entities.utils.ConexionMySQL;
import pe.gob.pj.entities.utils.ConexionOracle;

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

//        if (exp != null) {
//            //exp.setPartes(getPartesDB(code));
//            System.out.println("Distrito nombre : " + exp.getC_distrito_juz());
//            exp.setDbInfo(getDBData(exp.getC_distrito_juz()));
//
//            return new Gson().toJson(exp);
//        } else {
//            return "Expediente no Encontrado";
//        }
        BaseDatos resultDistrito = getDBData("LIMA NORTE");

        if (resultDistrito != null) {
            exp = getExpedienteDB(code, resultDistrito.getX_USUARIO(), resultDistrito.getX_CLAVE(), resultDistrito.getN_PUERTO(), resultDistrito.getX_HOST(), resultDistrito.getX_NOM_BASE());
            exp.setPartes(getPartesDB(code, resultDistrito.getX_USUARIO(), resultDistrito.getX_CLAVE(), resultDistrito.getN_PUERTO(), resultDistrito.getX_HOST(), resultDistrito.getX_NOM_BASE()));
            exp.setDbInfo(resultDistrito);
            return new Gson().toJson(exp);
        } else {
            return "Expediente no encontrado";
        }

    }

    private BaseDatos getDBData(String c_distrito_juz) {
        BaseDatos dbInformaction = null;

        //adfadf
        try {
            cx = ConexionMySQL.getInstanceConexion();
            String SQL = "Select bds.* "
                    + "from mae_base_datos bds  "
                    + "INNER JOIN mae_dis_judicial dj on bds.N_ID_DISTRITO=dj.N_ID_DISTRITO "
                    + "where X_NOM_DISTRITO= '" + c_distrito_juz + "'";// + c_distrito_juz + "' ";

            ps = cx.prepareStatement(SQL);
            rs = ps.executeQuery();
            System.out.println(ps.toString());
            while (rs.next()) {

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

        }
        return dbInformaction;

    }

    /**
     * Execute the stored procedure
     *
     * @param price price parameter for stored procedure
     */
    private Expediente getExpedienteDB(String pUnico, String x_usuario, String x_clave, String n_puerto, String x_host, String x_nom_base) {

        Expediente exp = null;
        try {

            //String query = "{ ? = call  sp_getexpediente(?) }";
            String query = "exec DBA.usp_expediente_barra('" + pUnico + "');";

            //ps = cx.prepareStatement(query);
            //rs = ps.executeQuery(query);
            // print the results
            // Build the query
            cx = ConexionAnyWhere.getConexion(x_usuario, x_clave, n_puerto, x_host, x_nom_base);

            Statement stmt = cx.createStatement();
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                exp = new Expediente();
                exp.setC_codigoBarras(rs.getString("c_barra"));
                exp.setC_recurso(rs.getString("c_recurso"));
                exp.setC_proceso(rs.getString("c_proceso"));
                exp.setC_especialidad(rs.getString("c_especialidad"));
                exp.setC_procedencia(rs.getString("c_procedencia"));
                exp.setF_oficio(rs.getString("f_oficio"));
                exp.setC_num_oficio(rs.getString("c_num_oficio"));
                exp.setC_sumilla(rs.getString("c_sumilla"));
                exp.setC_materia(rs.getString("c_materia"));
                exp.setF_demanda(rs.getString("f_demanda"));
                exp.setF_calificacion(rs.getString("f_calificacion"));
                exp.setN_nro_exp_orig(rs.getInt("n_nro_exp_orig"));
                exp.setN_ano_exp_orig(rs.getInt("n_ano_exp_orig"));
                exp.setN_incidente_orig(rs.getInt("n_incidente_orig"));
                exp.setC_distrito_orig(rs.getString("c_distrito_orig"));
                exp.setC_provincia_orig(rs.getString("c_provincia_orig"));
                exp.setC_instancia_orig(rs.getString("c_instancia_orig"));
                exp.setC_tipo_resol_orig(rs.getString("c_tipo_resol_orig"));
                exp.setC_fallo_sala(rs.getString("c_fallo_sala"));
                exp.setF_resolucion_orig(rs.getString("f_resolucion_orig"));
                exp.setN_fojas_orig(rs.getInt("n_fojas_orig"));
                exp.setN_nro_exp_juz(rs.getInt("n_nro_exp_juz"));
                exp.setN_incidente_juz(rs.getInt("n_incidente_juz"));
                exp.setC_distrito_juz(rs.getString("c_distrito_juz"));
                exp.setC_provincia_juz(rs.getString("c_provincia_juz"));
                exp.setC_org_jurisd_juz(rs.getString("c_org_jurisd_juz"));
                exp.setC_instancia_juz(rs.getString("c_instancia_juz"));
                exp.setC_tipo_resol_juz(rs.getString("c_tipo_resol_juz"));
                exp.setC_fallo_juz(rs.getString("c_fallo_juz"));
                exp.setF_resolucion_juz(rs.getString("f_resolucion_juz"));
                exp.setN_fojas_juz(rs.getInt("n_fojas_juz"));
            }

            rs.close();

            //ConexionOracle.cerrarConexion();
        } catch (SQLException ex) {
            
            Logger.getLogger(ExpedienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return exp;
    }

    private List<Parte> getPartesDB(String pUnico, String x_usuario, String x_clave, String n_puerto, String x_host, String x_nom_base) {
        Statement stmt;
        List<Parte> list = null;
        try {
            //String query = "{ ? = call  sp_getPartes(?) }";

            String query = "exec DBA.DBA.usp_parte_barra('" + pUnico + "');";
            cx = ConexionAnyWhere.getConexion(x_usuario, x_clave, n_puerto, x_host, x_nom_base);

            stmt = cx.createStatement();
            rs = stmt.executeQuery(query);

            list = new ArrayList<>();

            while (rs.next()) {
                Parte exp = new Parte();
                exp.setC_barra(rs.getString("c_barra"));
                exp.setC_tipo_parte(rs.getString("c_tipo_parte"));
                exp.setC_tipo_persona(rs.getString("c_tipo_persona"));
                exp.setC_tipo_doc(rs.getString("c_tipo_doc"));
                exp.setX_doc_id(rs.getString("x_doc_id"));
                exp.setX_ape_paterno(rs.getString("x_ape_paterno"));
                exp.setX_ape_materno(rs.getString("x_ape_materno"));
                exp.setX_nombres(rs.getString("x_nombres"));
                exp.setX_razon_social(rs.getString("x_razon_social"));
                exp.setF_nacimiento(rs.getString("f_nacimiento"));
                exp.setC_recurrente(rs.getString("c_recurrente"));
                list.add(exp);
            }

            rs.close();
            stmt.close();
            //ConexionOracle.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ExpedienteDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
