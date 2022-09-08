package com.company.location;

public class location {

	private String locationName;
	private String locationAdress;
	private double lat, len;

	public location(String locationName, String locationAdress, double lat, double len) {
		super();
		this.locationName = locationName;
		this.locationAdress = locationAdress;
		this.lat = lat;
		this.len = len;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationAdress() {
		return locationAdress;
	}

	public void setLocationAdress(String locationAdress) {
		this.locationAdress = locationAdress;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLen() {
		return len;
	}

	public void setLen(double len) {
		this.len = len;
	}

	@Override
	public String toString() {
		return "location [locationName=" + locationName + ", locationAdress=" + locationAdress + ", lat=" + lat + ", len=" + len + "]";
	}

}
