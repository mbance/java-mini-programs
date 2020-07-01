/*
 * the user enters the name of the file and program prints the number of characters in the file.
 */
package streams;
import java.io.*;
import java.util.*;

public class FileCharCount {
	
	  public static void main ( String[] args ) throws IOException
	  {
	       Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the file name:");
	       String fileName = scan.next().trim();
	       String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
	       FileInputStream fileInput = new FileInputStream(path+fileName);
	       
	       int counter=0;
	       while ((fileInput.read()) != -1)    // check for end of file
	      { 
	                    counter++;   
	       } 
	       System.out.println(fileName + " contains " + counter + " characters");
	       fileInput.close();
	    }
}
