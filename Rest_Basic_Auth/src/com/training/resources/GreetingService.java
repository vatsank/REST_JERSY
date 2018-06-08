package com.training.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/greet")
public class GreetingService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response goodMorning(){
		
		String msg="Good Morning";
		
		 Response resp=Response.status(200).
				           entity(msg).build();
		 
		 return  resp;
	}
	
	@GET
    @Path("/link")
	@Produces(MediaType.TEXT_HTML)
	public Response getLink(){
		
		
		String link="<a href=getName/Ramesh>Ramesh</a>";
		
		 Response resp=Response.status(200).
				           entity(link).build();
		 
		 return  resp;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/getName/{userName}")
	public Response getDetails(
			@PathParam("userName") String name)
	{
		String msg="DOT.NET Developer";
		if(name.equals("Ramesh"))
		{
			msg="JAVA Developer";
		}
			
		 Response resp=Response.status(200).
		           entity(msg).build();
        return  resp;
	}
	
}
