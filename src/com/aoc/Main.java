package com.aoc;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // this is a comment

        /*

        comment

         */



        long xx = 555555555;
        float y = 2.5f;
        char z = 'z';
        boolean t = false;

        String s = "project";

        int x = 10;
        double yy = x;
        //System.out.println(yy);

        double d = 2.5d;
//        int i = (int) d;


/*
        if((1 == 10)){
            System.out.println(!(1 == 10));
        }else if(true && true){
            System.out.println(false);
        }else{

        }
*/


        for (int i = 0; i<10; i++){
            if (i == 5){
                continue;
            }
            //System.out.println(i);
        }
/*
        while(true){
            x++;
            System.out.println(x);
            break;
        }

        do {
            x++;
            System.out.println(x);
            break;
        }while (true);
*/
  /*      String ch = "fsb";
        switch (ch){
            case "aoc" :
                System.out.println("yes");
                break;
            case "fsb" :
                System.out.println("no");
                break;
            default:
                System.out.println("idk");
        }
*/
        int[] tab = new int[6];
        tab[0] = 20;
        tab[1] = 100;
/*
        for (int i = 0; i< tab.length; i++){
            System.out.println(tab[i]);
        }

        for (int i : tab){
            System.out.println(i);
        }
*/

        /* *********Main************ */

        //Animal a = new Animal("bechbech",1);
       // a.walk();
        //a.setName("katkout");
        //System.out.println(a.getName());

        //Animal aa = new Animal();
       // System.out.println("***" + aa.getName());
       // aa.walk(50);



        Cat c = new Cat("toto",2,"black");
       // c.walk();
       // c.sleep();

        Dog dog = new Dog("max",4,"caniche");
       // System.out.println(dog.race);
       // dog.walk();


        Animal p;

        Dog g = new Dog("z",5,"r");
        //p = g;


        Dog d1 = new Dog("max",5,"r");
        Dog d2 = new Dog("rex",1,"t");
        Cat c1 = new Cat("bechbech",2,"white");

        Animal[] home = new Animal[3];

        home[0] = d1;
        home[1] = d2;
        home[2] = c1;

        System.out.println(d1);


        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        try{
            System.out.println(5 / num);
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("done");
    }
}
