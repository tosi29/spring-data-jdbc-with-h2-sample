package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SampleService {

    CustomerRepository customerRepository;

    public SampleService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Optional<Customer> referCustomer(Long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> referCustomers() {
        return customerRepository.findAll();
    }

    public void addCustomer() {
        customerRepository.save(Customer.of("Sample", "Customer"));
    }
}
