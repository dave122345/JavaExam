package TravelEasy;



public class Pilot extends AvationStaff {
	
	//variables
	int numHolidays;
	double weeklySalary;
	double overTime;
	
	//constructor #1
	public Pilot(int id, String name, double hourlyRate, int numHolidays) {
		this.id = id;
		this.hourlyRate = hourlyRate;
		this.name = name;
		this.numHolidays = numHolidays;
	}

	//constructor #1
	public Pilot(int id, String name, double hourlyRate, int numHolidays, double overTime) {
		this(id, name, hourlyRate, numHolidays);
		this.overTime = overTime;
	}
	
	//methods
	@Override
	double calculateSalary() {
		
		weeklySalary = hourlyRate * normalNumOfHours; 
		
		if (overTime > 0) {
			
			weeklySalary =+ (hourlyRate * overTime);
			
			
		}//if ends
		
		
		return weeklySalary;	
	}
	

	//equals method
	public boolean equals(Object obj) {
	Pilot other = (Pilot)obj;
	
	if(other.id == id && other.name == name && other.hourlyRate == 
			hourlyRate && other.numHolidays == numHolidays)
	{
		return true;
		
		
	}
	
	else 
	{
		return false;
	}

	}//if ends
	
	//display method
	@Override
	void display() {
		System.out.println("Pilot ID: " + id);
		System.out.println("Pilot Name: " + name);
		System.out.println("Pilot number of holidays: " + numHolidays);
		calculateSalary();
		System.out.println("Pilot weekly salary: " + weeklySalary);
		//System.out.println("DEBUG Pilot OT: " + overTime);

	}

	public static void main(String[] args) {
		
		//objects
		Pilot edmondHalley = new Pilot(007, "Edmond", 150.00, 20, 15);
		//object calls
		edmondHalley.display();
		
		//equals method
		Pilot myHusband = new Pilot(545, "Jack", 150.00, 20);
				
		Pilot myWife = new Pilot(565, "Jackie", 150.00, 20);
				
		System.out.println("Equals Method: " + myHusband.equals(myWife));
		
		/*polymorphism attempt
		Pilot[]PilotArray = new Pilot[2];
		{
		for(int i = 0;i<PilotArray.length; i++)
			 (PilotArray[i]).MariaMitchell();
		
		}*/
		
	}//main

}//end