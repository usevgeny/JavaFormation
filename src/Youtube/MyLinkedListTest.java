package Youtube;

public class MyLinkedListTest {

	
	public static void main(String[] args) {
		ListNode<String> start= new ListNode<String>("Apple",
								new ListNode<String>("Banana",
								new ListNode<String>("Cherry", null)));
	
	
	
	System.out.println(start.toString());
	System.out.println(start.getValue());
	System.out.println(start.getNext().getValue());
	
	System.out.println(start.getNext().getNext().getValue());
	
	// Another way to create a linked list
	
	
	
	ListNode<String> a = new ListNode<String>("Cherry", null);
	ListNode<String> b = new ListNode<String>("Banana", a);
	ListNode<String> c = new ListNode<String>("Apple", b);
	
	
	// output tests
	

	System.out.println(a.getValue());
	System.out.println(b.getValue());
	System.out.println(c.getValue());
	
	// or the same as in the previous example
	
	System.out.println(c.toString());
	System.out.println(c.getValue());
	System.out.println(c.getNext().getValue());
	
	System.out.println(c.getNext().getNext().getValue());
	
	// while loop
	
	System.out.println("\n\n WhileLoop:\n ************");
	while(start != null) { 
		
		
		System.out.println(start.getValue());  // ath this point it is a n infinite loop as we never progressing to the newt node
		start = start.getNext();
	}
	
	
	

	
	
	}
	
}
