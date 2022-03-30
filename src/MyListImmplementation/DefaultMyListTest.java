package MyListImmplementation;

public class DefaultMyListTest {
public static void main(String[] args) {
	DefaultMyList testList = new DefaultMyList();
	String a = "banana";
	String b = "cherry";
	String c = "ananas";
	String d = "melon";
	
	testList.add(a);
	testList.add(b);
	testList.add(c);
	testList.add(d);
	testList.remove(d);
	System.out.println(testList.toString());
	System.out.println(testList.size());
}
}
