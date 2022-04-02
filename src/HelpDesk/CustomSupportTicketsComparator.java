package HelpDesk;

import java.util.Comparator;

public class CustomSupportTicketsComparator implements Comparator<SupportTicket> {

	@Override
	public int compare(SupportTicket o1, SupportTicket o2) {
		
		if (o1.getPriority().getPriorityValue()==o2.getPriority().getPriorityValue()) {
			return o1.getSequentialNumber() - o2.getSequentialNumber();
		}

		
		return (o1.getPriority().getPriorityValue()-o2.getPriority().getPriorityValue());
	}

    // <write your code here>


}
