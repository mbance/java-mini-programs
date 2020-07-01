package streams;
import java.io.*;
import java.util.*;

public class NamedFileInOut {
	public static void main (String[] args) throws IOException
	{ 
		// Scanner for user input
		Scanner user = new Scanner( System.in ); 
		String  inputFileName, outputFileName;

		// prepare the input file
		System.out.print("Input File Name: ");  // user interaction 
		inputFileName = user.nextLine().trim();  // trim any white space from the file.
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		File input = new File(path+inputFileName );      
		Scanner scan = new Scanner(input );      

		// prepare the output file
		System.out.print("Output File Name: ");  // user interaction
		outputFileName = user.nextLine().trim();  // remove white space
		File output = new File( path+outputFileName );     // add path where to store output file
		PrintStream  print = new PrintStream(output);    // use output name declaration file to print into output  
	}
}
