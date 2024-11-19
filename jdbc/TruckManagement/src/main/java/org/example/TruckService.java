package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TruckService {
    public void addTruck(Truck truck) throws SQLException {
        String insertQuery="insert into Truck (name, model, capacity, driver_name) values (?, ?, ?, ?)";
        Connection connection=connectionDemo.getconnection();
        PreparedStatement preparestatement=connection.prepareStatement(insertQuery);
        preparestatement.setString(1, truck.getName());
        preparestatement.setString(2, truck.getModel());
        preparestatement.setInt(3, truck.getCapacity());
        preparestatement.setString(4, truck.getDriver_name());
        preparestatement.executeUpdate();
    }
    public Truck getTruckById(int id) throws SQLException {
        Truck truck=new Truck("", "", 0, "");
        Connection connection=connectionDemo.getconnection();
        String query="select * from Truck where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setInt(1, id);
        ResultSet resultset=preparestatement.executeQuery();
        if(resultset.next()){
            truck.setId(resultset.getInt("id"));
            truck.setName(resultset.getString("name"));
            truck.setModel(resultset.getString("model"));
            truck.setCapacity(resultset.getInt("capacity"));
            truck.setDriver_name(resultset.getString("driver_name"));
        }
        return truck;
    }
    public void updateTruck(Truck truck, int id) throws SQLException {
        Connection connection=connectionDemo.getconnection();
        String query="update Truck set name=?, model=?, capacity=?, driver_name=? where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setString(1, truck.getName());
        preparestatement.setString(2, truck.getModel());
        preparestatement.setInt(3, truck.getCapacity());
        preparestatement.setString(4, truck.getDriver_name());
        preparestatement.setInt(5, id);
        int rowImpacted=preparestatement.executeUpdate();
        System.out.println("rowImpacted: "+rowImpacted);
    }
    public List<Truck> getAllTruck() throws SQLException {
        Connection connection=connectionDemo.getconnection();
        Statement statement=connection.createStatement();
        String query="select * from Truck";
        ResultSet resultset=statement.executeQuery(query);
        List<Truck> l=new ArrayList<>();
        while(resultset.next()){
            Truck truck=new Truck("", "", 0, "");
            truck.setId(resultset.getInt("id"));
            truck.setName(resultset.getString("name"));
            truck.setModel(resultset.getString("model"));
            truck.setCapacity(resultset.getInt("capacity"));
            truck.setDriver_name(resultset.getString("driver_name"));
            l.add(truck);
        }
        return l;
    }
    public void deleteTruck(int id) throws SQLException {
        Connection connection=connectionDemo.getconnection();
        String query="delete from Truck where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setInt(1, id);
        int rowImpacted=preparestatement.executeUpdate();
        System.out.println("row Impacted: "+rowImpacted);
    }
}
