package org.example;

import java.sql.*;
import java.util.Scanner;

public class preparedStatementDemo {
    public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";
    public static void main( String[] args )
    {
        try{
            Class.forName(Load_Driver);
            Connection connection= DriverManager.getConnection(URL, user, password);
//            String query="delete from Students where id=?";
//            PreparedStatement preparestatement=connection.prepareStatement(query);
//            preparestatement.setInt(1, 3);
//            int rowImpacted=preparestatement.executeUpdate();
//            System.out.println("rowImpacted: "+rowImpacted);

            String insertquery="insert into Students (id, name, course) values (?, ?, ?)";
            PreparedStatement preparestatement=connection.prepareStatement(insertquery);
            Scanner sc=new Scanner(System.in);
            int id=sc.nextInt();
            String name=sc.next();
            String course=sc.next();
            preparestatement.setInt(1, id);
            preparestatement.setString(2, name);
            preparestatement.setString(3, course);
            int rowImpacted=preparestatement.executeUpdate();
            System.out.println("rowImpacted: "+rowImpacted);

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
