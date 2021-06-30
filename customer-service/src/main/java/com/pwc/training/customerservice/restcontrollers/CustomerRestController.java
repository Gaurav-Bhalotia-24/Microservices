package com.pwc.training.customerservice.restcontrollers;

import com.pwc.training.customerservice.model.Customer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping(path = "/customers")
public class CustomerRestController {


    @GetMapping(produces = {MediaType.APPLICATION_STREAM_JSON_VALUE})
    public Flux<Customer> handleGetCustomers() {

//        List<Customer> customers =
//                Arrays.asList(new Customer(101,
//                        "PWC",
//                        "Chennai"));
        Flux<Customer> customers =
                Flux.interval(Duration.ofSeconds(1))
                        .map(x -> {
                            Customer customer = new Customer(Long.valueOf(x + 1).intValue(),
                                    "Customer Name : " + x, "Address : " + x);
                            return customer;
                        })
                        .take(10)
                        .log();

        return customers;

    }


}
