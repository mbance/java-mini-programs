/*
 * uses FileInputStream and FileOutputStream to copy file char by char
 * */
package streams;
import java.io.*;

public class UseInputStreamtoCopyFileCharbyChar {
	  public static void main ( String[] args ) throws IOException
	  {
		  String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
	       FileInputStream fileInput = new FileInputStream(path+ "input.txt");
	       FileOutputStream fileOutput = new FileOutputStream(path+ "output.txt");
	       int r; 
	       while ((r = fileInput.read()) != -1)    // check for end of file
	      { 
	           fileOutput.write(r);        
	       } 
	       fileInput.close();
	       fileOutput.close();
	 }
}
