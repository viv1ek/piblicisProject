package com.vivek.publicisProject.resource;

import java.util.List;

public class CityReportVO {
	private String cod;
	private int message;
	private int cnt;
	private List<DayWeatherDetailsVO> list;
	private CityDetailsVO city;
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public List<DayWeatherDetailsVO> getList() {
		return list;
	}
	public void setList(List<DayWeatherDetailsVO> list) {
		this.list = list;
	}
	public CityDetailsVO getCity() {
		return city;
	}
	public void setCity(CityDetailsVO city) {
		this.city = city;
	}
	public CityReportVO(String cod, int message, int cnt, List<DayWeatherDetailsVO> list, CityDetailsVO city) {
		super();
		this.cod = cod;
		this.message = message;
		this.cnt = cnt;
		this.list = list;
		this.city = city;
	}
	public CityReportVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n CityReportVO { cod=" + cod + ",\n message=" + message + ",\n cnt=" + cnt + ",\n list=" + list + ",\n city="
				+ city + "}";
	}

}
