package org.example;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lombok.extern.slf4j.Slf4j;
import org.example.dto.UserDTO;
import org.example.entity.User;

import java.util.List;

@Slf4j
@Path("/api/v1")
public class Service {
    private static final Controller controller = new Controller();
    @GET
    @Path("/users")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Jersey Jetty example.";
    }

    @GET
    @Path("/users/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAllUsers() {
        List<User> allUsers = controller.getAllUsers();
        return Response.ok(allUsers).build();
    }


    @POST
    @Path("/users/add")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addUser(UserDTO userDTO) {
        int userId = controller.addUser(userDTO);
        if(userId > 0) {
            return Response.ok().entity("New user added with id: " + userId).build();
        }
        return Response.serverError().entity("Unable to add new user at this time").build();
    }
}
