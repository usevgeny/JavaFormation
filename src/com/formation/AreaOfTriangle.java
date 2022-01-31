package com.formation;

import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter A side of a triangle: ");
        int A = sc.nextInt();

        System.out.print("Please, enter B side of a triangle: ");
        int B = sc.nextInt();

        System.out.print("Please, enter C side of a triangle: ");
        int C = sc.nextInt();
        double halfPerimeter = ((A+B+C)/2);
        double triangleArea = Math.sqrt(halfPerimeter*((halfPerimeter-A)*(halfPerimeter-B)*(halfPerimeter-C)));

        System.out.println("Triangle area is: " + triangleArea);

    }

}
