package com.vivek.publicisProject.resource;

public class WindDetailsVO {
	
	private double speed;
	private double deg;
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getDeg() {
		return deg;
	}
	public void setDeg(double deg) {
		this.deg = deg;
	}
	public WindDetailsVO(double speed, double deg) {
		super();
		this.speed = speed;
		this.deg = deg;
	}
	public WindDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n WindDetailsVO [speed=" + speed + ",\n deg=" + deg + "]";
	}
	

}
