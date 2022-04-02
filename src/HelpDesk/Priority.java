package HelpDesk;

public enum Priority {

	LOW(3),MEDIUM(2),HIGH(1);
	private int priorityValue;
	
	private Priority(int priorityValue) {
		this.priorityValue = priorityValue;
	}

	public int getPriorityValue() {
		return this.priorityValue;
	}


}
