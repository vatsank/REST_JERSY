package com.training.execeptions;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class CorsFilter implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		
		responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
		responseContext.getHeaders().add("Access-Control-Allow-Credentials", "true");
		responseContext.getHeaders().add("Access-Control-Allow-Headers","origin, content-type, accept, authorization");
		responseContext.getHeaders().add("Access-Control-Allow-Methods","GET, POST, PUT, DELETE, OPTIONS, HEAD");
		
		}

}
//
//@GET
//@Produces({MediaType.TEXT_HTML})
//public InputStream viewHome()
//{
//   File f = getFileFromSomewhere();
//   return new FileInputStream(f);
//}


//@Path('{filename}')
//@GET
//public InputStream getIndex(@PathParam("filename") String fileName){
//File index = new File("webapp/public/" + fileName);
//try {
//    return new FileInputStream(index);
//} catch (FileNotFoundException e) {
//    String s = "ERROR";
//    return new ByteArrayInputStream(s.getBytes(StandardCharsets.UTF_8));
//}  
