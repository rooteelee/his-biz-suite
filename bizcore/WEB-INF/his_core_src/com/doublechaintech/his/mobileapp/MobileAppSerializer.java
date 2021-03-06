package com.doublechaintech.his.mobileapp;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.doublechaintech.his.HisObjectPlainCustomSerializer;
public class MobileAppSerializer extends HisObjectPlainCustomSerializer<MobileApp>{

	@Override
	public void serialize(MobileApp mobileApp, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
			
		this.writeBaseEntityField(jgen, null, mobileApp, provider);
		
	}
}


