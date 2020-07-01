//import java.io.*;
import java.util.*;
public class Guessing {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int min =1; int max = 1000 ;
		int counter = 0;
		boolean found = false;
		int guess;
		System.out.println("`please think of a number between  1 and 1000");
		
		while(!found && counter<10)
		{
			guess = (min+max)/2;
			counter++;
			System.out.println("your guess is " + guess);
			System.out.println("please enter 'h' is your guess is higher , 'l' if your guess is lower and 'c' if your guess is correct ");
			String input = scan.next();
			if(input.equals("l")) max = guess-1;
			else if(input.equals("h")) min = guess+1;
			else {
				    System.out.println("your guess is " + guess + " guess it in " + counter + " times");
				    found = true;
			
			   }
			
		}
		if(found == false) System.out.println("you are cheating");
		
		
		
		
		
	}

}
