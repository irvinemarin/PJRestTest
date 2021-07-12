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
//1             N_ID_DISTRITO       Primaria	decimal(19,0)			No	Ninguna			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	2	N_SECUENCIAL        Primaria	decimal(10,0)			No	Ninguna			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	3	X_USUARIO           varchar(20)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	4	X_CLAVE             char(20)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	5	L_IND_TIPO_CONEXION char(2)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	6	X_NOM_CORTE         varchar(100)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	7	X_NOM_SERVICIO      varchar(100)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	8	X_NOM_BASE          varchar(100)	utf8mb4_general_ci		Sí	NULL			Cambiar Cambiar	Eliminar Eliminar	
//Más Más
//	9	X_NOM_ODBC
public class BaseDatos {

    int N_ID_DISTRITO;
    String N_SECUENCIAL;
    String X_NOM_DISTRITO;
    String X_USUARIO;
    String X_CLAVE;
    String L_IND_TIPO_CONEXION;
    String X_NOM_CORTE;
    String X_NOM_SERVICIO;
    String X_NOM_BASE;
    String X_NOM_ODBC;

    public BaseDatos() {
    }

    public int getN_ID_DISTRITO() {
        return N_ID_DISTRITO;
    }

    public void setN_ID_DISTRITO(int N_ID_DISTRITO) {
        this.N_ID_DISTRITO = N_ID_DISTRITO;
    }

    public String getN_SECUENCIAL() {
        return N_SECUENCIAL;
    }

    public void setN_SECUENCIAL(String N_SECUENCIAL) {
        this.N_SECUENCIAL = N_SECUENCIAL;
    }

    public String getX_NOM_DISTRITO() {
        return X_NOM_DISTRITO;
    }

    public void setX_NOM_DISTRITO(String X_NOM_DISTRITO) {
        this.X_NOM_DISTRITO = X_NOM_DISTRITO;
    }

    public String getX_USUARIO() {
        return X_USUARIO;
    }

    public void setX_USUARIO(String X_USUARIO) {
        this.X_USUARIO = X_USUARIO;
    }

    public String getX_CLAVE() {
        return X_CLAVE;
    }

    public void setX_CLAVE(String X_CLAVE) {
        this.X_CLAVE = X_CLAVE;
    }

    public String getL_IND_TIPO_CONEXION() {
        return L_IND_TIPO_CONEXION;
    }

    public void setL_IND_TIPO_CONEXION(String L_IND_TIPO_CONEXION) {
        this.L_IND_TIPO_CONEXION = L_IND_TIPO_CONEXION;
    }

    public String getX_NOM_CORTE() {
        return X_NOM_CORTE;
    }

    public void setX_NOM_CORTE(String X_NOM_CORTE) {
        this.X_NOM_CORTE = X_NOM_CORTE;
    }

    public String getX_NOM_SERVICIO() {
        return X_NOM_SERVICIO;
    }

    public void setX_NOM_SERVICIO(String X_NOM_SERVICIO) {
        this.X_NOM_SERVICIO = X_NOM_SERVICIO;
    }

    public String getX_NOM_BASE() {
        return X_NOM_BASE;
    }

    public void setX_NOM_BASE(String X_NOM_BASE) {
        this.X_NOM_BASE = X_NOM_BASE;
    }

    public String getX_NOM_ODBC() {
        return X_NOM_ODBC;
    }

    public void setX_NOM_ODBC(String X_NOM_ODBC) {
        this.X_NOM_ODBC = X_NOM_ODBC;
    }

}
