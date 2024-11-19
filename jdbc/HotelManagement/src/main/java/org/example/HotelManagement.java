package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelManagement {
    public void addHotel(Hotel hotel) throws SQLException {
        Connection connection=ConnectionDemo.getConnection();
        String query="insert into Hotel (name, address, capacity, Manager_name) values (?, ?, ?, ?)";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setString(1, hotel.getName());
        preparestatement.setString(2, hotel.getAddress());
        preparestatement.setInt(3, hotel.getCapacity());
        preparestatement.setString(4, hotel.getManager_name());
        int rowImpacted=preparestatement.executeUpdate();
        System.out.println("rowImpacted"+rowImpacted);
    }

    public Hotel getHotelById(int id) throws SQLException {
        Hotel hotel=new Hotel("", "", 0, "");
        Connection connection=ConnectionDemo.getConnection();
        String query="select * from Hotel where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setInt(1, id);
        ResultSet resultset=preparestatement.executeQuery();
        if (resultset.next()) {
            hotel.setId(resultset.getInt("id"));
            hotel.setName(resultset.getString("name"));
            hotel.setAddress(resultset.getString("address"));
            hotel.setCapacity(resultset.getInt("capacity"));
            hotel.setManager_name(resultset.getString("Manager_name"));
        }
        return hotel;
    }

    public void updateHotel(Hotel hotel) throws SQLException {
        int id=hotel.getId();
        Connection connection=ConnectionDemo.getConnection();
        String query="update Hotel set name=?, address=?, capacity=?, Manager_name=? where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setString(1, hotel.getName());
        preparestatement.setString(2, hotel.getAddress());
        preparestatement.setInt(3, hotel.getCapacity());
        preparestatement.setString(4, hotel.getManager_name());
        preparestatement.setInt(5, id);
        int rowImpacted=preparestatement.executeUpdate();
    }

    public List<Hotel> getAllTruck() throws SQLException {
        Connection connection=ConnectionDemo.getConnection();
        Statement statement=connection.createStatement();
        String query="select * from Hotel";
        ResultSet resultset=statement.executeQuery(query);
        List<Hotel> l=new ArrayList<>();
        while(resultset.next()){
            Hotel hotel=new Hotel("", "", 0, "");
            hotel.setId(resultset.getInt("id"));
            hotel.setName(resultset.getString("name"));
            hotel.setAddress(resultset.getString("address"));
            hotel.setCapacity(resultset.getInt("capacity"));
            hotel.setManager_name(resultset.getString("Manager_name"));
            l.add(hotel);
        }
        return l;
    }

    public void deleteTruck(int id) throws SQLException {
        Connection connection=ConnectionDemo.getConnection();
        String query="delete from Hotel where id=?";
        PreparedStatement preparestatement=connection.prepareStatement(query);
        preparestatement.setInt(1, id);
        int rowImpacted=preparestatement.executeUpdate();
        System.out.println("row Impacted: "+rowImpacted);
    }
}