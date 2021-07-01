package com.pwc.training.customerservice.model;

import java.util.List;

public class Customer {


    private int id;
    private String name;
    private String address;
    private List<CustomerAddress> deliverAddresses;


    public Customer() {

    }

    public Customer(int id, String name, String address) {

        this(id, name, address, null);
    }

    public Customer(int id, String name, String address, List<CustomerAddress> addresses) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.deliverAddresses = addresses;

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

    public List<CustomerAddress> getDeliverAddresses() {
        return deliverAddresses;
    }

    public void setDeliverAddresses(List<CustomerAddress> deliverAddresses) {
        this.deliverAddresses = deliverAddresses;
    }
}
