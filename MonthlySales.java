package LabExercises;

public class MonthlySales {
	
	public static void main(String args[]){
		double [] monthlySales= {50000.0 , 40000.1, 55000.0 ,30000.0,
				250000.2, 600000.2, 450000.0, 36000.0 ,28000.0, 15000.1, 700000.2,
				15000.0};
		
		double sum = monthlySales[0];;
		double average = 0;
		double largest = monthlySales[0];
		double smallest = monthlySales[0];
		
		for(int i = 0; i < monthlySales.length; i++) {
			sum = sum + monthlySales[i];
			
			if(largest < monthlySales[i]) {
				
				largest = monthlySales[i];
			}
			if(smallest > monthlySales[i]) {
				
				smallest = monthlySales[i];
			}
			
			average = sum / monthlySales.length;
			
		}
			
		System.out.println("The total sales for the year 2016 is: " + sum);
		System.out.println("The average monthly sales for year 2016 is: " + average);
		System.out.println("The smallest monthly sale for the year 2016 is: " + smallest);
		System.out.println("The largest monthly sale for the year 2016 is: " + largest);
	}
	
}
