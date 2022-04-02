package HelpDesk;

import java.util.PriorityQueue;
import java.util.Queue;

public class DefaultHelpDeskFacade implements HelpDeskFacade{
	
	
	private Queue<SupportTicket> ticketsQueue = new PriorityQueue<>(new CustomSupportTicketsComparator());

	@Override
	public void addNewSupportTicket(SupportTicket supportTicket) {
		ticketsQueue.offer(supportTicket);
		
	}

	@Override
	public SupportTicket getNextSupportTicket() {
		// TODO Auto-generated method stub
		//int currentCounter = DefaultSupportTicket.getCounter();
		//if(currentCounter>0){DefaultSupportTicket.setCounter(currentCounter-1);
		
		//for(int i=0;i<ticketsQueue.size();i++) {
		//DefaultSupportTicket tmp = (DefaultSupportTicket) ticketsQueue.peek();
		//tmp.setSequentialNumber(tmp.getSequentialNumber()-1); 
			
		
		
		return ticketsQueue.poll();
		//return null;
		
	}

	@Override
	public int getNumberOfTickets() {
		// TODO Auto-generated method stub
		return ticketsQueue.size();
	}
	
   // <write your code here>

}