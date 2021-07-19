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
}
