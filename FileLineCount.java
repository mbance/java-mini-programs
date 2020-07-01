/*
 * the user enters the name of the file and program prints the number of lines in the file.
 */
package streams;
import java.io.*;
import java.util.*;

public class FileLineCount {
	  public static void main ( String[] args ) throws IOException
	  {
		   Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the file name:");
	       String fileName = scan.next().trim();
	       String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/";
	       FileReader fileInput = new FileReader(path+fileName);
	     
	       BufferedReader br= new BufferedReader(fileInput); 
	    		   //new BufferedReader(fileInput);
	       int counter=0;
	       while ((br.readLine()) !=  null)    // check for end of file
	      { 
	                    counter++;   
	       } 
	       System.out.println(fileName + " contains " + counter + " Lines");
	       fileInput.close();
	    }
}
