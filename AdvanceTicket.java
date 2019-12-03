package assignments;
//AdvanceTicket
//
//This is the ticket class for regular tickets bought before the event, applying the advance discount and/or the  
//ten day discount
//By: m.w.
//12/1/2019
//*******************************************************************
public class AdvanceTicket extends Ticket {
	
	//Our private ints to store the parameters
	private int daysBeforeEvent;
	private int ticketNumber;

	//Set the instance with our parameter values.
	public AdvanceTicket(int ticketNumber, int daysBeforeEvent) {
		super(ticketNumber, daysBeforeEvent);
		this.daysBeforeEvent = daysBeforeEvent;
		this.ticketNumber = ticketNumber;
		
	}
	
	//Override the getPrice method to use one that checks whether the ticket is bought less than or more than
	//10 days before the event, and sets price accordingly
	@Override
	public double getPrice() {
		//store our result from calculateDiscount so we dont need to waste memory calling it.
		double advDiscount = calculateDiscount(super.getBasePrice(),super.getAdvanceDiscount());
		if(daysBeforeEvent < 10) {
			return (advDiscount);
		}
		//If ticket bought more than 10 days before the event, we calculateDiscount again on advDiscount with
		//the tenDayDiscount as the discount to be applied
		else return (calculateDiscount(advDiscount,super.getTenDayDiscount()));
	}
	
	//CalculateDiscount method. subtracts discount percentage of base 
	//I kept it abstract in Ticket in case it needed to be changed for the particular class..
	@Override
	public double calculateDiscount(double base, int discount) {
		return base-((base/100)*discount);
	}
	
	
	//Getters and setters
	public int getDaysBeforeEvent(){
		return daysBeforeEvent;
	}
	
	public void setDaysBeforeEvent(int daysBeforeEvent) {
		this.daysBeforeEvent = daysBeforeEvent;
	}
	
	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}



}
