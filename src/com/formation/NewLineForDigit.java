package com.formation;


import java.util.Scanner;

public class NewLineForDigit {

    public static void main(String[] args) {
        System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner (System.in);
        String userinput = sc.nextLine();
        char[] userarr = userinput.toCharArray();
        for(char c:userarr){
            System.out.print(c+"\n");
        }


        System.out.print("Please, enter height of the pyramid: ");

        int height = sc.nextInt();
        String pyr="";
        for (int i=0, k=height*2;i<=height*2 & k>=0;i++,k--){

            if(i<=height){
                pyr+="*";
                System.out.println(pyr);}
            else {

                System.out.println(pyr.substring(0, k));}
            }






}

}