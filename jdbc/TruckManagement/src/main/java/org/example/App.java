package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        TruckService truckservice=new TruckService();
        Scanner sc=new Scanner(System.in);
        while(true){
            int a=sc.nextInt();
            if(a==0) break;
            switch (a){
                case 1:
                    String name=sc.next();
                    String model=sc.next();
                    int capacity=sc.nextInt();
                    String driver_name=sc.next();
                    truckservice.addTruck(new Truck(name, model, capacity, driver_name));
                    break;
                case 2:
                    int id=sc.nextInt();
                    Truck truck=truckservice.getTruckById(id);
                    System.out.println(truck);
                    break;
                case 3:
                    List<Truck> l=truckservice.getAllTruck();
                    for(Truck obj: l){
                        System.out.println(obj);
                    }
                    break;
                case 4:
                    int ind=sc.nextInt();
                    truckservice.deleteTruck(ind);
                    break;
                default:
                    System.out.println("Take some other input");
                    break;
            }
        }
    }
}
