package com.vivek.publicisProject.resource;

public class CoordDetailsVO {
	private double lat;
	private double lon;
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public CoordDetailsVO(double lat, double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	public CoordDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n CoordDetailsVO {lat=" + lat + ",\n lon=" + lon + "}";
	}
	
}
