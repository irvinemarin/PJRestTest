package pe.gob.pj.services;

import com.google.gson.Gson;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pe.gob.pj.Dao.ExpedienteDao;

/**
 *
 * @author milan
 */
@Stateless
@Path("expediente")
public class RestExpediente {

    @PersistenceContext(unitName = "CustomerDBPU")
    private EntityManager em;

    public RestExpediente() {

    }

    @GET
    @Path("{code}")
    @Produces("application/json")
    public Response getDataFormCode(@PathParam("code") String code) {
        System.out.println("getDataFormCode");
        String result = ExpedienteDao.getInstance().getExpedienteByCode(code);
        return Response.ok(result, MediaType.APPLICATION_JSON).build();
    }

    protected EntityManager getEntityManager() {
        return em;
    }

    //
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

//    @Override
//    protected EntityManager getEntityManager() {
//        return em;
//    }
}
