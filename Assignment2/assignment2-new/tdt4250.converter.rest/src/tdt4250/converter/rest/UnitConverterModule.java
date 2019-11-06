package tdt4250.converter.rest;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleSerializers;



import tdt4250.converter.api.UnitConverterResult;

public class UnitConverterModule extends Module {
	
	@Override
	public String getModuleName() {
		return "UnitConverterModule";
	}
	
	@Override
	public Version version() {
		return Version.unknownVersion();
	}
	
	private final SimpleSerializers serializers = new SimpleSerializers();
	
	public UnitConverterModule() {
		serializers.addSerializer(UnitConverterResult.class, new JsonSerializer<UnitConverterResult>() {
			@Override
			public void serialize(UnitConverterResult unitConverterResult, JsonGenerator jsonGen, SerializerProvider serializerProvider) throws IOException {
				jsonGen.writeObject(unitConverterResult);
				jsonGen.writeBooleanField("success", unitConverterResult.isSuccess());
				jsonGen.writeStringField("message", unitConverterResult.getMessage());
				if (unitConverterResult.getLink() != null) {
					jsonGen.writeStringField("link", unitConverterResult.getLink().toString());
				}
			}
		});

	}

	@Override
	public void setupModule(SetupContext context) {
		// TODO Auto-generated method stub
		context.addSerializers(serializers);
	}
}
