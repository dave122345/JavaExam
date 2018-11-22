package TravelEasy;
public final class FlightAttendent extends AvationStaff implements AvaitionLawCertification {
	int numHolidays;
	double weeklySalary;
	int CAR_INSURANCE = 100;
	
	//constructor 
	public FlightAttendent(int id, String name, double hourlyRate, int numHolidays) {
		this.id = id;
		this.hourlyRate = hourlyRate;
		this.name = name;
		this.numHolidays = numHolidays;
	}
	//methods
	@Override
	double calculateSalary() {
		weeklySalary = hourlyRate * normalNumOfHours; 
		return weeklySalary;
	}
	//toString() method
	public String toString() {
			
			return("Flight attendent ID is: " + Integer.toString(id));
		}
	
	//display method
	@Override
	void display() {
		System.out.println("Flight attendent ID: " + toString());
		System.out.println("Flight attendent Name: " + name);
		System.out.println("Flight attendent number of holidays: " + numHolidays);
		calculateSalary();
		System.out.println("Flight attendent weekly salary: " + weeklySalary);

	}
	
	//interface methods
	@Override
	public void payExamFee(double EXAM_FEE) {
		weeklySalary -= DISCOUNT_FACTOR*EXAM_FEE;
		
	}
	
	@Override
	public void displayExamFee() {
		AvaitionLawCertification.super.displayExamFee();
	}
	
	@Override
	public void displayCarInsurance() {
		System.out.println("CAR_INSURANCE = " + (CAR_INSURANCE));
		super.displayCarInsurance();
	}
	
	public static void main(String[] args) {
			// objects
			FlightAttendent enricoFermi = new FlightAttendent(006, "Enrico", 60.00, 20);
			//object calls
			enricoFermi.display();
			enricoFermi.displayCarInsurance();
			enricoFermi.displayExamFee();
			
			
			
	}//main

}//end
