package com.formation;

//loops with java

public class WhileLoop {


    public static void main(String[] args){

        int counter = 0;
        while(counter <5){

            System.out.println("Counter value is :"+counter);
            counter+=1;
        }

        // while loop where operation is run at least once : do while loop


        int counter2 = 0;

        do {
            System.out.println("Enter your pin code "+counter2);
            counter2+=1;
        } while(counter2<5);

        do {
            System.out.println("Counter is already: "+counter2+" No need to check controlling condition, but at least once this program is executed");

        }while(counter2<5);




    }
}
