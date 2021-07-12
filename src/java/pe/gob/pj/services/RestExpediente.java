package pe.gob.pj.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.gob.pj.Dao.ExpedienteDaoImpl;
import pe.gob.pj.DaoImpl.ExpedienteDao;
import pe.gob.pj.entities.Servicio;

/**
 *
 * @author milan
 */
@Stateless
@Path("expediente")
public class RestExpediente {

    @PersistenceContext(unitName = "CustomerDBPU")
    private EntityManager em;
    ExpedienteDao daoExpediente;

    public RestExpediente() {
        daoExpediente = ExpedienteDaoImpl.getInstance();
    }

    @GET
    @Path("{code}")
    @Produces("application/json")
    public Response getDataExample01(@PathParam("code") String code) {
        System.out.println("getDataFormCode");
        String result = daoExpediente.getExpedienteByCode(code);
        return Response.ok(result, MediaType.APPLICATION_JSON).build();
    }

    @GET
    @Path("all")
    @Produces("application/json")
    public Response getServicesList() {
        String result = Servicio.getListServices();
        return Response.ok(result, MediaType.APPLICATION_JSON).build();
    }

//    @POST 
//    @Consumes({"application/xml", "application/json"})
//    public void create(Customer entity) {
//        super.create(entity);
//    }
//
//    @PUT  
//    @Consumes({"application/xml", "application/json"})
//    public void edit(Customer entity) {
//        super.edit(entity);
//    }
//
//    @DELETE
//    @Path("{id}")
//    public void remove(@PathParam("id") Integer id) {
//        super.remove(super.find(id));
//    }
//
//    @GET  
//    @Produces({"application/xml", "application/json"})
//    public List<Customer> findAll() {
//        return super.findAll();
//    }
//    @GET
//    @Path("{from}/{to}")
//    @Produces({"application/xml", "application/json"})
//    public List<Customer> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
//        return super.findRange(new int[]{from, to});
//    }
    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf("count value");
    }

    //@Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
