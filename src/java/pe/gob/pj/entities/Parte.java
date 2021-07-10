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

    int c_tipo_parte;                                //Tipo Parte
    int c_tipo_persona;                                //Tipo Persona
    int c_tipo_doc;                                //Tipo de Documento
    int x_doc_id;                                //Documento de Identidad
    int x_ape_paterno;                                //Apellido paterno
    int x_ape_materno;                                //Apellido Materno
    int x_nombres;                                //Nombres 
    int x_razon_social;                                //Razon social
    String f_nacimiento;                                //fecha de Nacimiento
    int c_recurrente;                                //Parte si es Recurrente

    public Parte() {
    }

    public int getC_tipo_parte() {
        return c_tipo_parte;
    }

    public void setC_tipo_parte(int c_tipo_parte) {
        this.c_tipo_parte = c_tipo_parte;
    }

    public int getC_tipo_persona() {
        return c_tipo_persona;
    }

    public void setC_tipo_persona(int c_tipo_persona) {
        this.c_tipo_persona = c_tipo_persona;
    }

    public int getC_tipo_doc() {
        return c_tipo_doc;
    }

    public void setC_tipo_doc(int c_tipo_doc) {
        this.c_tipo_doc = c_tipo_doc;
    }

    public int getX_doc_id() {
        return x_doc_id;
    }

    public void setX_doc_id(int x_doc_id) {
        this.x_doc_id = x_doc_id;
    }

    public int getX_ape_paterno() {
        return x_ape_paterno;
    }

    public void setX_ape_paterno(int x_ape_paterno) {
        this.x_ape_paterno = x_ape_paterno;
    }

    public int getX_ape_materno() {
        return x_ape_materno;
    }

    public void setX_ape_materno(int x_ape_materno) {
        this.x_ape_materno = x_ape_materno;
    }

    public int getX_nombres() {
        return x_nombres;
    }

    public void setX_nombres(int x_nombres) {
        this.x_nombres = x_nombres;
    }

    public int getX_razon_social() {
        return x_razon_social;
    }

    public void setX_razon_social(int x_razon_social) {
        this.x_razon_social = x_razon_social;
    }

    public String getF_nacimiento() {
        return f_nacimiento;
    }

    public void setF_nacimiento(String f_nacimiento) {
        this.f_nacimiento = f_nacimiento;
    }

    public int getC_recurrente() {
        return c_recurrente;
    }

    public void setC_recurrente(int c_recurrente) {
        this.c_recurrente = c_recurrente;
    }

}
