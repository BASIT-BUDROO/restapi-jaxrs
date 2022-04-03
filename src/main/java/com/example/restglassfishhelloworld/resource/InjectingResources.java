package com.example.restglassfishhelloworld.resource;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

@Path("/inject")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class InjectingResources {

    @GET
    @Path("/context")
    public String getParamsUsingContext(@Context UriInfo uriInfo) {
        return "Path: " + uriInfo.getAbsolutePath().toString();
    }

}
