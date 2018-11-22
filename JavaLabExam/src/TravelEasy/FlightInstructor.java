package TravelEasy;

public class FlightInstructor extends Pilot {

	//variables
	static int bonus = 5000;
	static double HOURLY_RATE_MULTIPLIER = 1.5;
	
	//constructor #1
	public FlightInstructor(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate, numHolidays);
		// TODO Auto-generated constructor stub
	}

	//constructor #2
	public FlightInstructor(int id, String name, double hourlyRate, int numHolidays, double overTime, int bonus, double HOURLY_RATE_MULTIPLIER) {
		super(id, name, hourlyRate, numHolidays, overTime);
		//this.bonus = bonus; 
		//this.HOURLY_RATE_MULTIPLIER = HOURLY_RATE_MULTIPLIER;
	}
	
	/*
	 * polymorphism attempt
	 * 
	 * public void MariaMitchell() {
		System.out.println("003" + "Maria" + "250" + "20" + bonus);
	}*/
	//methods
	double calculateSalary() {
		
		weeklySalary = hourlyRate * normalNumOfHours; 
		
		if (overTime > 0) {
			hourlyRate = hourlyRate * HOURLY_RATE_MULTIPLIER;
			weeklySalary =+ (hourlyRate * overTime);
			
		
		}//if ends
		return HOURLY_RATE_MULTIPLIER;
}
	//toString() method	
		public String toString() {
				
				return("Commerical Pilot ID is: " + Integer.toString(id));
			}
	
		//display method
	void display() {
		System.out.println("Flight Instructor ID: " + toString());
		System.out.println("Flight Instructor Name: " + name);
		System.out.println("Flight Instructor number of holidays: " + numHolidays);
		
		calculateSalary();
		System.out.println("Flight Instructor weekly salary: " + weeklySalary);
		//System.out.println("DEBUG Pilot OT: " + overTime);
		System.out.println("Flight Instructor bonus: " + bonus);

	}
	
	public static void main(String[] args) {
		//objects
		FlightInstructor JaneGoodall = new FlightInstructor(004, "Jane", 140.00, 20, 10, bonus, HOURLY_RATE_MULTIPLIER);
		//object calls
		 JaneGoodall.display();
	}//main

}//end
