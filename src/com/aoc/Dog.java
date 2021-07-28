package com.aoc;

public class Dog extends Animal{

    String race;

    Dog(String name, int age, String race){
        super(name, age);
        this.race = race;
    }

    @Override
    public void walk(){
        System.out.println("the dog is walking..");
    }

    @Override
    public String toString() {
        return  super.toString() + " type = Dog{" +
                "race='" + race + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("dog loves bones");
    }
}
