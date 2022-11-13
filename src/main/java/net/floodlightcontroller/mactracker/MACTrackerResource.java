package net.floodlightcontroller.mactracker;

import org.restlet.resource.ServerResource;

import java.util.ArrayList;
 
import net.floodlightcontroller.mactracker.MACTracker.Device;
import org.restlet.resource.Get;


public class MACTrackerResource extends ServerResource {
	@Get("json")
    public ArrayList<Device> retrieve() {
		MACTrackerService pihr = (MACTrackerService)getContext().getAttributes().get(MACTrackerService.class.getCanonicalName());
        return (pihr.getHistory());
    }
}
