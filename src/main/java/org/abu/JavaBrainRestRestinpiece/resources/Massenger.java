package org.abu.JavaBrainRestRestinpiece.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.abu.JavaBrainRestRestinpiece.service.massegeService;
import org.abu.JavaBrainRestRestinpiece.model.Massege;


@Path("/masseges")
public class Massenger {
	
	massegeService massegeservice = new massegeService();;
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Massege> getMessage() {
		return massegeservice.getAllMasseges();
}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public Massege getMassege(@PathParam("id") long id) {
		return massegeservice.getMasseges(id);
		
		
}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMassege() {
//		return "hello World";
//		}
}