package TravelEasy;

import java.util.*;

public class CommericalPilot extends Pilot {

	//variables
	
	int pilotLicenceNum;
	String pilotLicenceName;
	
	 Scanner scanner = new Scanner(System.in);
	 
	//constructor #1
	public CommericalPilot(int id, String name, double hourlyRate, int numHolidays) {
		super(id, name, hourlyRate, numHolidays);
	
	}
	
	//constructor #2
	public CommericalPilot(int id, String name, double hourlyRate, int numHolidays, double overTime) {
		super(id, name, hourlyRate, numHolidays, overTime);	
	}
	
	//methods
	void displayLicence(int pilotLicenceNum)
	{
		System.out.println("Please enter Debit Account Number");
		pilotLicenceNum = scanner.nextInt();
	}
	
	
	public int displayLicence(String pilotLicenceName, int pilotLicenceNum)
	{
		scanner.nextLine();
		System.out.println("Please enter Debit Account Number");
		pilotLicenceName = scanner.nextLine();
		return pilotLicenceNum;
		
	}
		
	//toString() method	
	public String toString() {
			
			return("Commerical Pilot ID is: " + Integer.toString(id));
		}
	
	//display method
	void display() {
	System.out.println("Commerical Pilot ID: " + toString());
	System.out.println("Commerical Pilot Name: " + name);
	System.out.println("Commerical Pilot number of holidays: " + numHolidays);
	System.out.println("Pilot Number and Name: " + pilotLicenceName + pilotLicenceNum);

}
	
	
	public static void main(String[] args) {
		
	}//main
}
