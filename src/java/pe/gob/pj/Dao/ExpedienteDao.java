/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.Dao;

import com.google.gson.Gson;
import pe.gob.pj.entities.Expediente;
import pe.gob.pj.entities.utils.UtilDB;

/**
 *
 * @author Irvin
 */
public class ExpedienteDao {

    private static ExpedienteDao ISNTANCE;

    public static ExpedienteDao getInstance() {
        if (ISNTANCE == null) {
            ISNTANCE = new ExpedienteDao();
        }
        return ISNTANCE;
    }

    public String getExpedienteByCode(String code) {
        Expediente exp = null;
        for (Expediente find : UtilDB.getListExpediente()) {
            String codeItem = find.getC_codigoBarras();
            if (codeItem.equals(code)) {
                exp = find;
            }
        }

        if (exp != null) {
            return new Gson().toJson(exp);
        } else {
            return "Expediente no Encontrado";
        }

    }

}
