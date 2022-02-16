package com.formation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class scratch {
	
	public static void main(String[] args) {
		
		byte a= (byte) 10000001;
		System.out.println(a);
		int b = 1;
		String[] scratchArray = new String[3];
		
		int c;
		c= scratchArray.length;
		
		
		System.out.println(b<<1);
		System.out.println("This is an scratch array length:    "+c);
		System.out.println("This is an scratch array length after shifting to the left:    "+(c<<1));
	
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3));
		
		for (int i=0;i<10;i++) {
			list3.add(i);
			
		}
		
		list3.add(123);
		System.out.println("List3 before removing of elements"+list3);
		list3.remove(0);
		System.out.println("List3 after removing of elements"+list3);
		for (int i=0;i<5;i++) {
			list3.remove(0);
			
		}
		System.out.println("List3 after sequence of removing of elements"+list3);
	}
	
	
	

}
