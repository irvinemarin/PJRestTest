/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.pj.entities;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Irvin
 */
public class Servicio {

    String urlService;
    String descripcion;

    public Servicio() {
    }

    public Servicio(String urlService, String descripcion) {
        this.urlService = urlService;
        this.descripcion = descripcion;
    }

    public String getUrlService() {
        return urlService;
    }

    public void setUrlService(String urlService) {
        this.urlService = urlService;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public static String getListServices() {
        List<Servicio> listServices = new ArrayList<>();
        listServices.add(new Servicio("webresources/expediente/all", "lista de servicios"));
        listServices.add(new Servicio("webresources/expediente/", "example 01"));
//        listServices.add(new Servicio("webresources/expediente/", "example 02"));
//        listServices.add(new Servicio("webresources/expediente/", "example 03"));

        return new Gson().toJson(listServices);
    }
}
