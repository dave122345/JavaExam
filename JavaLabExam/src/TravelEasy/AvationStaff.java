package TravelEasy;

public abstract class AvationStaff {
	//variables
	int id;
	String name;
	final double normalNumOfHours = 37.5;
	double hourlyRate;
	static float CAR_INSURANCE =200;

	
	//abstract methods
	 abstract double calculateSalary();
	
	 abstract void display();
	
	 public void displayCarInsurance() {
			System.out.println("The Price of car insurance is: ");
			
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}//main

}//end
