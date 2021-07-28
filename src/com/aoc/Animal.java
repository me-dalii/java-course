package com.aoc;

public abstract class Animal{
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(){
        name = "bechbech";
        age = 1;
    }

    public void walk(){
        System.out.println("walking..");
    }

    public void walk(int distance){
        System.out.println("walking.. for " + distance);
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void eat();

}
