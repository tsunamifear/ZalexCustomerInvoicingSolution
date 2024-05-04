package com.mariosky;

public class Product {
	private static int countProductsCreated = 1; //counter to keep an ID of the products created
	private String productName;
	private int modelNo;
	private String description;
	private double price;

	public Product(String productName, String description, double price) {
		this.productName = productName;
		this.modelNo = countProductsCreated;
		countProductsCreated++;
		this.description = description;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product: "+productName+" with model#"+modelNo+" has the price of: "+price+" euro each.";
	}
}
