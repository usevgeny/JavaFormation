package MyListImmplementation;

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
	
	testList.clear();
	System.out.println(testList.toString());
	System.out.println(testList.size());
}
}
