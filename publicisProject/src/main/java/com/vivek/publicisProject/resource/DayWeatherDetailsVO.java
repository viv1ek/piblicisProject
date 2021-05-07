package com.vivek.publicisProject.resource;

import java.util.List;

public class DayWeatherDetailsVO {
	private Long dt;
	private MainDetailsVO main;
	private List<WeatherDetailsVO> weather;
	private CloudsDetailsVO clouds;
	private WindDetailsVO wind;
	private SysDetailsVO sys;
	private String dt_txt;
	public Long getDt() {
		return dt;
	}
	public void setDt(Long dt) {
		this.dt = dt;
	}
	public MainDetailsVO getMain() {
		return main;
	}
	public void setMain(MainDetailsVO main) {
		this.main = main;
	}
	public List<WeatherDetailsVO> getWeather() {
		return weather;
	}
	public void setWeather(List<WeatherDetailsVO> weather) {
		this.weather = weather;
	}
	public CloudsDetailsVO getClouds() {
		return clouds;
	}
	public void setClouds(CloudsDetailsVO clouds) {
		this.clouds = clouds;
	}
	public WindDetailsVO getWind() {
		return wind;
	}
	public void setWind(WindDetailsVO wind) {
		this.wind = wind;
	}
	public SysDetailsVO getSys() {
		return sys;
	}
	public void setSys(SysDetailsVO sys) {
		this.sys = sys;
	}
	public String getDt_txt() {
		return dt_txt;
	}
	public void setDt_txt(String dt_txt) {
		this.dt_txt = dt_txt;
	}
	public DayWeatherDetailsVO(Long dt, MainDetailsVO main, List<WeatherDetailsVO> weather, CloudsDetailsVO clouds,
			WindDetailsVO wind, SysDetailsVO sys, String dt_txt) {
		super();
		this.dt = dt;
		this.main = main;
		this.weather = weather;
		this.clouds = clouds;
		this.wind = wind;
		this.sys = sys;
		this.dt_txt = dt_txt;
	}
	public DayWeatherDetailsVO() {
		super();
	}
	@Override
	public String toString() {
		return "\n DayWeatherDetailsVO {dt=" + dt + ",\n main=" + main + ",\n weather=" + weather + ",\n clouds=" + clouds
				+ ",\n wind=" + wind + ",\n sys=" + sys + ",\n dt_txt=" + dt_txt + "}";
	}
	

}
