/*
 * the program takes numbers for input file and prints the their corresponding square into ouputfile.
 * */
package streams;
import java.util.*;
import java.io.*;

public class UseDataFomFileToFile {

	public static void main (String[] args) throws IOException
	{ 
		int num, square;    
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		Scanner user = new Scanner( System.in ); 

		System.out.print("Input File Name: ");
		String inputFileName = user.nextLine().trim();
		File input = new File( path+ inputFileName );      
		Scanner scan = new Scanner( input );      

		System.out.print("Output File Name: ");
		String outputFileName = user.nextLine().trim();
		File output = new File( path+outputFileName );      
		PrintStream  print = new PrintStream( output );      
		while( scan.hasNextInt() )    
		{
			num = scan.nextInt();
			square = num * num ;      
			print.println("The square of " + num + " is " + square);
		}

		print.close(); // close the output file
	}
}