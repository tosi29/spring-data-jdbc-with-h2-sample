package com.example.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FullName {
    private final FirstName firstName;
    private final LastName lastName;

    @Override
    public String toString() {
        return firstName.getFirstName() + " " + lastName.getLastName();
    }
}
