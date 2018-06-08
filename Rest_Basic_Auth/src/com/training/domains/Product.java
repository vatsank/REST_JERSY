package com.training.domains;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {

	private long productNumber;
	private String productName;
	private double ratePerUnit;
	
	public Product() {
		super();
	}
	public Product(long productNumber, String productName, double ratePerUnit) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}
	public long getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(long productNumber) {
		this.productNumber = productNumber;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", ratePerUnit="
				+ ratePerUnit + "]";
	}
	
	
}
