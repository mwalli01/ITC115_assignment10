package assignments;

//Ticket
//
//This is the base Ticket class that all other tickets inherit.
//This class, as well as those that inherit it, must have two int values called as parameters: the first is a ticket
//number, the second is how many days before the event the ticket is ordered.
//There is a toString method to see the ticket's data, as well as an abstract method getPrice that must be used in subclasses 
//there is also an abstract method to do the discount calculation on the base price
//By: m.w.
//12/1/2019
//*******************************************************************

public abstract class Ticket {
	
	//private variables for the class parameters
	//advanceDiscount, tenDayDiscount and studentDiscount are ints representing a discount percentage to take off of 
	//basePrice
	private int daysBeforeEvent;
	private int ticketNumber;
	private double basePrice = 50.00;
	private int advanceDiscount = 20;
	private int studentDiscount = 50;
	private int tenDayDiscount = 25;
	
	//sets this instance with parameter values
	public Ticket(int ticketNumber,int daysBeforeEvent) {
		this.ticketNumber = ticketNumber;
		this.daysBeforeEvent = daysBeforeEvent;
	}
	
	//prints our ticket data, with ticket number and price
	public String toString() {
		return "Number: " + ticketNumber + " Price: " + getPrice();
	}
	
	//abstract method for calculating discounts. base is the dollar amount and discount is the percentage
	public abstract double calculateDiscount(double base, int discount);
	
	//abstract method for the subclasses to use for their respective prices
	public abstract double getPrice();
	
	//getters and setters
	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public int getDaysBeforeEvent() {
		return daysBeforeEvent;
	}

	public void setDaysBeforeEvent(int daysBeforeEvent) {
		this.daysBeforeEvent = daysBeforeEvent;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public int getAdvanceDiscount() {
		return advanceDiscount;
	}

	public void setAdvanceDiscount(int advanceDiscount) {
		this.advanceDiscount = advanceDiscount;
	}

	public int getStudentDiscount() {
		return studentDiscount;
	}

	public void setStudentDiscount(int studentDiscount) {
		this.studentDiscount = studentDiscount;
	}

	public int getTenDayDiscount() {
		return tenDayDiscount;
	}

	public void setTenDayDiscount(int tenDayDiscount) {
		this.tenDayDiscount = tenDayDiscount;
	}

}

