package IteratorSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,23,4,5,6,7,8));
		
		
		ListIterator<Integer> listIterator = integers.listIterator();
		
		listIterator = integers.listIterator(3); //listiterator from a specific positon
		System.out.println("Previsous : "+listIterator.previous());
		
		listIterator.set(35);
		System.out.println("Next element after 'set35' "+listIterator.next());
	
		listIterator.add(21);
		System.out.println("Previous element after 'add21' "+listIterator.previous());
		
		//remove method removes the lst item that was returned either by next or previous method
		
		listIterator.remove();
		System.out.println(integers);
	}

}
