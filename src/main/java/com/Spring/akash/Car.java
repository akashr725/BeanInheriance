package com.Spring.akash;

public class Car {
	
	private String regNo;
	private String modelNo;
	private String owNer;
	private String comPany;
	private String color;
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public void setOwNer(String owNer) {
		this.owNer = owNer;
	}
	public void setComPany(String comPany) {
		this.comPany = comPany;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", modelNo=" + modelNo + ", owNer=" + owNer + ", comPany=" + comPany + ", color="
				+ color + "]";
	}
	

}
