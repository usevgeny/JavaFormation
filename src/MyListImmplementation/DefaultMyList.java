package MyListImmplementation;



public class DefaultMyList implements MyList{
	
	/**
     * Pointer to first node.
     */

	private ListNode<Object> head;
	private ListNode<Object> current;
	private ListNode<Object> previous;
	private int size=0;

	@Override
	public void add(Object e) {

		ListNode<Object> newNode = new ListNode<Object>(e, null);
		if(head == null) {
			head = newNode;
		}
		else
		{
			current = head;
			
			while (current !=null) {
				previous = current;
				current = current.getNext();
						
				
			}
			
			previous.setNext(newNode);
		}
		size+=1;
				
	}

	@Override
	public void clear() {
				
		for(int i=0;i<size;i++) {
			ListNode<Object> remove = head;
			if (head!=null) {
				head=head.getNext();
				size-=1;
				}
			}
		head=null;
		size=0;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(Object o) {

		ListNode start = head;
		//int index = 0;
		/*while(start != null) { 
			
			if(start.getValue().equals(o)) {
				
				start=null;
				
				size-=1;
				return true;
				
			}
						// at this point it is a n infinite loop as we never progressing to the newt node
			start = start.getNext();
		}*/
		
		ListNode<Object> remove = head;
		if (head!=null) {
			head=head.getNext();
			size-=1;
			return true;
		}
		return false;
		
		
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		ListNode start = head;
		int index = 0;
		for(int i=0; i<size;i++) { 
			
			result[index++] = start.getValue();
						// at this point it is a n infinite loop as we never progressing to the newt node
			start = start.getNext();
		}
		/*int index = 0;
		for (ListNode x = head; x != null; x = x.next) {
			result[index++] = x.getValue();
		}*/
		return result;
	}
	

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String toString() {
		
		String result="";
		ListNode start = head;
		while(start != null) { 
			
			result = result+start.getValue()+(start.getNext()!=null?","+" ":"");  // ath this point it is a n infinite loop as we never progressing to the newt node
			start = start.getNext();
		}
		
		return "[{"+result+"}]";
	}
	
	private static class ListNode<E> {
		
		private E value;
		private ListNode<E> next;
		public ListNode(E newVal, ListNode<E>newNext) {
			
				value = newVal;
				next = newNext;
			
		}
		public E getValue() {
			return value;
		}
		public void setValue(E value) {
			this.value = value;
		}
		public ListNode<E> getNext() {
			return next;
		}
		public void setNext(ListNode<E> next) {
			this.next = next;
		}
		@Override
		public String toString() {
			return value.toString();
		}
		
		
		
	}

}
