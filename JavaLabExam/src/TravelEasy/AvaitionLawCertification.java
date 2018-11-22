package TravelEasy;

public interface AvaitionLawCertification {
	//variables
	final double EXAM_FEE = 500;
	final double DISCOUNT_FACTOR = 0.05;
	final float CAR_INSURANCE = 100;
	
	//Abstract methods
	void payExamFee(double EXAM_FEE);
	
		static void displayCarInsurance()
		{
			
			System.out.println("CAR_INSURANCE = " + (CAR_INSURANCE));
			
		}
		
		default void displayExamFee()
		{
			
			System.out.println("The exam fee is: " + (EXAM_FEE * DISCOUNT_FACTOR));
			
		}

}
