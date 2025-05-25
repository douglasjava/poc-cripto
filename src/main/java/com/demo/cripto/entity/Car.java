package com.demo.cripto.entity;

public class Car {

	
	private String randonId;
	private int randonYear;
	private String randonColor;
	private String randonBrand;
	private int randonPrice;
	private boolean randonSoldState;
	
	public String getRandonId() {
		return randonId;
	}
	public void setRandonId(String randonId) {
		this.randonId = randonId;
	}
	public int getRandonYear() {
		return randonYear;
	}
	public void setRandonYear(int randonYear) {
		this.randonYear = randonYear;
	}
	public String getRandonColor() {
		return randonColor;
	}
	public void setRandonColor(String randonColor) {
		this.randonColor = randonColor;
	}
	public String getRandonBrand() {
		return randonBrand;
	}
	public void setRandonBrand(String randonBrand) {
		this.randonBrand = randonBrand;
	}
	public int getRandonPrice() {
		return randonPrice;
	}
	public void setRandonPrice(int randonPrice) {
		this.randonPrice = randonPrice;
	}
	public boolean isRandonSoldState() {
		return randonSoldState;
	}
	public void setRandonSoldState(boolean randonSoldState) {
		this.randonSoldState = randonSoldState;
	}
	
	public Car(String randonId, int randonYear, String randonColor, String randonBrand, int randonPrice,
			boolean randonSoldState) {
		super();
		this.randonId = randonId;
		this.randonYear = randonYear;
		this.randonColor = randonColor;
		this.randonBrand = randonBrand;
		this.randonPrice = randonPrice;
		this.randonSoldState = randonSoldState;
	}

	
	
}
