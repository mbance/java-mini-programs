import java.util.*;
public class CummulativeSum {

	public static void main(String[] args) {
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("How many numbers to add? ");
			int count = scan.nextInt();

			int sum = 0;
			
			for (int i = 1; i <= count; i++) 
			{
				System.out.print("Type a number: ");
				sum = sum + scan.nextInt();
			}
			System.out.println("The sum is " + sum);
		}

	}
}