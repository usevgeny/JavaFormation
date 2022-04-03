package HelpDesk;



public class DefaultSupportTicket implements SupportTicket {
	
	
	private RequestType requestType;
	private int sequentialNumber = 0;
	private static int counter = 0;
	
	{
		this.requestType=RequestType.OTHER;
	}
	public DefaultSupportTicket() {
		this.sequentialNumber = ++DefaultSupportTicket.counter;
		
	}
	

	public DefaultSupportTicket(RequestType requestType) {
		
		this.requestType = requestType;
		this.sequentialNumber = ++DefaultSupportTicket.counter;
	}




	public static void setCounter(int counter) {
		DefaultSupportTicket.counter = counter;
	}


	@Override
	public Priority getPriority() {
		// TODO Auto-generated method stub
		return this.getRequestType().getRequestPriority();
	}

	@Override
	public int getSequentialNumber() {
		return this.sequentialNumber;
	}
	
	

	public void setSequentialNumber(int sequentialNumber) {
		this.sequentialNumber = sequentialNumber;
	}


	@Override
	public RequestType getRequestType() {
		// TODO Auto-generated method stub
		return this.requestType;
	}
	
	


	public static int getCounter() {
		return counter;
	}



	@Override
	public String toString() {
		return "DefaultSupportTicket [priority=" + this.getRequestType().getRequestPriority() + ", requestType=" + requestType + "]";
	}
	
     

}
