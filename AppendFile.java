package streams;
import java.io.*;

public class AppendFile {

	public static void main ( String[] args ) throws IOException
	{
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		File file = new File(path+"/output.txt" );  //creates a File object that represents the disk file. 
		PrintWriter print = new PrintWriter(new FileOutputStream(file,true));

		print.println( " Our only real hope for democracy is " ); 
		print.println( "that we get the money out of politics entirely " ); 

		print.println( "and establish a system of publicly funded elections." ); 
		print.println( "Noam Chomsky." ); 
		print.close();
	}
}
