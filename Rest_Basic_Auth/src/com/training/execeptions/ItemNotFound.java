package com.training.execeptions;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.training.domains.ErrorProperties;

@Provider
public class ItemNotFound  implements ExceptionMapper<ItemNotFoundException> {


	
	@Override
	public Response toResponse(ItemNotFoundException exception) {

		return  Response.status(Status.NOT_FOUND).entity(new ErrorProperties("404", exception.getMessage())).type(MediaType.TEXT_XML)
                .build();

	}

	
}
