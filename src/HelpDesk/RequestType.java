package HelpDesk;

import java.util.Enumeration;

public enum RequestType {
	OTHER(Priority.LOW),CHANGE_ACCOUNT_DETAILS(Priority.LOW),CAN_NOT_LOGIN(Priority.MEDIUM),
	ACCOUNT_IS_BLOCKED(Priority.MEDIUM),COOPERATION(Priority.MEDIUM),
	ACCOUNT_IS_HACKED(Priority.HIGH),CAN_NOT_COMPLETE_PURCHASE(Priority.HIGH),
	ORDER_IS_NOT_RECEIVED(Priority.HIGH);
	private Priority requestPriority;
	
	private RequestType(Priority requestPriority) {
		this.requestPriority = requestPriority;
	}

	public Priority getRequestPriority() {
		return requestPriority;
	};
	
	
}
