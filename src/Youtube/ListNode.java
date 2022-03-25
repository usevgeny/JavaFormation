package Youtube;

public class ListNode<E> {
	
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
		return "ListNode [value=" + value + ", next=" + next + "]";
	}
	
	
	
}
