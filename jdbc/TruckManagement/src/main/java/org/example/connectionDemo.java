package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDemo {
    public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/truckMgt";
    public static String user="root";
    public static String password="Kritan@321";
    public static Connection getconnection() throws SQLException {
        return DriverManager.getConnection(URL, user, password);
    }
}
