package assignments;
//WalkupTicket
//
//This subclass of Ticket is for making Ticket inherited objects that are bought on the day of the event
//When it is instatiated, the "daysBeforeEvent" parameter isnt utilized but should be entered as "0" anyway..
//No discounts are applied here
//By: m.w.
//11/4/2019
//*******************************************************************

public class WalkupTicket extends Ticket {
	//The variable to hold the private int passed from parameters
	private int ticketNumber;
	
	//inheriting everything from ticket. daysBeforeEvent is not used in this class, so its just set to 0 when
	//its called later since its a ticket bought at the day of the event
	public WalkupTicket(int ticketNumber,int daysBeforeEvent) {
		super(ticketNumber, daysBeforeEvent);
		this.ticketNumber = ticketNumber;
	}
	
	//we override the method from Ticket to get our walkup ticket price, which is the basePrice variable from Ticket.
	@Override
	public double getPrice() {
		return super.getBasePrice();
	}
	
	//getters and setters
	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	//no discounts are applied here
	@Override
	public double calculateDiscount(double base, int discount) {
	
		return 0;
	}

}
