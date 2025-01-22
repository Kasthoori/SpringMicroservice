package com.routing.busroute;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class Route {
	
	private Stop stop;
	
	@PlanningVariable(valueRangeProviderRefs = "busRange")
	private Bus bus;
	
	public Stop getStop() {
		return stop;
	}
	
	public void setStop(Stop stop) {
		this.stop = stop;
	}
	
	public Bus getBus() {
		return bus;
	}
	
	public void setBus(Bus bus) {
		this.bus = bus;
	}

}
