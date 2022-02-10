package com.formation;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter length of initial array: ");
        int baseArrayLength = sc.nextInt();
        int[] arr = generateRandomArray(baseArrayLength);
        int[] extendedArray = extendArray(arr);
        System.out.println("*** Initial array ***");
        System.out.println(Arrays.toString(arr));
        System.out.println("*** Extended array ***");
        System.out.println(Arrays.toString(extendedArray));
    }

    /**
     * The method extends array.
     * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
     * is returned from this method.
     *
     * @param arr - base of extension. Extended array contains elements from this array
     * and additionally contains the same elements multiplied by two.
     * @return extended array.
     */
    public static int[] extendArray(int[] arr) {
        int[] extArr = new int[arr.length*2];
        int i = 0;
        int j=0;
        for (i=0;i<arr.length*2;i++){
            if (i<arr.length){
                extArr[i]=arr[i];
            }
            else{
                extArr[i] =arr[j]*2;
                j++;
            }
        }
        return extArr;
    }

    public static int[] generateRandomArray(int amountOfElements) {

        int[] arr = new int[amountOfElements];
        Random r = new Random();
        for (int i=0; i<amountOfElements;i++){
            arr[i]=r.nextInt(amountOfElements);
        }
        return arr;

    }

}