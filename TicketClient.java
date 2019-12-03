package assignments;

//TicketClient
//
//Here we check the results of our tickets... I forgot to use junit.. but it works!!!  
//
//By: m.w.
//12/1/2019
//*******************************************************************
public class TicketClient {

	public static void main(String[] args) {
		
		//Seperate tests for each ticket class, with the days set before 10 and after 10 to check
		//that everything is in order..
		
		WalkupTicket walkupTicket = new WalkupTicket(15,0);
		System.out.println("walkup ticket, on event day with ticket number 15");
		System.out.println(walkupTicket);
		
		AdvanceTicket advanceTicket = new AdvanceTicket(10,11);
		System.out.println("Advance ticket, 11 days before event with ticket number 10");
		System.out.println(advanceTicket);
		
		AdvanceTicket advanceTicket2 = new AdvanceTicket(23,5);
		System.out.println("Advance ticket, 5 days before event with ticket number 23");
		System.out.println(advanceTicket2);
		
		StudentAdvanceTicket studentTicket = new StudentAdvanceTicket(20,4);
		System.out.println("Advance student ticket, 4 days before event with ticket number 20");
		System.out.println(studentTicket);
		
		StudentAdvanceTicket studentTicket2 = new StudentAdvanceTicket(21,11);
		System.out.println("Advance student ticket, 11 days before event with ticket number 21");
		System.out.println(studentTicket2);
		
	}

}
