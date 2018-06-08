package com.training.resources;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

import com.training.domains.Product;
import com.training.execeptions.ItemNotFound;
import com.training.execeptions.ItemNotFoundException;

@Path("/first")
public class TextResource {

	
	@GET
	@Produces(value=MediaType.TEXT_PLAIN)
	public String getInfo(){
		
		return "You have Configured REST Successfully";
	}
	

	@Path("/product")
	@GET
	@Produces(value=MediaType.APPLICATION_JSON)
	public Product getProduct(){
		
		Product prd = new Product(101,"LED TV",4500.00D);
		return  prd;
	}


	@GET
	@Path("/getItem/{prdId}")
	public Response getItem(@PathParam("prdId") int id)  {
		
		System.out.println("Inside get Item method"+id);
		Product prd=null;
		
		if(id<100)
		{
             throw new ItemNotFoundException("Item Number should NOT be less 100 ");			
		}
		else
		{
			prd = new Product(101,"LED TV",4500.00D);
	
		}
		 		return  Response.status(200).entity(prd).build();
	}

	  @Path("/secure/add")
	  @GET
	    public String addProduct(@Context SecurityContext ctx) {
	      
		  System.out.println(ctx.getUserPrincipal());
		  System.out.println(ctx.isUserInRole("admin"));
		  
	      return "Congrats you are authroized";
	    }

}


