package com.example.GraphQL.Spring.Boot.Models;

public record Author(Integer id, String firstName, String lastName) {

    public String fullName(){
        return firstName + " " +lastName;
    }
}
