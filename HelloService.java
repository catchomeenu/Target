package com.target.oprations.retail.service;

import com.target.oprations.retail.helper.HelloHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by msutar on 8/12/16.
 */
@Component
@Path("test")
public class HelloService {

    @Autowired
    HelloHelper helloHelper;

    @GET
    @Path("/hello")
    public Response displayHello(){

        String message = helloHelper.display();

        return Response.status(200).entity(message).build();

    }

}
