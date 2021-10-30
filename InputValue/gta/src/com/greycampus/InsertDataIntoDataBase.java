package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

public class InsertDataIntoDataBase {
	@SuppressWarnings("finally")
	public int insertData(CustomerDetails customerDetails) {
		  Calendar calendar = Calendar.getInstance();
	        java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());


	        Connection connection = null;
	        PreparedStatement preparedStatement = null;
	        int count = 0;

	        try {
	            String sql = "insert into customer_details(cid,firstname,lastname,street,city,state,zipcode,product_name,created_on,created_by) values(?,?,?,?,?,?,?,?,?,?)";
	            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "Medhasharma@2125");
	            preparedStatement = connection.prepareStatement(sql);
	            preparedStatement.setInt(1, customerDetails.getCid());
	            preparedStatement.setString(2, customerDetails.getFirstname());
	            preparedStatement.setString(3, customerDetails.getLastname());
	            preparedStatement.setString(4, customerDetails.getStreet());
	            preparedStatement.setString(5, customerDetails.getCity());
	            preparedStatement.setString(6, customerDetails.getState());
	            preparedStatement.setInt(7, customerDetails.getZipcode());
	            preparedStatement.setString(8, customerDetails.getProduct_name());
	            preparedStatement.setDate(9, ourJavaDateObject);
	            preparedStatement.setString(10, customerDetails.getCreated_by());

	            count = preparedStatement.executeUpdate();
	            System.out.println(count);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                preparedStatement.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            try {
	                connection.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }

	            return count;

	}
	

	}
	}
