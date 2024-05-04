package com.mariosky;

import java.util.List;

public class CustomerAccount {
	private static int accountCounter = 1;
	private int accountNo;
	private CustomerName customerName;
	private String address;
	private int phone;
	private double accountBanalance;
	private List<Invoice> invoices;

	public CustomerAccount(CustomerName customerName, String address, int phone, List<Invoice> invoices) {
		this.accountNo = accountCounter;
		accountCounter++;
		this.customerName = customerName;
		this.address = address;
		this.phone = phone;
		this.invoices = invoices;
		this.accountBanalance = calculateAccountBalance();
	}
	
	//Getters - Setters
	public double getAccountBanalance() {
		return accountBanalance;
	}
	
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public CustomerName getCustomerName() {
		return customerName;
	}

	public void setCustomerName(CustomerName customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
		this.accountBanalance = 0;
		this.accountBanalance = calculateAccountBalance();
	}

	//method to calculate Account Balance based on the List of Invoices
	private double calculateAccountBalance() {
		if (this.invoices.isEmpty() || null == this.invoices) {
			return 0;
		}
		for (Invoice invoice : invoices) {
			this.accountBanalance += invoice.getInvoiceTotalAmount();
		}
		return this.accountBanalance;
	}
	
	//method to get the Invoice print as String
	private String getInvoiceText(List<Invoice> invoices) {
		if (null != invoices) {
			String s = new String();
			for (Invoice invoice : invoices) {
				s = s+invoice+"\n";
			}
			return s;
		}
		return null;
	}

	@Override
	public String toString() {
		this.accountBanalance=0;
		this.accountBanalance =calculateAccountBalance();
		String s = new String();
		s = "Account No." + getAccountNo() + "\n" + customerName.toString() + "\nPhone Number: " + getPhone()+ "\nAddress: " + getAddress()+"\nTotal Account Balance of: "+getAccountBanalance()
				+" for:\n\n"+getInvoiceText(invoices);
		return s;
	}

}
