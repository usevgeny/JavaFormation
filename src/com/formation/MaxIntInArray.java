package com.formation;

import java.util.Arrays;
import java.util.Scanner;

public class MaxIntInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter integer numbers separated by space: ");

        ////
        String userInput = sc.nextLine();
        String[] strArray = userInput.split("[\\p{Space}]");
        int[] intArray = convertStrToIntArray(strArray);
        int maxInt = maxVal(intArray);
        System.out.println("*** Initial Array ***");
        System.out.println(Arrays.toString(intArray));

        System.out.println("*** Max number in array ***");
        System.out.println(maxInt);
    }

    public static int[] convertStrToIntArray(String[] strArray){
        int[] intArray = new int[strArray.length];
        for (int i=0; i<strArray.length;i++){
            intArray[i]=Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    public static int maxVal(int[] intArray){
        int maxInt = intArray[0];
        for (int elem: intArray){
            if (elem > maxInt){
                maxInt = elem;
            }
        }
        return maxInt;
    }


}