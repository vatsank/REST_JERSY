package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.training.domains.Doctor;

@Path("/doc")
public class DoctorCRUDResource {
	
	
	HashMap<String, Doctor> docList1=null;
			
	public DoctorCRUDResource() {
		super();
	
		docList1=new HashMap<String, Doctor>();
		
		docList1.put("A1", new Doctor(101,"Gupta","ENT"));
		docList1.put("B1", new Doctor(101,"Rao","ENT"));
		docList1.put("C1", new Doctor(101,"Kumar","ENT"));
	}
	@GET
	@Path("/getBestDoc")
	@Produces(MediaType.TEXT_PLAIN)
	public String getSpecialist(@QueryParam("grade") 
	              String grade){
	
		return docList1.get(grade).toString();
	}
	
	@Path("/find/{id}")
	@GET
	public Response getDoctor(@PathParam("id") long id){

	    Doctor doctor = docList1.get("A1");

	    CacheControl cc = new CacheControl();
	    cc.setMaxAge(86400);
	    cc.setPrivate(true);

	    ResponseBuilder builder = Response.ok(doctor);
	    builder.cacheControl(cc);
	    return builder.build();
	}

	@POST
	@Path("/addDoctor")
	public String addDoctor(
			@FormParam("docId") int docId,
			@FormParam("docName") String docName,
			@FormParam("special") String special,
			@FormParam("grade") String grade
			){
		
		System.out.println(docId);
		System.out.println(docName);
		 Doctor doc1 =new Doctor(docId, docName, special);
		 
		 docList1.put(grade,doc1);
		 
		 System.out.println(docList1);
		 
        return "Doctor Added";		
	}
	
	@PUT
	public String updateDoctor(){
		return null;
	}
	
	
	@DELETE
	@Path("remove/{docGrade}")
	 public String removeDoctor(@PathParam("docGrade") String grade){
		 
		  docList1.remove(grade);
		  System.out.println(docList1);
		 return "Doctor with grade:="+grade +"Removed";
	 }
}
