package com.vivek.publicisProject.resource;

public class OutputDetailsVO {
	
	
	private String date;
	private double temp;
	private double mintemp;
	private double maxtemp;
	private String description;
	private String main;
	private String message;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getMintemp() {
		return mintemp;
	}
	public void setMintemp(double mintemp) {
		this.mintemp = mintemp;
	}
	public double getMaxtemp() {
		return maxtemp;
	}
	public void setMaxtemp(double maxtemp) {
		this.maxtemp = maxtemp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public OutputDetailsVO(String date, double temp, double mintemp, double maxtemp, String description, String main,
			String message) {
		super();
		this.date = date;
		this.temp = temp;
		this.mintemp = mintemp;
		this.maxtemp = maxtemp;
		this.description = description;
		this.main = main;
		this.message = message;
	}
	public OutputDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "OutputDetailsVO [date=" + date + ", temp=" + temp + ", mintemp=" + mintemp + ", maxtemp=" + maxtemp
				+ ", description=" + description + ", main=" + main + ", message=" + message + "]";
	}
	
	
	

}
