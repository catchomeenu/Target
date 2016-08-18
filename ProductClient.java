package com.target.oprations.retail.client;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.target.oprations.retail.response.productResponse.ProductResponseDTO;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.MediaType;

/**
 * Created by msutar on 8/14/16.
 */
@Component
public class ProductClient {

    public ProductResponseDTO getProductDetails(String productID) throws Exception{
        ProductResponseDTO productResponseDTO = null;
        try {
            Client client = Client.create();
            String prodURL = "https://api.target.com/products/v3/"+productID+"?fields=descriptions&id_type=TCIN&key=43cJWpLjH8Z8oR18KdrZDBKAgLLQKJjz";
            WebResource webResource = client.resource(prodURL);
            webResource.accept(MediaType.APPLICATION_JSON);
            ClientResponse clientResponse =  webResource.get(ClientResponse.class);

            if(clientResponse.getStatus() != 200){
                throw new RuntimeException("Exception Occured Failed with HHT code : "+clientResponse.getStatus());
            }
            productResponseDTO = new Gson().fromJson(clientResponse.getEntity(String.class), ProductResponseDTO.class);

        }catch(Exception e){
            throw new Exception("Exception from Target API client call"+e.getMessage());
        }
        return productResponseDTO;
    }

}
