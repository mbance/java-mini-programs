import java.util.*;
public class WrongInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers to add? ");
		int count = scan.nextInt();

		int sum = 0;
		int i = 1;
		while(i <= count){ 
			System.out.println("Type a number: ");

			if(scan.hasNextInt()){
				sum = sum + scan.nextInt();
				i++;
			}
			else { 
				System.out.println("Wrong input !!!!");
				scan .next();
			}
		}
		System.out.println("The sum is " + sum);

	}

}
