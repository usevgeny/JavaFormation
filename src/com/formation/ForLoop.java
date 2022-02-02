package com.formation;

import java.util.Arrays;

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

        for (int number: arr){
            if( number%2==0 ){
                continue;
            }
            else{
                System.out.println("odd number from the array"+Arrays.toString(arr) +": "+number);
            }
        }


        for (int number: arr){
            if( number%2==0 ){
                break;
            }
            else{
                System.out.println("odd number from the array"+Arrays.toString(arr) +": "+number +"until we find an even number");
            }
        }
        // in case of nested loops tbreak finishes the closest loop; so if in nested, only the nested loop will be finished

    }
}
