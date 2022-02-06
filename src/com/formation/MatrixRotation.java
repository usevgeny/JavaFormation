package com.formation;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Please, enter matrix size: ");
        int size = in.nextInt();
        double[][] matrix = generateMatrix(size);


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

        switch (mode){
            case 1:
                System.out.println("90 degrees rotated:" + System.lineSeparator());
                rotate90(matrix);
                break;

            case 2:
                System.out.println("180 degrees rotated:" + System.lineSeparator());
                rotate180(matrix);
                break;

            case 3:
                System.out.println("270 degrees rotated:" + System.lineSeparator());
                rotate270(matrix);
                break;
            default:
                System.out.println("You selected non-existing mode!");
                return false;
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

       for (int i=0,e=0; i<matrix.length;i++,e++){

           for (int j = matrix.length-1,f=0;j>-1;j--,f++){
               matrix[e][f]=matrix[j][i];
           }
       }
        }


    public static void rotate180(double[][] matrix) {
        double [][] temp = new double[matrix.length][matrix[0].length];
        for (int i=matrix.length-1, e=0;i>-1;i--,e++)
        {
            for (int j=matrix[i].length-1,f=0;j>-1;j--,f++){
                temp[e][f]=matrix[i][j];
            }

        }

        for (int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }
    }


    public static void rotate270(double[][] matrix) {
        double [][] temp = new double[matrix.length][matrix[0].length];
        for (int i=matrix.length-1,e=0; i>-1;i--,e++){

            for (int j = 0,f=0;j<matrix[i].length;j++,f++){
                temp[e][f]=matrix[j][i];
            }
        }

        for (int i=0; i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[i][j]=temp[i][j];
            }
        }


    }




}