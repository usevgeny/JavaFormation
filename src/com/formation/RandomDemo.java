package com.formation;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args){

        Random r= new Random();
        System.out.println(r.nextInt()); // any random int
        System.out.println(r.nextInt(100)); // any random int from 0 to 99
        System.out.println(r.nextInt(100)+1); // any random int from 1 to 100




    }
}
