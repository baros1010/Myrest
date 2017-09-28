package myrest.logic;

import java.util.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import myrest.bean.Student;
@Path("/hello") 
public class GetStudent {
	private static final Logger logger = Logger.getLogger(GetStudent.class.getName());
	@GET
	@Path("/student/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getStudent(@PathParam("id") String id) {
			Student s=new Student();
			if("01".equals(id)){
				s.setName("katoumegumi");
				s.setTel("123");
			}else if("02".equals(id)){
				s.setName("nozomi");
				s.setTel("123");
			}else {
				logger.info("can not find");
				return Response.serverError().build();
			}
			return Response.ok(s).build();
	}
}
