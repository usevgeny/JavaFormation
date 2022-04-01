package IteratorSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorDemo {
	
	public static void main(String[] args) {
	Integer[] arr1 = new Integer[]{1,2,3,4,5};
	
	List<Integer> listArr1 = Arrays.asList(arr1);
	
	List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5, 6,7,8,9,10,11,12));
	
	
	
	System.out.println("Here is anarray arr1, transformed to a list "+listArr1.toString());
	
	System.out.println("===========ITERATOR DEMO===========");
	
	Iterator<Integer>iterator = integers.iterator();
	
	while(iterator.hasNext()) {
		
		System.out.println(iterator.next());
		
	}
	System.out.println("===========ITERATOR CAN'T BE RESET AUTOMATICALLY===========");
	
	if(!iterator.hasNext()) {System.out.println("if we are in this section it means that  no other elemnts in our iterator ");}
	
	// we can use the same method and initialize it with a new iterator object like this: iterator=intergers.iterator();
	
	System.out.println("\n\n===========ITERATOR REMOVE DEMO===========");
	
	
	iterator=integers.iterator();
	
	while(iterator.hasNext()){
		
		int nextInt = iterator.next();
		if(nextInt%2==0) {
			iterator.remove();
		}
	};
	
	System.out.println(integers);
	/*
	 * System.out.println("\n\n===========ITERATOR REMOVE: ERROR DEMO===========");
	 * 
	 * iterator=integers.iterator(); iterator.remove();
	 */
	/*
	 * System.out.
	 * println("\n\n===========ITERATOR REMOVE: CONCURRENT MODIFICATIONERROR DEMO==========="
	 * );
	 * 
	 * iterator=integers.iterator();
	 * 
	 * while(iterator.hasNext()){
	 * 
	 * int nextInt = iterator.next();
	 * 
	 * integers.remove(0); int nextElement = iterator.next();
	 * System.out.println(nextElement);
	 * 
	 * };
	 * 
	 * System.out.println(integers);
	 */
	
	System.out.println("\n\n===========FAIIL SAFE ITERATOR DEMO===========");
	List<Integer> threadSafeList = new CopyOnWriteArrayList<>(integers); 
	iterator = threadSafeList.iterator(); // A SNAPSHOT IS CREATED AND IT SI NOT UPDATED AFTER CREATION
	threadSafeList.add(100);
	System.out.println("before while loop"+threadSafeList);
	while(iterator.hasNext()) {
		
		
		threadSafeList.remove(0);
		int nextElement = iterator.next();
		System.out.println(nextElement);
		
	}
	System.out.println("New element is absent and is not taken into acconunt in this while loop");
	System.out.println("after while loop"+threadSafeList);
	
	// the main drawback of this method is that there is a risk to have data which is not up to date
	
	
	System.out.println("\n\n=========== ITERATOR WEAKLY CONSISTENT DEMO===========");
	// THIS ITERATOR CAN REFLECT SOME BUT NOT ALL OF THE CHANGES TO THE COLLECTIONS SINCE THE ITERATOR IS CREATED
	
	
	Collection<Integer> deque = new ConcurrentLinkedDeque<>(integers); 
	iterator = deque.iterator(); // A SNAPSHOT IS CREATED AND IT SI NOT UPDATED AFTER CREATION
	deque.add(100);
	System.out.println("before while loop"+deque);
	while(iterator.hasNext()) {
				
		//deque.remove(0);
		
		int nextElement = iterator.next();
		System.out.println(nextElement);
		
	}
	System.out.println("after while loop"+deque);
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
