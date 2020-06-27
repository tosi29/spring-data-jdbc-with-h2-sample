package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SampleService {

    CustomerRepository customerRepository;

    public SampleService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String referCustomer(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElseThrow(() -> new RuntimeException("Customer is not found")).fullname().toString();
    }

    public List<String> referCustomers() {
        return customerRepository.findAll().stream().map(x -> x.fullname().toString()).collect(Collectors.toList());
    }

    public void addCustomer() {
        customerRepository.save(Customer.of(new FirstName("Sample"), new LastName("Customer")));
    }
}
