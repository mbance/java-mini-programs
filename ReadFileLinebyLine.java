/*
 * read a file Line by line using scanner class
 * */
package streams;
import java.io.*;
import java.util.*;

public class ReadFileLinebyLine {
	  public static void main ( String[] args ) throws IOException
	  {
	    // Prompt for and open the input file
	    Scanner user = new Scanner( System.in );
	    System.out.print("File name? ");
	    String fileName = user.next().trim();  
	    String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/";
		Scanner scan = new Scanner( new File(path+fileName) );

	    while(scan.hasNextLine())   // check for end of file
	    {
	      System.out.println(scan.nextLine());  //print  next Line

	    }
	  }

}
