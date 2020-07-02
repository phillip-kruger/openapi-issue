package org.cristian.resources.v1;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cristian.models.Residents;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.cristian.resources.v1.results.Result;
import org.cristian.resources.v1.results.ResultList;

import java.util.List;

@Path("/v1/residents")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ResidentsResource extends BaseResource<Residents> {

    @GET
    public ResultList<Residents> getAll(@QueryParam("id") String id,
                                        @QueryParam("limit") int limit,
                                        @QueryParam("offset") int offset,
                                        @QueryParam("orderby") List<String> orderBy) {

        return super.getAll();
    }

    @POST
    @RequestBody(content = @Content(schema = @Schema(implementation = Residents.class)))
    @APIResponse(responseCode = "200", description = "Creates a new Chart", content = @Content(schema = @Schema(implementation = Result.class)))
    public Result<Residents> post(Residents chart) {
        return super.post(chart);
    }

    @PUT
    @RequestBody(content = @Content(schema = @Schema(implementation = Residents.class)))
    @APIResponse(responseCode = "200", description = "Creates a new Chart", content = @Content(schema = @Schema(implementation = Result.class)))
    public Result<Residents> put(Residents chart) {
        return super.put(chart);
    }

    @DELETE
    @RequestBody(content = @Content(schema = @Schema(implementation = Residents.class)))
    public Response delete(Residents chart) {
        return super.delete(chart);
    }
}
