package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SchrollingAndUpdatingDB {
    public static String Load_Driver="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";
    public static void main( String[] args )
    {
        try{
            Class.forName(Load_Driver);
            Connection connection= DriverManager.getConnection(URL, user, password);
            Statement statement=connection.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE
            );
            String query="select * from Students";
            ResultSet resultset=statement.executeQuery(query);
            resultset.last();
            System.out.println(resultset.getInt("id"));
            System.out.println(resultset.getString("name"));

            // updating data
            resultset.updateInt("id", 5);
            resultset.updateString("course", "DSA with Java Backend");
            resultset.updateRow();
            System.out.println("data after updating");
            System.out.println(resultset.getInt("id"));
            System.out.println(resultset.getString("name"));
            System.out.println(resultset.getString("course"));

            // inserting a new row via resultset
            resultset.moveToInsertRow();
            resultset.updateInt("id", 6);
            resultset.updateString("name", "MammiPapa");
            resultset.updateString("course", "Family");
            resultset.insertRow();
            System.out.println(resultset.getInt("id"));
            System.out.println(resultset.getString("name"));
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
