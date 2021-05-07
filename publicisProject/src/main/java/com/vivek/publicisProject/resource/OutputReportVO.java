package com.vivek.publicisProject.resource;

import java.util.List;

public class OutputReportVO {
	
	private String name;
	private String status;
	List <OutputDetailsVO> list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<OutputDetailsVO> getList() {
		return list;
	}
	public void setList(List<OutputDetailsVO> list) {
		this.list = list;
	}
	public OutputReportVO(String name, String status, List<OutputDetailsVO> list) {
		super();
		this.name = name;
		this.status = status;
		this.list = list;
	}
	public OutputReportVO() {
		super();
	}
	@Override
	public String toString() {
		return "OutputReportVO [name=" + name + ", status=" + status + ", list=" + list + "]";
	}
	

}
