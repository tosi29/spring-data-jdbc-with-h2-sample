package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SampleApi {

    private final SampleService sampleService;

    public SampleApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("/customer/{id}")
    public Optional<Customer> referCustomer(@PathVariable("id") Long id) {
        return sampleService.referCustomer(id);
    }

    @RequestMapping("/customers/all")
    public List<Customer> referCutomers() {
        return sampleService.referCustomers();
    }

    @RequestMapping("/addcustomer")
    public String addCustomer() {
        sampleService.addCustomer();
        return "success";
    }
}
