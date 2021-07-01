package com.pwc.training.customerservice;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pwc.training.customerservice.model.Customer;
import com.pwc.training.customerservice.model.CustomerAddress;

import java.util.Arrays;
import java.util.List;

public class JacksonDemo {


    public static void main(String[] args) throws JsonProcessingException {

        Customer customer1 = new Customer(101, "IBM", "Mumbai",

                Arrays.asList(new CustomerAddress("High Street", "Lokhandwala"),
                        new CustomerAddress("Walkeshwar", "High City")));


        Customer customer2 = new Customer(101, "IBM", "Mumbai");


        ObjectMapper mapper = new ObjectMapper();
        String json1 = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(customer1);
        System.out.println(json1);


        List<Customer> customers = Arrays.asList(customer1, customer2);
        String json2 = mapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(customers);
        System.out.println(json2);


    }
}
