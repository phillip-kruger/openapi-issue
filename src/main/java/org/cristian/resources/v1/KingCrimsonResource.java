package org.cristian.resources.v1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.cristian.models.KingCrimson;
import org.cristian.resources.v1.results.Result;
import org.cristian.resources.v1.results.ResultList;

import java.util.List;

@Path("/v1/kingcrimson")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class KingCrimsonResource extends BaseResource<KingCrimson> {

    @GET
    public ResultList<KingCrimson> getAll(@QueryParam("id") String id,
                                          @QueryParam("limit") int limit,
                                          @QueryParam("offset") int offset,
                                          @QueryParam("orderby") List<String> orderBy) {
        return super.getAll();
    }

    @POST
    @RequestBody(content = @Content(schema = @Schema(implementation = KingCrimson.class)))
    public Result<KingCrimson> post(KingCrimson deployment) {
        return super.post(deployment);
    }

    @PUT
    @RequestBody(content = @Content(schema = @Schema(implementation = KingCrimson.class)))
    public Result<KingCrimson> put(KingCrimson deployment) {
        return super.put(deployment);
    }

    @DELETE
    @RequestBody(content = @Content(schema = @Schema(implementation = KingCrimson.class)))
    public Response delete(KingCrimson deployment) {
        return super.delete(deployment);
    }
}
