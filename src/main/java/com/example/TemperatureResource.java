package com.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


import java.util.LinkedList;
import java.util.List;

@Path("/temperatures")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TemperatureResource {
    private final List<Temperature> temperatures = new LinkedList<>();

    @POST
    public Response addTemperature(Temperature temperature) {
        temperatures.add(temperature);
        return Response.status(Response.Status.CREATED).entity(temperature).build();
    }

    @GET
    public List<Temperature> getTemperatures() {
        return temperatures;
    }
}