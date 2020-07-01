import java.util.Scanner;
/*
 * InputAge.java ask the user to integer their 
 * age and prints the entered value on the screen
 */
public class InputAge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // read from keyboard		
		System.out.println("How old are you? ");
		int age = scan.nextInt(); // store the value entered in the variable age
		System.out.println("you look younger that " + age);  // prints the age
	}
}
