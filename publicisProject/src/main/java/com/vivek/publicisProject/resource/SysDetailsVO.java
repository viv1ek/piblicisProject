package com.vivek.publicisProject.resource;

public class SysDetailsVO {
	private String pod;

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public SysDetailsVO(String pod) {
		super();
		this.pod = pod;
	}

	public SysDetailsVO() {
		super();
	}

	@Override
	public String toString() {
		return "\n SysDetailsVO {pod=" + pod + "}";
	}
	
}
