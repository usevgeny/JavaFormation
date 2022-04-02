package HelpDesk;

public class HelpDeskTest {
	
	
	public static void main(String[] args) {
		DefaultSupportTicket ticket1 = new DefaultSupportTicket(RequestType.ACCOUNT_IS_HACKED);
		DefaultSupportTicket ticket2 = new DefaultSupportTicket(RequestType.CAN_NOT_LOGIN);
		DefaultSupportTicket ticket3 = new DefaultSupportTicket(RequestType.CHANGE_ACCOUNT_DETAILS);
		
		
		DefaultHelpDeskFacade helpDesk1 = new DefaultHelpDeskFacade();
		helpDesk1.addNewSupportTicket(ticket1);
		helpDesk1.addNewSupportTicket(ticket3);
		helpDesk1.addNewSupportTicket(ticket1);
		
		System.out.println("NumberOfTickets: "+helpDesk1.getNumberOfTickets());
		helpDesk1.getNextSupportTicket();
		System.out.println("NumberOfTickets: "+helpDesk1.getNumberOfTickets());
		System.out.println(ticket3.getRequestType());
		helpDesk1.getNextSupportTicket();
		System.out.println("NumberOfTickets: "+helpDesk1.getNumberOfTickets());
		helpDesk1.getNextSupportTicket();
		System.out.println("NumberOfTickets: "+helpDesk1.getNumberOfTickets());helpDesk1.getNextSupportTicket();
		System.out.println("NumberOfTickets: "+helpDesk1.getNumberOfTickets());
	}

}
