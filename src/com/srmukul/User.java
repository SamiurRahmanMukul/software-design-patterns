package com.srmukul;

public class User {
    // Fields (attributes)
    public String name;

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Methods
    public void printName() {
        System.out.println("Name: " + this.name);
    }
}
