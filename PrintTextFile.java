package streams;
import java.io.*;


public class PrintTextFile {

	public static void main(String[] args) throws IOException {
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		File file = new File(path+"/output1.txt" );  //creates a File object that represents the disk file. 
		//PrintWriter  print = new PrintWriter(file); //connects the file to an output PrintStream. 
		PrintStream  print = new PrintStream(file); //connects the file to an output PrintStream.

		print.println( " Our only real hope for democracy is " ); 
		print.println( "that we get the money out of politics entirely " ); 
		print.println( "and establish a system of publicly funded elections." ); 
		print.println( "Noam Chomsky." ); 

		print.close();


	}

}
