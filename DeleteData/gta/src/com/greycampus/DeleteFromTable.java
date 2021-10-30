package com.greycampus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteFromTable {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int count = 0;
		String sql = "delete from customer_details where cid = 1";

		try {
		
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "medhasharma@2125");
			preparedStatement = connection.prepareStatement(sql);

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
		}

	}

}
