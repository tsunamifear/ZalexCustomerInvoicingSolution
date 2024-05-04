package com.mariosky;

public class Items {
	private Product product;
	private String productName;
	private int quantity;
	private double amount;

	Items(Product product, int quantity) {
		this.product = product;
		this.productName = product.getProductName();
		this.quantity = quantity;
		this.amount = calculateAmount(quantity);
	}

	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}
	
	//if we change the Quantity of an Item to recalculate the amount
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
			this.amount = 0;
			this.amount = calculateAmount(quantity);
		} else
			System.out.println("Quantity value must be atleast 1.");
	}

	public double getAmount() {
		return amount;
	}

	//method to calculate the Amount based on quantity
	private double calculateAmount(int quantity) {
		return quantity * product.getPrice();
	}

	@Override
	public String toString() {
		this.amount = 0;
		this.amount = calculateAmount(this.quantity);
		return this.quantity + "x " + productName + " for the amount of " + this.amount + " "
				+ "euro";

	}

}
