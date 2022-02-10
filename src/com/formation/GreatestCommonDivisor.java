package com.formation;


import java.util.Arrays;
import java.util.Scanner;

public class GreatestCommonDivisor {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter two numbers separated by space: ");
        String userInput = sc.nextLine();

        String[] inputArgumentsArray = userInput.split("\\s+");
        int number1 = Integer.parseInt(inputArgumentsArray[0]);
        int number2 = Integer.parseInt(inputArgumentsArray[1]);

        System.out.println(gcdRecursive(number1, number2));
    }
    public static int gcdRecursive(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            //for the case firstNumber is negative
            return Math.abs(firstNumber);
        } else {
            return gcdRecursive(secondNumber, firstNumber % secondNumber);
        }

    }
    /*
    public static int gcdRecursive(int firstNumber, int secondNumber) {

        StringBuilder firstDevisors= new StringBuilder();
        StringBuilder secondDevisors =  new StringBuilder();
        for (int i = 1;i<=firstNumber;i++){
            if (firstNumber%i==0){
                firstDevisors.append(String.valueOf(i)+";");
            }
        }
        for (int i = 1;i<=secondNumber;i++){
            if (secondNumber%i==0){
                secondDevisors.append(String.valueOf(i)+";");
            }
        }
        String[] firstDevsArray=firstDevisors.toString().split(";");
        String[] secondDevsArray=secondDevisors.toString().split(";");

       // System.out.println("FIRST DIVISORS"+Arrays.toString(firstDevsArray));
       // System.out.println("SECOND DIVISORS"+Arrays.toString(secondDevsArray));

        int[] commonDivisors = new int[secondDevsArray.length+firstDevsArray.length];
        int i = 0;
        if (secondNumber==0){
            i=0;
            for (String element:firstDevsArray){
                commonDivisors[i]=Integer.parseInt(element);
            }
            i++;}
            else if(firstNumber==0){
            i=0;
            for (String element:secondDevsArray){
                commonDivisors[i]=Integer.parseInt(element);
            }
            i++;}

        else if (secondDevsArray.length>firstDevsArray.length){
            i=0;
            for (String element :secondDevsArray){
                if (Arrays.asList(firstDevsArray).contains(element)){
                    commonDivisors[i]=Integer.parseInt(element);
                    i++;
                }

            }

        }
        else{
            i=0;
            for (String element :firstDevsArray){
                if (Arrays.asList(secondDevsArray).contains(element)){
                    commonDivisors[i]=Integer.parseInt(element);
                    i++;
                }
            }
        }

        //System.out.println("COMMON DIVISORS"+Arrays.toString(commonDivisors));
        int gratestInt=commonDivisors[0];
        for (int commonDivisor : commonDivisors) {
            if (commonDivisor > gratestInt) {
                gratestInt = commonDivisor;
            }
        }

        return gratestInt;

    }
*/
}