package net.floodlightcontroller.core.web.serializers;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import net.floodlightcontroller.mactracker.MACTracker.Device;

public class deviceSerializer extends JsonSerializer<Device> {

	@Override
	public void serialize(Device dev, JsonGenerator jGen, SerializerProvider arg2)
			throws IOException, JsonProcessingException {
		
		jGen.writeStartObject();
		 
        jGen.writeStringField("deviceMAC", dev.getMac());
        jGen.writeStringField("attachmentpoint", dev.getAttachmentPoint());
 
        jGen.writeEndObject();
		
	}

}
