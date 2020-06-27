package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class Customer {
    @Id
    private final Long id;

    private final String firstName;
    private final String lastName;

    public static Customer of(String firstName, String lastName) {
        return new Customer(null, firstName, lastName);
    }

    public Customer withId(Long id) {
        return new Customer(id, firstName, lastName);
    }

}
