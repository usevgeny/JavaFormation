package com.formation;


import java.util.Scanner;
public class DemoEnumHW {


public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Please, enter message type to check it priority: ");
			String userInput = sc.next();
			

			if (isValidMessageType(userInput)) {
				MessageType messagetype = MessageType.valueOf(userInput.toUpperCase());
				System.out.println(messagetype.getPriority());
				
				break;
					
				
				
			} else {
				System.out.println("Please, enter valid "
						+ "message type. Only 'A', 'B', 'C' or 'D' are allowed");
				continue;
			}

		}

	}

	private static boolean isValidMessageType(String userInput) {
		
		return userInput.charAt(0) == 'A'|userInput.charAt(0) == 'B'|userInput.charAt(0) == 'C'|userInput.charAt(0) == 'D';
		
			}

}

