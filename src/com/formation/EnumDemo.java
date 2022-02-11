package com.formation;

public class EnumDemo {
	
	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
		
		case HIGH: 
			System.out.println("High level of priority")	;
		break;
		case MEDIUM: 
			System.out.println("Medium level of priority")	;
		break;
		case LOW: 
			System.out.println("Low level of priority")	;
		break;
		}
	}

}
