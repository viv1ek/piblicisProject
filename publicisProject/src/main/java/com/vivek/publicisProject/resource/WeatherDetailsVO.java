package com.vivek.publicisProject.resource;

public class WeatherDetailsVO {
	
	private int id;
	private String main;
	private String description;
	private String icon;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMain() {
		return main;
	}
	public void setMain(String main) {
		this.main = main;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public WeatherDetailsVO(int id, String main, String description, String icon) {
		super();
		this.id = id;
		this.main = main;
		this.description = description;
		this.icon = icon;
	}
	public WeatherDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n WeatherDetailsVO {id=" + id + ",\n main=" + main + ",\n description=" + description + ",\n icon=" + icon
				+ "}";
	}
	
	

}
