package com.github.toficzak.simple_rabbit_checker.example;

import jakarta.validation.constraints.NotBlank;

public class ValidatedBook {
    @NotBlank
    public String name;

    @Override
    public String toString() {
        return "ValidatedBook{" +
                "name='" + name + '\'' +
                '}';
    }
}
