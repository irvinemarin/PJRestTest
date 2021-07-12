/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities.utils;

import java.util.ArrayList;
import java.util.List;
import pe.gob.pj.entities.Expediente;
import pe.gob.pj.entities.Parte;

/**
 *
 * @author Irvin
 */
public class UtilDB {

    public static List<Expediente> getListExpediente() {

        List<Expediente> list = new ArrayList<>();

        Expediente epx1 = new Expediente("1002020012302221", "CASACION", "ORDINARIO LABORAL", "LABORAL", "CSJ CUSCO", "43809", "1289-2019", 53, "REMITASE A SALA", "PAGO DE REINTEGRO DE BONO JURISDICCIONAL", "12/11/2019", "12/11/2019", 1094, 2018, 0, "CUSCO", "CUSCO", "SALA SUPERIOR", "1 SALA LABORAL", "SENTENCIA DE VISTA", "CONFIRMARON SENTENCIA", "12/11/2019", 231, 1094, 2018, 0, "CUSCO", "CUSCO", "JUZGADO ESPECIALIZADO", "4 JUZGADO DE TRABAJO DEL CUSCO", "SENTENCIA", "FUNDADA EN PARTE LA DEMANDA", "12/11/2019", 129);
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
