/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities;

/**
 *
 * @author Irvin
 */
public class Parte {

    String c_tipo_parte;                                //Tipo Parte
    String c_tipo_persona;                                //Tipo Persona
    String c_tipo_doc;                                //Tipo de Documento
    String x_doc_id;                                //Documento de Identidad
    String x_ape_paterno;                                //Apellido paterno
    String x_ape_materno;                                //Apellido Materno
    String x_nombres;                                //Nombres 
    String x_razon_social;                                //Razon social
    String f_nacimiento;                                //fecha de Nacimiento
    String c_recurrente;                                //Parte si es Recurrente

    public Parte() {
    }

    public Parte(String c_tipo_parte, String c_tipo_persona, String c_tipo_doc, String x_doc_id, String x_ape_paterno, String x_ape_materno, String x_nombres, String x_razon_social, String f_nacimiento, String c_recurrente) {
        this.c_tipo_parte = c_tipo_parte;
        this.c_tipo_persona = c_tipo_persona;
        this.c_tipo_doc = c_tipo_doc;
        this.x_doc_id = x_doc_id;
        this.x_ape_paterno = x_ape_paterno;
        this.x_ape_materno = x_ape_materno;
        this.x_nombres = x_nombres;
        this.x_razon_social = x_razon_social;
        this.f_nacimiento = f_nacimiento;
        this.c_recurrente = c_recurrente;
    }

    public String getC_tipo_parte() {
        return c_tipo_parte;
    }

    public void setC_tipo_parte(String c_tipo_parte) {
        this.c_tipo_parte = c_tipo_parte;
    }

    public String getC_tipo_persona() {
        return c_tipo_persona;
    }

    public void setC_tipo_persona(String c_tipo_persona) {
        this.c_tipo_persona = c_tipo_persona;
    }

    public String getC_tipo_doc() {
        return c_tipo_doc;
    }

    public void setC_tipo_doc(String c_tipo_doc) {
        this.c_tipo_doc = c_tipo_doc;
    }

    public String getX_doc_id() {
        return x_doc_id;
    }

    public void setX_doc_id(String x_doc_id) {
        this.x_doc_id = x_doc_id;
    }

    public String getX_ape_paterno() {
        return x_ape_paterno;
    }

    public void setX_ape_paterno(String x_ape_paterno) {
        this.x_ape_paterno = x_ape_paterno;
    }

    public String getX_ape_materno() {
        return x_ape_materno;
    }

    public void setX_ape_materno(String x_ape_materno) {
        this.x_ape_materno = x_ape_materno;
    }

    public String getX_nombres() {
        return x_nombres;
    }

    public void setX_nombres(String x_nombres) {
        this.x_nombres = x_nombres;
    }

    public String getX_razon_social() {
        return x_razon_social;
    }

    public void setX_razon_social(String x_razon_social) {
        this.x_razon_social = x_razon_social;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public String getC_recurrente() {
        return c_recurrente;
    }

    public void setC_recurrente(String c_recurrente) {
        this.c_recurrente = c_recurrente;
    }

   

    
    
}
