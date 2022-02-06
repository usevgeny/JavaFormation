package com.formation;

import java.util.Scanner;
public class MatrixRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);
       /* printMatrixToConsole(matrix);
        System.out.println("ROTATION 90edgrees\n");
        rotate90(matrix);
        System.out.println("ROTATION 180 dgrees\n");
        rotate180(matrix);
        System.out.println("ROTATION 270 dgrees\n");
        rotate270(matrix);
        */

        System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
                "\t1 - 90" + System.lineSeparator() +
                "\t2 - 180" + System.lineSeparator() +
                "\t3 - 270");
        int mode = in.nextInt();
        System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
        printMatrixToConsole(matrix);
        System.out.println();

        if (rotateMatrix(matrix, mode)) {
            printMatrixToConsole(matrix);
    }
    }

    public static boolean rotateMatrix(double[][] matrix, int mode){

        if(mode==1){
            rotate90(matrix);
        }
        else if
        (mode==2){
            rotate180(matrix);
        }
        else if
        (mode==3){
            rotate270(matrix);
        }

        return true;
    }

    public static void printMatrixToConsole(double[][] matrix){
        for (double[] element:matrix){
            for (double chiffre:element){
                System.out.print(chiffre+" ");
            }
            System.out.println();
        }
    };

    public static double[][] generateMatrix(int number){
        double[][] matrix =new double [number][number];
        double element;
        for (int i = 0; i<number; i++){
            element = 0;
            element +=i;
            for (int j = 0; j< number; j++){
                matrix[i][j]=element+(j/10.0);
            }
        }
        return matrix;
    }

    public static void rotate90(double[][] matrix) {

       for (int i=0; i<matrix.length;i++){

           for (int j = matrix.length-1;j>-1;j--){
               System.out.print(matrix[j][i]+" ");
           }
           System.out.println();
       }
        }


    public static void rotate180(double[][] matrix) {

        for (int i= matrix.length-1;i>-1;i--)
        {
            for (int j =matrix[i].length-1;j>-1;j--){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void rotate270(double[][] matrix) {


        for (int i=matrix.length-1; i>-1;i--){

            for (int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }




}