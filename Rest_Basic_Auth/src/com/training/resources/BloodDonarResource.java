package com.training.resources;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.owlike.genson.Genson;
import com.training.dao.BloodDonarDAO;
import com.training.domains.BloodDonars;

@Path("/bloodDonars")
public class BloodDonarResource {

	
	private BloodDonarDAO dao;
	Genson serializer;
	public BloodDonarResource() {
		super();
	       serializer = new Genson();
	       System.out.println("Constructor Called ==============");
		dao =new BloodDonarDAO();
	}

	@PostConstruct
	public void init(){
		
		System.out.println("Service INit called ==============");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String  getAll(){
		
		      
		        return serializer.serialize(dao.getAllDonars());
				
	}
	
	@Path("/add")
	@POST
	public boolean add(@FormParam("mobileNumber") long mobileNumber , 
			           @FormParam("donarName") String donarName,@FormParam("age") int age, 
			            @FormParam("bloodGroup")  String bloodGroup ,@FormParam("gender") String gender)
	{
		
		  return dao.addDonar(new BloodDonars(mobileNumber, donarName, bloodGroup, age, gender));
		  
		
	}
	@DELETE
	@Path("{number}")
	@Produces(MediaType.APPLICATION_JSON)
	public String deleteDonar(@PathParam("number") long mobileNumber)
	{
		    BloodDonars donar = dao.removeDonar(mobileNumber);
		    
		     return  this.serializer.serialize(donar);
	}
	
	@GET
	@Path("/secure/add")
	@RolesAllowed(value="admin")
	public String  securedMethod(){
		
		return  "Message from security";
	}
}
