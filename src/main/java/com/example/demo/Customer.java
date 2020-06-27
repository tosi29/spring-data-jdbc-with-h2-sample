package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Embedded;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {
    @Id
    private final Long id;

    @Embedded(onEmpty = Embedded.OnEmpty.USE_EMPTY)
    private final FirstName firstName;

    @Embedded(onEmpty = Embedded.OnEmpty.USE_EMPTY)
    private final LastName lastName;

    public static Customer of(FirstName firstName, LastName lastName) {
        return new Customer(null, firstName, lastName);
    }

    public Customer withId(Long id) {
        return new Customer(id, firstName, lastName);
    }

    public FullName fullname() {
        return new FullName(firstName, lastName);
    }
}
