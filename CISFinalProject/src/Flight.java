import java.util.Date;

public class Flight {	

	Date dateOfFlightDeparture;
	
	Date dateOfFlightArrival;
	
	int duration;

	String airline;
	
	int flightNo;
	
	String origin;
	
	String destination;

	int capacity;
	
	int currentBooked;
	

	Flight(){
		
	}

	Flight(String origin, String destination,Date dateOfFlightDeparture){

		this.origin = origin;

		this.destination =destination;

		this.dateOfFlightDeparture= dateOfFlightDeparture;
	}


	boolean  isFull(){

		return(currentBooked>=capacity);
		
	}
		
		public int getFlightNo() {
			return flightNo;
		}

		public void setFlightNo(int flightNo) {
			this.flightNo = flightNo;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public int getCurrentBooked() {
			return currentBooked;
		}

		public void setCurrentBooked(int currentBooked) {
			this.currentBooked = currentBooked;
		}

}

