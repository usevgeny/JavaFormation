package MyListImmplementation;

public class DefaultMyListCorrection implements MyList {
	
	/**
     * Pointer to first node.
     */
	private Node first;
	
	  /**
     * Pointer to last node.
     */
	private Node last;
	
	/**
	 * Total amount of elements in object of MyListImpl.
	 */
	private int size;

	@Override
	public void add(Object element) {
		final Node lastNode = last;
        final Node newNode = new Node(lastNode, element, null);
        last = newNode;
        if (lastNode == null) {
			first = newNode;
		} else {
			lastNode.next = newNode;
		}
        size++;
	}

	@Override
	public void clear() {
		for (Node x = first; x != null; ) {
			Node next = x.next;
			x.data = null;
			x.next = null;
			x.previous = null;
			x = next;
		}
		last = null;
		first = null;
		size = 0;
		
	}
	

	@Override
	public boolean remove(Object obj) {
		if (obj == null) {
			for (Node x = first; x != null; x = x.next) {
				if (x.data == null) {
					unlink(x);
					return true;
				}
			}		
		} else {
			for (Node x = first; x != null; x = x.next) {
				if (x.data.equals(obj)) {
					unlink(x);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public Object[] toArray() {
		Object[] result = new Object[size];
		int index = 0;
		for (Node x = first; x != null; x = x.next) {
			result[index++] = x.data;
		}
		return result;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(Object o) {
		if (o == null) {
			for (Node x = first; x != null; x = x.next) {
				if (x.data == null) {
					return true;
				}
			}
		} else {
			for (Node x = first; x != null; x = x.next) {
				if (x.data.equals(o)) {
					return true;
				}
			}
		}
		
		return false;
	}

	@Override
	public boolean containsAll(MyList c) {
		Object[] array = c.toArray();
		for (int i = 0; i < array.length; i++) {
			if (!contains(array[i])) {
				return false;
			};
		}	
		return true;
	}
	
	@Override
	public String toString() {
		if (first == null) {
			return "{}";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('{');
		
		for (Node x = first; x != null; x = x.next) {
			sb.append('[')
			  .append(x.data);
			
			if (x.next == null) {
				break;
			}
			sb.append(']')
			  .append(',')
			  .append(' ');
		}
		
		return sb.append(']')
				 .append('}')
				 .toString();
	}
	
	Object unlink(Node element) {
		Object obj = element.data;
		Node next = element.next;
		Node previous = element.previous;
			
		if (previous == null) {
			first = next;
		} else {
			previous.next = next;
			element.previous = null;
		}
		if (next == null) {
			last = previous;
		} else {
			next.previous = previous;
			element.next = null;
		}
			
		element.data = null;
		size--;
		return obj;	
	}

	private static class Node {
		private Object data;
		private Node next;
		private Node previous;
		
		public Node(Node previous, Object data, Node next) {
			this.next = next;
			this.previous = previous;
			this.data = data;
		}
			
		@Override
		public String toString() {
			return data.toString();
		}
		
	
		
	} 

	

}
