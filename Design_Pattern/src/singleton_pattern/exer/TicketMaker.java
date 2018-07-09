package singleton_pattern.exer;

public class TicketMaker {
	private int ticket = 1000;

	private static TicketMaker ticketMaker = new TicketMaker();

	/*
	 * 修改
	 */
	private TicketMaker() {

	}

	public int getNextTicketNumber() {
		return ticket++;
	}

	public static TicketMaker getInstance() {
		return ticketMaker;
	}
}
