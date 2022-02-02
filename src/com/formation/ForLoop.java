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


        int[] arr = {1, 2, 3, 5, 16};
        int sum = 0;
        for (int number : arr){
            sum+=number;
            System.out.println("Added "+number+"\n Sum is now "+sum);
        }
        System.out.println("The result is now "+sum);


       // foreach -- a kind of shortcut word

        /*for (;;) {

         } */ //- infinite loop;

    }
}
