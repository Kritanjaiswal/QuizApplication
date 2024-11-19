package org.example;

public class Hotel {
    int id;
    String name;
    String address;
    int capacity;
    String Manager_name;

    public Hotel(String name, String address, int capacity, String manager_name) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        Manager_name = manager_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getManager_name() {
        return Manager_name;
    }

    public void setManager_name(String manager_name) {
        Manager_name = manager_name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", capacity=" + capacity +
                ", Manager_name='" + Manager_name + '\'' +
                '}';
    }
}
