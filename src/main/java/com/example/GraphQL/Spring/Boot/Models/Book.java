package com.example.GraphQL.Spring.Boot.Models;

public record Book(Integer id, String title, Integer pages, Rating rating, Author author ) {
}
