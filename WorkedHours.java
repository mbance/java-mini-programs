/*  Computes the total paid hours worked by two employees.
 * The company does not pay for more than 8 hours per day.
 *  Uses a "cumulative sum" loop to compute the total hours.
*/ 
import java.util.*;

public class WorkedHours {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
        int hours1 = processEmployee(scan, 1);
        int hours2 = processEmployee(scan, 2);   
        int total = hours1 + hours2;
        System.out.println("Total hours for both = " + total);
	}
	
	/* Reads hours information about an employee with the given number.
	 * Returns total hours worked by the employee
     */
      public static int processEmployee(Scanner scan,  int number) {
        System.out.print("Employee " + number + ": How many days? ");
        int days = scan.nextInt();
        
        // totalHours is a cumulative sum of all days' hours worked.
        int totalHours = 0;
        for (int i = 1; i <= days; i++) {
            System.out.println("Hours of day " + i );
            int hours = scan.nextInt();
            totalHours = totalHours + Math.min(hours, 8);
        }
        
        double hoursPerDay = (double) totalHours / days;
        System.out.printf("Employee %d's total hours = %d (%.1f / day)\n",
                          number, totalHours, hoursPerDay);
        System.out.println();
        return totalHours;
    
      }

}
