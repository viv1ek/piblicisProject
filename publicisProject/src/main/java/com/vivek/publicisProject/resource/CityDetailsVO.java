package com.vivek.publicisProject.resource;

public class CityDetailsVO {
	private int id;
	private String name;
	private CoordDetailsVO coord;
	private String country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CoordDetailsVO getCoord() {
		return coord;
	}
	public void setCoord(CoordDetailsVO coord) {
		this.coord = coord;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public CityDetailsVO(int id, String name, CoordDetailsVO coord, String country) {
		super();
		this.id = id;
		this.name = name;
		this.coord = coord;
		this.country = country;
	}
	public CityDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n CityDetailsVO {id=" + id + ",\n name=" + name + ",\n coord=" + coord + ",\n country=" + country + "}";
	}

}
