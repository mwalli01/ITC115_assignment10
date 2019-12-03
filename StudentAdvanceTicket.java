package assignments;
//StudentAdvanceTicket
//
//This is the ticket class for students buying in advance, applying the advance discount and/or the  
//ten day discount as well as the student discount
//By: m.w.
//12/1/2019
//*******************************************************************

//This class gets to inherit AdvanceTicket instead of Ticket because we need 
public class StudentAdvanceTicket extends AdvanceTicket {
	
	//Private variables to store the passed on parameters
	private int daysBeforeEvent;
	private int ticketNumber;
	
	//set instance with parameter values
	public StudentAdvanceTicket(int ticketNumber, int daysBeforeEvent) {
		super(ticketNumber, daysBeforeEvent);
		this.daysBeforeEvent = daysBeforeEvent;
		this.ticketNumber = ticketNumber;

	}
	
	//over ride getPrice to return a price dependent on whether the ticket was ordered more than
	//10 days before the event
	@Override
	public double getPrice() {
		//These two variables are just to store the results of the discount calculations. It makes it a little easier to read 
		double advDiscount = calculateDiscount(super.getBasePrice(),super.getAdvanceDiscount());
		double advPlusStudentDiscount = calculateDiscount(advDiscount,super.getStudentDiscount());
		if(daysBeforeEvent < 10) {
			return (advPlusStudentDiscount);
		}
		//If the ticket is bought over 10 days before, we apply the tenDayDiscount
		else return (calculateDiscount(advPlusStudentDiscount,super.getTenDayDiscount()));
	}
	
	//CalculateDiscount method. subtracts discount percentage of base 
	//I kept it abstract in Ticket in case it needed to be changed for the particular class..
	@Override
	public double calculateDiscount(double base, int discount) {
		return base-((base/100)*discount);
	}
	
	//override printTicket to add the "student id required" part.
	@Override
	public String toString() {
		return "Number: " + ticketNumber + " Price: " + getPrice() + " (Student ID Required.)";
	}
	
	//getters and setters.
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
