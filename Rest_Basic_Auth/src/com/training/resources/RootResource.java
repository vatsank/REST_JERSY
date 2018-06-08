package com.training.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.domains.Student;



@Path("/studService")
public class RootResource {

	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greet(){
		
		 return "REST Web Services";
		 
	}
	
	
	@GET
	@Path("/student")
	@Produces(value=MediaType.APPLICATION_XML)
	public Response getStudent(){
		
		 Student stud = new Student(101,"Ramesh",50);
		 
		 return Response.status(200).entity(stud).build();
		 
		
	}
	
	
	@GET
	@Path("/getAllStudent")
	@Produces(value=MediaType.APPLICATION_JSON)
	public Response getAllStudents(){
		
		 Student ram = new Student(101,"Ramesh",50);
		 Student shyam = new Student(102,"Shyam",70);
		 Student ganesh = new Student(104,"Ganesh",58);
		 
		 ArrayList<Student> ece = new ArrayList<Student>();
		 
		   ece.add(ram);
		   ece.add(shyam);
		   ece.add(ganesh);
		   
		   HashMap<String, ArrayList<Student>> stud = new HashMap<>();
		   
		    stud.put("eceBatch", ece);
		    
		   Genson serializer = new Genson();
		   
		      String studList = serializer.serialize(stud);
		      
		 return Response.status(200).entity(studList).build();
		 
		
	}
	
	@POST
	@Path("/addStudent")
	@Produces(MediaType.TEXT_PLAIN)
	  public String submit(
			  @FormParam("studentId") long id,
			  @FormParam("studentName") String name,
			  @FormParam("markScored") double mark
			  ){
		  
		  String message=name +mark +"Added";
		  
		   return message;
		   
	  }
	
	  
	@DELETE
	@Path("/remove")
	  public String remove(@QueryParam("key") String key){
		  
		  HashMap<String, String> names = new HashMap<String,String>();
		  
		     names.put("101", "Ramesh");
		     names.put("102", "Suresh");
		     names.put("101", "Magesh");
		     
		      return names.remove(key)+"Removed";
		     
	  }
}
