/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities;

import java.util.List;

/**
 *
 * @author Irvin
 */
public class Expediente {

    String c_codigoBarras;                                //Tipo de recurso
    String c_recurso;                                //Tipo de recurso
    String c_proceso;                                //Tipo de Proceso
    String c_especialidad;                                //Especialidad
    String c_procedencia;                                //Distrito de Procedencia
    String f_oficio;                                //Fecha de oficio
    String c_num_oficio;                                //Número de oficio 
    int n_fojas;                                //Numero de Fojas
    String c_sumilla;                                //Texto sumilla
    String c_materia;                                //Tipo de Materia
    String f_demanda;                                //Fecha de la demanda
    String f_calificacion;                                //Fecha de calificacion
    int n_nro_exp_orig;                                //Numero expediente en sala de procedencia
    int n_ano_exp_orig;                                //Año expediente en sala de procedencia
    int n_incidente_orig;                                //Numero incidente en sala de procedencia
    String c_distrito_orig;                                //Distrito de sala de procedencia
    String c_provincia_orig;                                //Provincia de sala de procedencia
    String c_org_jurisd_orig;                                //Org juris sala procedencia
    String c_instancia_orig;                                //Instancia de sala de procedencia
    String c_tipo_resol_orig;                                //Tipo resolucion acto procesal de sala procedencia
    String c_fallo_sala;                                //Sentido fallo en sala de procedencia
    String f_resolucion_orig;                                //Fecha resolucion en sala procedencia
    int n_fojas_orig;                                //Fojas de sala procedencia
    int n_nro_exp_juz;                                //Numero expediente en juzgado origen
    int n_ano_exp_juz;                                //Año expediente en  juzgado origen
    int n_incidente_juz;                                //Numero incidente en juzgado origen
    String c_distrito_juz;                                //Distrito de  juzgado origen
    String c_provincia_juz;                                //Provincia de  juzgado origen
    String c_org_jurisd_juz;                                //Org juris  juzgado origen
    String c_instancia_juz;                                //Instancia de  juzgado origen
    String c_tipo_resol_juz;                                //Tipo resolucion acto procesal de  juzgado origen
    String c_fallo_juz;                                //Sentido fallo en  juzgado origen
    String f_resolucion_juz;                                //Fecha resolucion en  juzgado origen
    int n_fojas_juz;                                //Fojas de  juzgado origen
    List<Parte> partes;
    BaseDatos dbInfo;

    public BaseDatos getDbInfo() {
        return dbInfo;
    }

    public void setDbInfo(BaseDatos dbInfo) {
        this.dbInfo = dbInfo;
    }

   
   
    public Expediente(String c_codigoBarras,String c_recurso, String c_proceso, String c_especialidad, String c_procedencia, String f_oficio, String c_num_oficio, int n_fojas, String c_sumilla, String c_materia, String f_demanda, String f_calificacion, int n_nro_exp_orig, int n_ano_exp_orig, int n_incidente_orig, String c_distrito_orig, String c_provincia_orig, String c_org_jurisd_orig, String c_instancia_orig, String c_tipo_resol_orig, String c_fallo_sala, String f_resolucion_orig, int n_fojas_orig, int n_nro_exp_juz, int n_ano_exp_juz, int n_incidente_juz, String c_distrito_juz, String c_provincia_juz, String c_org_jurisd_juz, String c_instancia_juz, String c_tipo_resol_juz, String c_fallo_juz, String f_resolucion_juz, int n_fojas_juz) {
        this.c_codigoBarras = c_codigoBarras;
        this.c_recurso = c_recurso;
        this.c_proceso = c_proceso;
        this.c_especialidad = c_especialidad;
        this.c_procedencia = c_procedencia;
        this.f_oficio = f_oficio;
        this.c_num_oficio = c_num_oficio;
        this.n_fojas = n_fojas;
        this.c_sumilla = c_sumilla;
        this.c_materia = c_materia;
        this.f_demanda = f_demanda;
        this.f_calificacion = f_calificacion;
        this.n_nro_exp_orig = n_nro_exp_orig;
        this.n_ano_exp_orig = n_ano_exp_orig;
        this.n_incidente_orig = n_incidente_orig;
        this.c_distrito_orig = c_distrito_orig;
        this.c_provincia_orig = c_provincia_orig;
        this.c_org_jurisd_orig = c_org_jurisd_orig;
        this.c_instancia_orig = c_instancia_orig;
        this.c_tipo_resol_orig = c_tipo_resol_orig;
        this.c_fallo_sala = c_fallo_sala;
        this.f_resolucion_orig = f_resolucion_orig;
        this.n_fojas_orig = n_fojas_orig;
        this.n_nro_exp_juz = n_nro_exp_juz;
        this.n_ano_exp_juz = n_ano_exp_juz;
        this.n_incidente_juz = n_incidente_juz;
        this.c_distrito_juz = c_distrito_juz;
        this.c_provincia_juz = c_provincia_juz;
        this.c_org_jurisd_juz = c_org_jurisd_juz;
        this.c_instancia_juz = c_instancia_juz;
        this.c_tipo_resol_juz = c_tipo_resol_juz;
        this.c_fallo_juz = c_fallo_juz;
        this.f_resolucion_juz = f_resolucion_juz;
        this.n_fojas_juz = n_fojas_juz;
    }
    
