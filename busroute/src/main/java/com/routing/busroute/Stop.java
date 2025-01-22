package com.routing.busroute;

public class Stop {
	
	private String name;
	private double latitude;
	private double longitude;
	private int demand;
	
	public Stop(String name, double latitude, double longitude, int demand) {
		super();
		this.name = name;
		this.latitude = latitude;
		this.longitude = longitude;
		this.demand = demand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public int getDemand() {
		return demand;
	}

	public void setDemand(int demand) {
		this.demand = demand;
	}

}
