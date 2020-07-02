package org.cristian.resources.v1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.cristian.models.Magma;
import org.cristian.resources.v1.results.Result;
import org.cristian.resources.v1.results.ResultList;

import java.util.List;

@Path("/v1/magma")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MagmaResource extends BaseResource<Magma> {

    @GET
    public ResultList<Magma> getAll(@QueryParam("id") String id,
                                    @QueryParam("limit") int limit,
                                    @QueryParam("offset") int offset,
                                    @QueryParam("orderby") List<String> orderBy) {

        return super.getAll();
    }

    @POST
    @RequestBody(content = @Content(schema = @Schema(implementation = Magma.class)))
    public Result<Magma> post(Magma environment) {
        return super.post(environment);
    }

    @PUT
    @RequestBody(content = @Content(schema = @Schema(implementation = Magma.class)))
    public Result<Magma> put(Magma environment) {
        return super.put(environment);
    }

    @DELETE
    @RequestBody(content = @Content(schema = @Schema(implementation = Magma.class)))
    public Response delete(Magma environment) {
        return super.delete(environment);
    }
}
