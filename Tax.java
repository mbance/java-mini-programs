package LabExercises;

public class Tax {

	public static void main(String args[]) {
		
	double salary = 17000;
	double taxablePay = 0;
	
		if(salary > 15000) {
			taxablePay = salary * 0.05;
			
		}
		
		else if(salary > 30000) {
			taxablePay = salary * 0.1;
	}
		
		else if(salary > 50000) {
			taxablePay = salary * 0.2;
	}
	
		System.out.println(taxablePay);
		System.out.println("Net pay is: " + );

	}

}