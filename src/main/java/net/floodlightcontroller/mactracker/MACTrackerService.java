package net.floodlightcontroller.mactracker;

import java.util.ArrayList;
import net.floodlightcontroller.mactracker.MACTracker.Device;

import net.floodlightcontroller.core.module.IFloodlightService;

public interface MACTrackerService extends IFloodlightService {
	
	public ArrayList<Device> getHistory();
	
	
}
