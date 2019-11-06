package tdt4250.converter.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsResource;

import com.fasterxml.jackson.core.JsonProcessingException;

import tdt4250.converter.api.*;

@Component(service=UnitConverterResource.class)
@JaxrsResource
@Path("unitConverter")
public class UnitConverterResource {
	
	private UnitConverter unitConverter;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public UnitConverterResult convert(@QueryParam("from") String fromUnit, @QueryParam("to") String toUnit, @QueryParam("value") double value) throws JsonProcessingException {
		return unitConverter.convert(fromUnit, toUnit, value);
	}

}
