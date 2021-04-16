package kyojin.management.web.resource;

import java.net.*;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

import kyojin.management.web.data.Laboratory;
import kyojin.management.web.data.Researcher;
import kyojin.management.web.service.ResearcherService;

@Path("/")
public class ResearcherResource {

    ResearcherService service = new ResearcherService();
    
    @Context
    UriInfo uriInfo;
    
    @Path("/researcher")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response addResearcher(Researcher s) {
        Researcher researcher = service.addResearcher(s);
        if(researcher == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        URI uri = uriInfo.getRequestUri();
        String newUri = uri.getPath() + "/" + researcher.getId();
        return Response.status(Response.Status.CREATED)
                       .entity(researcher)
                       .contentLocation(uri.resolve(newUri))
                       .build();
    }
    
    @Path("/researcher/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteResearcher(@PathParam("id") int id) {
        if(service.deleteResearcher(id) == false) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.OK).build();
    }
    
    @Path("/researcher/{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getResearcher(@PathParam("id") int id) {
        Researcher researcher = service.getResearcher(id);
        if(researcher == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        Link link = Link.fromUri(uriInfo.getRequestUri())
                        .rel("self")
                        .type("application/xml")
                        .build();
        return Response.status(Response.Status.OK)
                       .entity(researcher)
                       .links(link)
                       .build();
    }
    
    @Path("/laboratory")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response addLaboratory(Laboratory s) {
        Laboratory laboratory = service.addLaboratory(s);
        if(laboratory == null) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        URI uri = uriInfo.getRequestUri();
        String newUri = uri.getPath() + "/" + laboratory.getId();
        return Response.status(Response.Status.CREATED)
                       .entity(laboratory)
                       .contentLocation(uri.resolve(newUri))
                       .build();
    }
    
    @Path("/laboratory/{name}")
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    public Response deleteLaboratory(@PathParam("name") String name) {
        if(service.deleteLaboratory(name) == false) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.status(Response.Status.OK).build();
    }
    
    @Path("/laboratory/{name}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getLaboratory(@PathParam("name") String name) {
        Laboratory laboratory = service.getLaboratory(name);
        if(laboratory == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        Link link = Link.fromUri(uriInfo.getRequestUri())
                        .rel("self")
                        .type("application/xml")
                        .build();
        return Response.status(Response.Status.OK)
                       .entity(laboratory)
                       .links(link)
                       .build();
    }    
    
    @Path("/linkage/{labName}/{resId}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
	public Response linkLaboratoryResearcher(@PathParam("labName")String labName, @PathParam("resId")int resId) {
		if(service.linkLaboratoryResearcher(labName, resId) > 0)
	        return Response.status(Response.Status.CREATED).build();
		else
			return Response.status(Response.Status.NOT_FOUND).build();
	}
    
    @Path("/linkage")
    @GET
    @Produces(MediaType.APPLICATION_XML)
	public Response getAllLaboratoryResearcher() {
		String result = service.getAllLaboratoryResearcher();
    	
        Link link = Link.fromUri(uriInfo.getRequestUri())
                        .rel("self")
                        .type("application/xml")
                        .build();
        return Response.status(Response.Status.OK)
				       .entity(result)
				       .links(link)
				       .build();
	}

    @Path("/laboratory/all")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getAllLaboratory() {
        String result = service.getAllLaboratory();
        
        Link link = Link.fromUri(uriInfo.getRequestUri())
                .rel("self")
                .type("application/xml")
                .build();
        return Response.status(Response.Status.OK)
                       .entity(result)
                       .links(link)
                       .build();
    }

    @Path("/researcher/all")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Response getAllResearcher() {
        String result = service.getAllResearcher();
        
        Link link = Link.fromUri(uriInfo.getRequestUri())
                .rel("self")
                .type("application/xml")
                .build();
        return Response.status(Response.Status.OK)
                       .entity(result)
                       .links(link)
                       .build();
    }
}