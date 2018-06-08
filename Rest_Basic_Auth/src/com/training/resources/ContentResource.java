package com.training.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.domains.Doctor;

@Path("/doctor")
public class ContentResource {

	@GET
	@Path("/docAsXML")
	@Produces(value=MediaType.APPLICATION_XML)
	public Response findDoctor()
	{
		Doctor doc =new Doctor(101,"Gupta","ENT");
		
		Response resp=Response.status(200).entity(doc).build();
		return resp;
	}

    @GET	
	@Path("/docAsJSON")
	@Produces(value=MediaType.APPLICATION_JSON)
	public Response findAllDoctors()
	{
		Doctor doc1 =new Doctor(101,"Gupta","ENT");
		Doctor doc2 =new Doctor(102,"Shetty","Dentist");
		Doctor doc3 =new Doctor(103,"Rao","Eye");
		
		List<Doctor> docList=new ArrayList<Doctor>();
		
		docList.add(doc1);
		docList.add(doc2);
		docList.add(doc3);
		
		Genson serializer=new Genson();
		
		String list= serializer.serialize(docList);
		
		Response resp=Response.status(200).
				           entity(list).build();
		return resp;
	}

}
