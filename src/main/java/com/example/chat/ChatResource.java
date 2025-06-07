package com.example.chat;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class ChatResource {

    @GET
    public Response hello() {
        return Response.ok("Chat server is running").build();
    }
}
