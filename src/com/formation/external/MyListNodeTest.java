package com.formation.external;

public class MyListNodeTest<E> {


public static void main(String[] args) {
	
	
	MyListNode<String> list = new MyListNode<String>();
	/*
	list.insertFirst("Cherry2"); 
	list.insertFirst("Banana2");
	list.insertFirst("Apple2");
	
	System.out.println(list.toString());
	
	*/
	
	
	list.insertLast("Cherry2"); 
	list.insertLast("Banana2");
	list.insertLast("Apple2");
	
	System.out.println(list.toString());
	
	list.deleteLast();
	list.deleteLast();
	System.out.println(list.toString());
	
}
	


}
