package net.floodlightcontroller.mactrackerhistory;

import org.restlet.resource.ServerResource;

import java.util.ArrayList;
 
import net.floodlightcontroller.mactracker.MACTracker.Device;
import org.restlet.resource.Get;


public class MACTrackerResource extends ServerResource {
	@Get("json")
    public ArrayList<Device> retrieve() {
		MACTrackerHistoryService pihr = (MACTrackerHistoryService)getContext().getAttributes().get(MACTrackerHistoryService.class.getCanonicalName());
        return (pihr.getHistory());
    }
}
