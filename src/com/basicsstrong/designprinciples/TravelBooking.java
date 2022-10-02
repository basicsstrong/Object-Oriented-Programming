package com.basicsstrong.designprinciples;

public interface TravelBooking {
	
	public void bookTicket();
	
}


class TicketBookingByAgent implements TravelBooking{
	TravelBooking t;
	public TicketBookingByAgent(TravelBooking t) {
		this.t= t;
		}
	@Override
	public void bookTicket() {
		t.bookTicket();
		
	}
	
}

class TrainTicket implements TravelBooking{

	@Override
	public void bookTicket() {
		System.out.println("Train Ticket Booked!");
		
	}
	
}
class FlightTicket implements TravelBooking{

	@Override
	public void bookTicket() {
		System.out.println("Flight Ticket Booked!");
		
	}
	
}
