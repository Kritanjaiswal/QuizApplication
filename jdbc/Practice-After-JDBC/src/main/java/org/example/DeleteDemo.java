package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DeleteDemo {
    public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";
    public static void main( String[] args )
    {
        try{
            Class.forName(Load_Driver);
            Connection connection= DriverManager.getConnection(URL, user, password);
            Statement statement=connection.createStatement();
            String query="delete from Students where id=3";
            int rowImpacted=statement.executeUpdate(query);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
