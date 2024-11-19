package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String LOAD_DRIVER="com.mysql.cj.jdbc.Driver";
    public static String URL="jdbc:mysql://localhost:3306/Studentdb";
    public static String user="root";
    public static String password="Kritan@321";

    public static void main( String[] args ){
        try{
            Class.forName(LOAD_DRIVER);
            Connection connection=DriverManager.getConnection(URL, user, password);
            Statement statement=connection.createStatement();
            String query="Select * from Students";
            ResultSet resultset=statement.executeQuery(query);
            while(resultset.next()){
                int id=resultset.getInt("id");
                String name=resultset.getString("name");
                String course=resultset.getString("course");
                System.out.println("id: "+id+" name: "+name+" course: "+course);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
