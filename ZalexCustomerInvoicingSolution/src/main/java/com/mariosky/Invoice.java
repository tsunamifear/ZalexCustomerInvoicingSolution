package com.mariosky;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Invoice {
	private static int invoiceCounter = 1; //counter to keep an ID of the invoices created
	private int invoiceNo;
	private String dateCreated;
	private ArrayList<Items> itemsList = new ArrayList<>();
	private double invoiceTotalAmount;

	Invoice(ArrayList<Items> items) {
		this.invoiceNo = invoiceCounter;
		invoiceCounter++;
		this.dateCreated = getCurrentDateCreated();
		this.itemsList = items;
		this.invoiceTotalAmount = calculateInvoiceTotalAmount();
	}

	// method to get the system date as String format
	private String getCurrentDateCreated() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return dateFormat.format(currentDate);
	}

	public int getInvoiceNo() {
		return invoiceNo;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public double getInvoiceTotalAmount() {
		return invoiceTotalAmount;
	}

	public ArrayList<Items> getItemsList() {
		return itemsList;
	}

	// every time we set an Item List to recalculate the Invoice Total Amount
	public void setItemsList(ArrayList<Items> itemsList) {
		this.itemsList = itemsList;
		this.invoiceTotalAmount = 0;
		this.invoiceTotalAmount = calculateInvoiceTotalAmount();
	}

	// method to calculate the Invoice Total Amount
	private double calculateInvoiceTotalAmount() {
		if (this.itemsList.isEmpty() || null == this.itemsList) {
			return 0;
		}
		this.invoiceTotalAmount = 0;
		for (Items item : itemsList) {
			this.invoiceTotalAmount += item.getAmount();
		}
		return this.invoiceTotalAmount;
	}

	// method to get the ItemList as String
	private String returnItemListAsString(ArrayList<Items> itemsList) {
		String returnListAsString = new String();
		for (Items i : itemsList) {
			returnListAsString = returnListAsString + i + "\n";
		}
		return returnListAsString;
	}

	@Override
	public String toString() {
		this.invoiceTotalAmount = calculateInvoiceTotalAmount();
		return "Invoice No." + invoiceNo + " was created on the " + dateCreated + " with total amount of "
				+ invoiceTotalAmount + " euro for these products:\n" + returnItemListAsString(itemsList);
	}
}
