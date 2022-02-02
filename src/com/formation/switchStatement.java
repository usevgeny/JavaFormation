package com.formation;

import java.util.Scanner;

public class switchStatement {

    public static void main(String[] args){
        /*
        String customerStatus = "anonymous client";

        switch (customerStatus) {

            case "Premium client": System.out.println("Hello you have a premium status");
            break;
            case "anonymous client": System.out.println("Hi, anonymous ");
            break;
            case "Golden cart": System.out.println("Happy to see yo among our VIP clients");
            break;
            case "default": System.out.println("welcome to our shop");

        }*/

        System.out.println("Please, enter action name: ");

        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        switch (userInput){

            case "login" : System.out.println("Please enter your name");
            break;
            case "sign_up" : System.out.println("Welcome");
                break;
            case "terminate_program" : System.out.println("Thank you! Good bye!");
                break;
            case "main_menu" : System.out.println("Main menu");
                break;
            case "about_app" : System.out.println("This app is lorem ipsum");
                break;
            default : System.out.println("Please, enter one of these values: login, sign_up, terminate_program, main_menu, about_app");


        }


    }


}
