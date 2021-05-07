package com.vivek.publicisProject.resource;

public class CloudsDetailsVO {
	
	private int all;

	public int getAll() {
		return all;
	}

	public void setAll(int all) {
		this.all = all;
	}

	public CloudsDetailsVO(int all) {
		super();
		this.all = all;
	}

	public CloudsDetailsVO() {
		super();
	}

	@Override
	public String toString() {
		return "\n CloudsDetailsVO {all=" + all + "}";
	}

	
}
