package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SampleApi {

    private final SampleService sampleService;

    public SampleApi(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping("/customer/{id}")
    public String referCustomerFullName(@PathVariable("id") Long id) {
        return sampleService.referCustomer(id);
    }

    @RequestMapping("/customers/all")
    public List<String> referCutomers() {
        return sampleService.referCustomers();
    }

    @RequestMapping("/addcustomer")
    public String addCustomer() {
        sampleService.addCustomer();
        return "success";
    }
}
