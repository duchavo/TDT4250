package tdt4250.converter.rest;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.jaxrs.whiteboard.propertytypes.JaxrsExtension;

import com.fasterxml.jackson.databind.ObjectMapper;

import tdt4250.converter.api.UnitConverterResult;

@Component
@JaxrsExtension
@Produces(MediaType.APPLICATION_JSON)
public class UnitConverterResultWriter implements MessageBodyWriter<UnitConverterResult> {

	@Override
	public boolean isWriteable(Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType) {
		return  clazz == UnitConverterResult.class;
	}

	private ObjectMapper objectMapper = new ObjectMapper();
	{
		objectMapper.registerModule(new UnitConverterModule());
	}

	
	@Override
	public void writeTo(UnitConverterResult unitConverterResult, Class<?> clazz, Type type, Annotation[] annotations, MediaType mediaType,
			MultivaluedMap<String, Object> values, OutputStream output) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		objectMapper.writeValue(output, unitConverterResult);
		output.flush();
	}
	
}
