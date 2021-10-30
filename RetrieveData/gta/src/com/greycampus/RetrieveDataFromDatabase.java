package com.greycampus;

public class RetrieveDataFromDatabase {
	public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        int count = 0;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/education", "root", "medhasharma@2125");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from customer_details");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString(3));
                System.out.println(resultSet.getString(4));
                System.out.println(resultSet.getString(5));
                System.out.println(resultSet.getString(6));
                System.out.println(resultSet.getString(7));
                System.out.println(resultSet.getString(8));
                System.out.println(resultSet.getString(9));
                System.out.println(resultSet.getString(10));
                System.out.println(resultSet.getString(11));
                System.out.println(resultSet.getString(12));
                System.out.println();
            }
            System.out.println(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                statement.close();
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