     public String getC_codigoBarras() {
        return c_codigoBarras;
    }

    public void setC_codigoBarras(String c_codigoBarras) {
        this.c_codigoBarras = c_codigoBarras;
    }

    public List<Parte> getPartes() {
        return partes;
    }

    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }


    public Expediente(String c_num_oficio) {
        this.c_num_oficio = c_num_oficio;
    }

    public String getC_recurso() {
        return c_recurso;
    }

    public void setC_recurso(String c_recurso) {
        this.c_recurso = c_recurso;
    }

    public String getC_proceso() {
        return c_proceso;
    }

    public void setC_proceso(String c_proceso) {
        this.c_proceso = c_proceso;
    }

    public String getC_especialidad() {
        return c_especialidad;
    }

    public void setC_especialidad(String c_especialidad) {
        this.c_especialidad = c_especialidad;
    }

    public String getC_procedencia() {
        return c_procedencia;
    }

    public void setC_procedencia(String c_procedencia) {
        this.c_procedencia = c_procedencia;
    }

    public String getF_oficio() {
        return f_oficio;
    }

    public void setF_oficio(String f_oficio) {
        this.f_oficio = f_oficio;
    }

    public String getC_num_oficio() {
        return c_num_oficio;
    }

    public void setC_num_oficio(String c_num_oficio) {
        this.c_num_oficio = c_num_oficio;
    }

    public int getN_fojas() {
        return n_fojas;
    }

    public void setN_fojas(int n_fojas) {
        this.n_fojas = n_fojas;
    }

    public String getC_sumilla() {
        return c_sumilla;
    }

    public void setC_sumilla(String c_sumilla) {
        this.c_sumilla = c_sumilla;
    }

    public String getC_materia() {
        return c_materia;
    }

    public void setC_materia(String c_materia) {
        this.c_materia = c_materia;
    }

    public String getF_demanda() {
        return f_demanda;
    }

    public void setF_demanda(String f_demanda) {
        this.f_demanda = f_demanda;
    }

    public String getF_calificacion() {
        return f_calificacion;
    }

    public void setF_calificacion(String f_calificacion) {
        this.f_calificacion = f_calificacion;
    }

    public int getN_nro_exp_orig() {
        return n_nro_exp_orig;
    }

    public void setN_nro_exp_orig(int n_nro_exp_orig) {
        this.n_nro_exp_orig = n_nro_exp_orig;
    }

    public int getN_ano_exp_orig() {
        return n_ano_exp_orig;
    }

    public void setN_ano_exp_orig(int n_ano_exp_orig) {
        this.n_ano_exp_orig = n_ano_exp_orig;
    }

    public int getN_incidente_orig() {
        return n_incidente_orig;
    }

    public void setN_incidente_orig(int n_incidente_orig) {
        this.n_incidente_orig = n_incidente_orig;
    }

    public String getC_distrito_orig() {
        return c_distrito_orig;
    }

    public void setC_distrito_orig(String c_distrito_orig) {
        this.c_distrito_orig = c_distrito_orig;
    }

    public String getC_provincia_orig() {
        return c_provincia_orig;
    }

    public void setC_provincia_orig(String c_provincia_orig) {
        this.c_provincia_orig = c_provincia_orig;
    }

    public String getC_org_jurisd_orig() {
        return c_org_jurisd_orig;
    }

    public void setC_org_jurisd_orig(String c_org_jurisd_orig) {
        this.c_org_jurisd_orig = c_org_jurisd_orig;
    }

    public String getC_instancia_orig() {
        return c_instancia_orig;
    }

    public void setC_instancia_orig(String c_instancia_orig) {
        this.c_instancia_orig = c_instancia_orig;
    }

    public String getC_tipo_resol_orig() {
        return c_tipo_resol_orig;
    }

    public void setC_tipo_resol_orig(String c_tipo_resol_orig) {
        this.c_tipo_resol_orig = c_tipo_resol_orig;
    }

    public String getC_fallo_sala() {
        return c_fallo_sala;
    }

    public void setC_fallo_sala(String c_fallo_sala) {
        this.c_fallo_sala = c_fallo_sala;
    }

    public String getF_resolucion_orig() {
        return f_resolucion_orig;
    }

    public void setF_resolucion_orig(String f_resolucion_orig) {
        this.f_resolucion_orig = f_resolucion_orig;
    }

    public int getN_fojas_orig() {
        return n_fojas_orig;
    }

    public void setN_fojas_orig(int n_fojas_orig) {
        this.n_fojas_orig = n_fojas_orig;
    }

    public int getN_nro_exp_juz() {
        return n_nro_exp_juz;
    }

    public void setN_nro_exp_juz(int n_nro_exp_juz) {
        this.n_nro_exp_juz = n_nro_exp_juz;
    }

    public int getN_ano_exp_juz() {
        return n_ano_exp_juz;
    }

    public void setN_ano_exp_juz(int n_ano_exp_juz) {
        this.n_ano_exp_juz = n_ano_exp_juz;
    }

    public int getN_incidente_juz() {
        return n_incidente_juz;
    }

    public void setN_incidente_juz(int n_incidente_juz) {
        this.n_incidente_juz = n_incidente_juz;
    }

    public String getC_distrito_juz() {
        return c_distrito_juz;
    }

    public void setC_distrito_juz(String c_distrito_juz) {
        this.c_distrito_juz = c_distrito_juz;
    }

    public String getC_provincia_juz() {
        return c_provincia_juz;
    }

    public void setC_provincia_juz(String c_provincia_juz) {
        this.c_provincia_juz = c_provincia_juz;
    }

    public String getC_org_jurisd_juz() {
        return c_org_jurisd_juz;
    }

    public void setC_org_jurisd_juz(String c_org_jurisd_juz) {
        this.c_org_jurisd_juz = c_org_jurisd_juz;
    }

    public String getC_instancia_juz() {
        return c_instancia_juz;
    }

    public void setC_instancia_juz(String c_instancia_juz) {
        this.c_instancia_juz = c_instancia_juz;
    }

    public String getC_tipo_resol_juz() {
        return c_tipo_resol_juz;
    }

    public void setC_tipo_resol_juz(String c_tipo_resol_juz) {
        this.c_tipo_resol_juz = c_tipo_resol_juz;
    }

    public String getC_fallo_juz() {
        return c_fallo_juz;
    }

    public void setC_fallo_juz(String c_fallo_juz) {
        this.c_fallo_juz = c_fallo_juz;
    }

    public String getF_resolucion_juz() {
        return f_resolucion_juz;
    }

    public void setF_resolucion_juz(String f_resolucion_juz) {
        this.f_resolucion_juz = f_resolucion_juz;
    }

    public int getN_fojas_juz() {
        return n_fojas_juz;
    }

    public void setN_fojas_juz(int n_fojas_juz) {
        this.n_fojas_juz = n_fojas_juz;
    }

}
