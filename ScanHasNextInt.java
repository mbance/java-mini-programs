/*
 *  12 13 and 14 are all of type integer. goldsmith is not of type integer which 
leads to exit the loop before getting the token 15
 * */
import java.util.*;
public class ScanHasNextInt {
	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);// read from keyboard
           System.out.println("enter set of integers separated by white space");
           while(scan.hasNextInt()) // checks if the token entered is of type integer
           {
                System.out.println(scan.nextInt());  // if true print the token
           }
	}
}
