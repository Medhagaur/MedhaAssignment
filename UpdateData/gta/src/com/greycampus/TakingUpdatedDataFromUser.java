package com.greycampus;

import java.util.Scanner;

public class TakingUpdatedDataFromUser {

	public static void main(String[] args) {
		  CustomerUpdateDetails customerDataUpdate = new CustomerUpdateDetails();

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the Customer id where we want to update : ");
	        int cid = scanner.nextInt();
	        System.out.print("Enter street to be updated : ");
	        String street = scanner.next();
	        System.out.print("Enter city to be updated : ");
	        String city = scanner.next();
	        System.out.print("Enter state to be updated : ");
	        String state = scanner.next();
	        System.out.print("Enter zipcode to be updated : ");
	        int zipcode = scanner.nextInt();
	        System.out.print("Enter Product name to be updated : ");
	        String product_name = scanner.next();

	        System.out.print("Enter Update user name : ");
	        String Updated_by = scanner.next();

	        customerDataUpdate.setCid(cid);
	        customerDataUpdate.setStreet(street);
	        customerDataUpdate.setCity(city);
	        customerDataUpdate.setState(state);
	        customerDataUpdate.setZipcode(zipcode);
	        customerDataUpdate.setProduct_name(product_name);
	        customerDataUpdate.setUpdated_by(Updated_by);

	        UpdateDataInDatabase customerData = new UpdateDataInDatabase();
	        int count = customerData.UpdateData(customerDataUpdate);
	        System.out.println(count);
	        
	        scanner.close();


	}

}
