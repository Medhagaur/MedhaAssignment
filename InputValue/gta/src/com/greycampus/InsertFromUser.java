package com.greycampus;

import java.util.Scanner;

public class InsertFromUser {


	    public static void main(String[] args) {
	        CustomerDetails customerDetails = new CustomerDetails();

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Customer id : ");
	        int cid = scanner.nextInt();
	        System.out.print("Enter firstname : ");
	        String firstname = scanner.next();
	        System.out.print("Enter lastname : ");
	        String lastname = scanner.next();
	        System.out.print("Enter street : ");
	        String street = scanner.next();
	        System.out.print("Enter city : ");
	        String city = scanner.next();
	        System.out.print("Enter state : ");
	        String state = scanner.next();
	        System.out.print("Enter zipcode : ");
	        int zipcode = scanner.nextInt();
	        System.out.print("Enter Product name : ");
	        String product_name = scanner.next();

	        System.out.print("Enter Creator name : ");
	        String Created_by = scanner.next();

	        customerDetails.setCid(cid);
	        customerDetails.setFirstname(firstname);
	        customerDetails.setLastname(lastname);
	        customerDetails.setStreet(street);
	        customerDetails.setCity(city);
	        customerDetails.setState(state);
	        customerDetails.setZipcode(zipcode);
	        customerDetails.setProduct_name(product_name);
	        customerDetails.setCreated_by(Created_by);

	        InsertDataIntoDataBase connectionToDatabase = new InsertDataIntoDataBase();
	        int count = connectionToDatabase.insertData(customerDetails);
	        System.out.println(count);

	}

}
