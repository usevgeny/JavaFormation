package com.formation;

public class ForLoop {


    public static void main(String[] args){
            // initialisation expression, condition, iteration, or repetition of loop body
        for (int i =0; i<=10; i++){
            System.out.println("I var is equal to :"+i);
        }
        System.out.println("===============for loop comma usage");
        for (int j = 0, k = 10; j<=10 & k>0; j++,k--){
            System.out.println("I var is equal to :"+j);
            System.out.println("I var is equal to :"+k);
        }

        /*for (;;) {

         } */ //- infinite loop;

    }
}
