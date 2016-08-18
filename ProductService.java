package com.target.oprations.retail.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.target.oprations.retail.dao.ProductDao;
import com.target.oprations.retail.helper.HelloHelper;
import com.target.oprations.retail.helper.ProductHelper;
import com.target.oprations.retail.util.ExceptionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by msutar on 8/16/16.
 */
@Component
@Path("target")
public class ProductService {

    @Autowired
    private ProductHelper productHelper;

    @GET
    @Path("/product/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductDetails(@PathParam("id") String productId){

        Response.ResponseBuilder response = null;
        try{

            ProductDao productDaoList =  productHelper.getProductDetails(productId);
            response = Response.status(200).entity(new Gson().toJson(productDaoList));

        }catch(Exception e){
            response = Response.serverError();
            response.entity(ExceptionUtil.setSerivceErrors(e));
        }

        return response.build();
    }

}
