/*
 * InputString.java 
 * */
import java.util.*; // to use all classes in the  java.util package.
public class InputString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // read from keyboard
		
		String str = scan.next(); // store it as a String in str
		
		System.out.println(" the first string you entered is  : " +str);
		
		System.out.println(" the 2nd  string you entered is  : " +scan.next());
	}
}
