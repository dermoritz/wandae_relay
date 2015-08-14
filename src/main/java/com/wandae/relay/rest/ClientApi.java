package com.wandae.relay.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.wandae.common.device.DeviceInfo;

@Path("/client")
public class ClientApi {

    @Path("/register")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response registerDevice(DeviceInfo device){
        return null; //TODO null is bad
    }
}
