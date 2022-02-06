package com.formation;
import java.util.Scanner;

public class rectangleDrawing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of rectangle: ");
        int height = sc.nextInt();
        System.out.print("Please, enter width of rectangle: ");
        int width = sc.nextInt();

        drawRectangle(height, width);
    }

    public static void drawRectangle(int height, int width) {
		drawHorizontal(width);
        drawVertical(height, width);
        System.out.println();
        drawHorizontal(width);


    }

    public static void drawHorizontal(int width) {
        for (int i=0;i<width;i++){
            System.out.print("*");
        }

    }

    public static void drawVertical(int height, int width){
        for (int i=0; i<height-2;i++){

            System.out.print("\n*");
            for (int j=1;j<width-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");

        }

    }


}
