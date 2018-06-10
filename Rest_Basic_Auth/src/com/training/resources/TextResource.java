package com.training.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("first")
public class TextResource {

	
	@GET
	@Produces(value=MediaType.TEXT_PLAIN)
	public String getInfo(){
		
		return "You have Configured REST Successfully";
	}
	
	
}
