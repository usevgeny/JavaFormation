package com.formation;

import java.util.Scanner;

public class PyramidToCommandline {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int height = sc.nextInt();
        for (int i=1;i<height+1;i++)
            {
                for(int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();

            }
        for (int i=height-1;i>0;i--)
        {
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}
