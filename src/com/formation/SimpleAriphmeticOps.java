package com.formation;

public class SimpleAriphmeticOps {


    public static void main(String[] args){

        int x = 1;
        int y;

        y=++x; //prefix syntax ; output is x:2, y:2
        // y=x++; output is x:2, y:1 postfix
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        ///
        int a = 1;
        int b = 2;
        int c;
        int d;
        c =++b;
        d =a++;
        c++;
        System.out.println("a: "+a);
        System .out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);

    }
}
