package com.aoc;

public class Cat extends Animal{

    String couleur;

    Cat(String name, int age, String couleur){
        super(name,age);
        this.couleur = couleur;
    }

    void sleep(){
        System.out.println("the cat is sleeping..");
   }

    @Override
    public void walk(){
        System.out.println("the cat is walking..");
    }

    @Override
    public void walk(int distance){
        System.out.println("the cat is walking.. for a " + distance);
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "couleur='" + couleur + '\'' +
                '}';
    }

    @Override
    public void eat() {
        System.out.println("cat eat catnip");
    }
}
