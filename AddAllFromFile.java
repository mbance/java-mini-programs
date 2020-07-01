/* 
 * read numbers from a file and prints the sum
 * */
package streams;
import java.util.*;
import java.io.*;
public class AddAllFromFile {
	  public static void main ( String[] args ) throws IOException
	  {
	      int sum = 0;     // initialise sum
	     
	    Scanner user = new Scanner( System.in );  // Prompt and open input-file
	    System.out.print("File name? ");
	    String fileName = user.next().trim();
	    
	    String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
	    
		File file = new File(path+fileName );  //creates a File object that represents the disk file
	    Scanner scan = new Scanner(file );

	    while (scan.hasNextInt())
	    {
	      sum    = sum + scan.nextInt();   // add to the sum
	    }
	    System.out.println( "The sum is: " + sum ); // prints the sum
	  }
}
