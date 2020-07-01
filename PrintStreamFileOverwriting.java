package streams;
import java.io.*;

public class PrintStreamFileOverwriting {

	public static void main(String[] args) throws IOException {

		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		File file = new File(path+"/output.txt" );  //creates a File object that represents the disk file. 
		
		PrintStream  print = new PrintStream(file); //connects the file to an output PrintStream. 

		print.println( " Our only real hope for democracy is " ); 
		print.println( "that we get the money out of politics entirely " ); 
		print.println( "and establish a system of publicly funded elections." ); 
		print.println( "Noam Chomsky." ); 

		PrintStream  print1 = new PrintStream( file ); //connects the file to an output PrintStream. 
		print1.println( "What should i do to get a first class degree?");
		print1.println( "it is simple, work harder!");
		print.close();
		print1.close();
	}
}
