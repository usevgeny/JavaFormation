package IteratorHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DefaultMyListTest {
public static void main(String[] args) {
	DefaultMyListCorrection testList = new DefaultMyListCorrection();
	String a = "banana";
	String b = "cherry";
	String c = "ananas";
	String d = "melon";
	String t = "utka";
	
	testList.add(a);
	testList.add(b);
	testList.add(c);
	testList.add(d);
	String testString=a;
	DefaultMyListCorrection testArray = new DefaultMyListCorrection();
	//testArray.add(a);
	//testArray.add(b);
	testArray.add(t);
	System.out.println(testList.remove(c));
	System.out.println("Contains: "+testString+" "+testList.contains(testString));
	
	System.out.println("Contains: "+" "+testList.containsAll(testArray));
	
	System.out.println(testList.toString());
	System.out.println(testList.size());
	for(Object elem:testList.toArray()) 
		{
		System.out.println(elem);
		}
	
	Object[] arr1 = testList.toArray();
	
	//testList.clear();
	System.out.println(testList.toString());
	System.out.println(testList.size());
	
	
	System.out.println("getNodeByIndex: "+testList.getNodeByIndex(2));
	
	Iterator<Object> iterator = testList.iterator();
	
	
	System.out.println("Iterator next: "+iterator.hasNext());
	System.out.println("Iterator next: "+iterator.next());
	System.out.println("Iterator next: "+iterator.hasNext());
	System.out.println("Iterator next: "+iterator.next());
	System.out.println("Iterator next: "+iterator.hasNext());
	System.out.println("Iterator next: "+iterator.next());
	System.out.println("Iterator next: "+iterator.hasNext());
	
	List<Integer> ints = new ArrayList<>(Arrays.asList(1,2,3,4,5, 6,7,8,9,10,11,12));
	Iterator<Integer>iteratorInts = ints.iterator();
	
	System.out.println(iteratorInts.next());
	System.out.println(iteratorInts.next());
	System.out.println(iteratorInts.toString());
	
	
}
}
