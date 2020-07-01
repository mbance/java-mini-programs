/*
 * Use FileInputStream to read a file char by char
 * */

package streams;
import java.io.*;

public class UseInputStreamReadCharByChar {
	public static void main ( String[] args ) throws IOException
	  {
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
	       FileInputStream fileInput = new FileInputStream(path+"output.txt"); 
	       int r; 
	       while ((r = fileInput.read()) != -1)    // check for end of file
	      {  char c = (char) r; 
	          System.out.print(c);
	       } 
	       fileInput.close();
	 }


}
