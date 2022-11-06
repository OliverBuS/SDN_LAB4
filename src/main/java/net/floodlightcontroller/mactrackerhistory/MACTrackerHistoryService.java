package net.floodlightcontroller.mactrackerhistory;

import java.util.ArrayList;
import net.floodlightcontroller.mactracker.MACTracker.Device;

import net.floodlightcontroller.core.module.IFloodlightService;

public interface MACTrackerHistoryService extends IFloodlightService {
	
	public ArrayList<Device> getHistory();
	
	
}
