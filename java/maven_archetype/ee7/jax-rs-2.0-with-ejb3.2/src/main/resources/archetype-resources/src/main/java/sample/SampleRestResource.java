package ${package}.sample;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/rest")
@RequestScoped
public class SampleRestResource {
  
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public String getString() {
    return "something";
  }
}
