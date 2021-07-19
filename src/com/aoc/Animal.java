package com.aoc;

public class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void walk(){
        System.out.println("walking..");
    }

}
