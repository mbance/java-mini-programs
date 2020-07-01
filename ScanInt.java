/*
 * ScanInt.java, ask the user to enter 2 integers and prints both.
 * */
import java.util.*; // to use all classes in the  java.util package.

public class ScanInt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // read from keyboad

		System.out.println("please enter an integer ");  // interaction with keyboard

		int n=0;
		while(n<5) {
			if(scan.hasNextInt()) {

				int m= scan.nextInt(); // store the 1srvalue as integer in n
				System.out.println(m);
				n++;	
			}
			else {
				scan.next();
			}

		}


	}
}