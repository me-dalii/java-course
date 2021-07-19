package com.aoc;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        Animal a = new Animal("bechbech",1);
        a.walk();
        System.out.println(a.name);

        Cat c = new Cat("toto",2,"black");
        c.walk();
        c.sleep();


    }
}
