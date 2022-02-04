package com.formation;

public class PrintMatrixToConsole {

    public static void main(String[] args){

        int[][] matrix = {
                {1, 2, 3, 4, 5,},
                {6, 7},
                {8, 9, 10}
        };

		for (int[] arrayselem: matrix){
            for (int element: arrayselem){
                System.out.print(element+" ");

            }
            System.out.println();


        }
    }

}


