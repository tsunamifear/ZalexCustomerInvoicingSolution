package com.mariosky;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		CustomerName customerName1 = new CustomerName("Giannis","Papadopoullos");
		
		//create the Products to put in Items Object
		Product pBags = new Product("Balitses", "pou ta LIDL", 30);
		Product pSheets = new Product("Sentonia", "pou ta LIDL", 13);
		Product pSocks = new Product("Klatses", "pou ta Debenahms", 4);
		Product pKounia = new Product("Kounia","kounia tou morou",30);
		
		//create the Items of Products with the amount of Products in them
		Items socks = new Items(pSocks, 5);
		Items sheets = new Items(pSheets, 4);
		Items bags = new Items(pBags, 2);
		Items kounia = new Items(pKounia,1);
		
		//Create 2x Lists of Items with Products in them so we can use them in our Invoice List
		ArrayList<Items> items1 = new ArrayList<>();
		Collections.addAll(items1, socks, sheets, bags);
		
		ArrayList<Items> items2 = new ArrayList<>();
		Collections.addAll(items2,kounia, sheets);
		
		//2x different Invoices so we can put them in our CustomersAccount
		Invoice invoice1 = new Invoice(items1);
		Invoice invoice2 = new Invoice(items2);
		
		//Printing some tests to see if we get the willingful output
		System.out.println(customerName1);
		System.out.println();
		
		System.out.println("Products created:");
		System.out.println(pBags);
		System.out.println(pSheets);
		System.out.println(pSocks);
		System.out.println(pKounia);
		System.out.println();

		System.out.println("Items created:");
		System.out.println(socks);
		System.out.println(sheets);
		System.out.println(bags);
		System.out.println(kounia);
		System.out.println();

		System.out.println("Items as List:");
		System.out.println(items1);
		System.out.println();

		System.out.println("Invoice test print 1:");
		System.out.println(invoice1);
		System.out.println("Invoice test print 2:");
		System.out.println(invoice2);
		
		//Create the List of Invoices for our customer
		ArrayList<Invoice> invoiceList = new ArrayList<>();
		invoiceList.add(invoice1);
		invoiceList.add(invoice2);
		
		//Create the CustomerAccount with the List of Invoices
		CustomerAccount customerAccount = new CustomerAccount(customerName1,"Leoforos Makariou 10",99123456,invoiceList);
		System.out.println("----------------------------Customer Invoice Print----------------------------");
		System.out.println(customerAccount);
	}

}
