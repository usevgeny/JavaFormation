package IteratorHomeWork;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DefaultMyListCorrection implements MyList {
	
	
	
	/**
	 * An iterator over a collection.
	 * 
	 */
	

	private class IteratorImpl implements Iterator<Object> {
		
		int cursor = 0;
		int lastRet = -1; //to keep track on last returned wich is -1 less tahn cursor
		@Override
		public boolean hasNext() {
			return cursor != size; }// if cusor is less then size , then it is not equal to size and it is true, 
									//than hasNext = true, otherwise - false

		@Override
		public Object next() {
			Object next = getNodeByIndex(cursor);
			if (next == null) {
				throw new NoSuchElementException();
			}
			lastRet = cursor;
			cursor += 1;
			return next;	
		}
		
		@Override
		public void remove() {
			if (lastRet < 0) {
				throw new IllegalStateException();
			}
			DefaultMyListCorrection.this.removeNodeByIndex(lastRet);
			if (lastRet < cursor) {
				cursor--;
			}
            lastRet = -1;
		}
		
	}
	
	
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
	
	
	
	public Node getNodeByIndex(int index) {
		if (index > (size -1)) {
			return null;
		}

        Node x = first; // then we iterate over every element from the beginning to the index
        for (int i = 0; i < index; i++) {
				x = x.next; 
			}
            return x;
	}
	
	
	public Node getNodeByIndexRefactored(int index) {
		if (index > (size -1)) {
			return null;
		}
		
		if (index < (size/2)) { // if index is less then the middle of the list 
            Node x = first; // then we iterate over every element from the beggining to the index
            for (int i = 0; i < index; i++) {
				x = x.next; 
			}
            return x;
        } else {
            Node x = last; // then we start to iterate from the end and look for previous elements until we reach the needed one
            for (int i = size - 1; i > index; i--) {
				x = x.previous;
			}
            return x;
        }
	}
	
	
	
	public Object removeNodeByIndex(int index) {
		return unlink(getNodeByIndex(index));
		
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

	@Override
	public Iterator<Object> iterator() {   // iterator needs to be instanciated in order to work properly : Iterator<Object> iterator = testList.iterator();
		// TODO Auto-generated method stub
		return new IteratorImpl();
	} 

	

}
