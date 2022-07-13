package com.ibm.sql;

import java.sql.*;

public class ConnectToDatabase {
    public static void main(String[] args) {
        try {
            //load driver into runtime
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is ready!");
            //Establish connection
            String connectionString = "jdbc:mysql://localhost/ibm?" +
                    "user=root&password=root";

            Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection Done!");

            //Query Processing
            Statement statement = connection.createStatement();
            String sqlQuery = "SELECT *FROM tasks";
            ResultSet rows = statement.executeQuery(sqlQuery);
            while (rows.next()){
                System.out.println(rows.getInt("id")  + " " + rows.getString("title"));
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
