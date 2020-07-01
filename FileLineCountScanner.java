/*
 * 
 * */
package streams;
import java.io.*;
import java.util.*;

public class FileLineCountScanner {
	public static void main ( String[] args ) throws IOException
	{
		// Prompt for and open the input file
		Scanner user = new Scanner(System.in );
		System.out.print("File name? ");
		String fileName = user.next().trim();	
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		FileReader fileInput= new FileReader(path+fileName);
		
		Scanner scan = new Scanner(fileInput);
		int counter=0;
		while(scan.hasNextLine())       
		{ 
			counter++;  
			scan.nextLine(); 
		} 
		System.out.println(fileName + " contains " + counter + " Lines");
		fileInput.close();
	}
}
