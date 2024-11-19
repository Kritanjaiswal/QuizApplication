package org.example;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        HotelManagement hotelservice=new HotelManagement();
        hotelservice.addHotel(new Hotel("xyz", "hfdgdgdghd", 90, "hghfhfhy"));
        hotelservice.addHotel(new Hotel("xyz", "hfdgdgdghd", 90, "hghfhfhy"));
        hotelservice.addHotel(new Hotel("xyz", "hfdgdgdghd", 90, "hghfhfhy"));
        hotelservice.addHotel(new Hotel("xyz", "hfdgdgdghd", 90, "hghfhfhy"));
        hotelservice.addHotel(new Hotel("xyz", "hfdgdgdghd", 90, "hghfhfhy"));
        
    }
}
