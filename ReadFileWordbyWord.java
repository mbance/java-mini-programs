/*
 * read a file word by word using scanner class
 * */

package streams;
import java.io.*;
import java.util.*;

public class ReadFileWordbyWord {
	public static void main ( String[] args ) throws IOException
	{
		// Prompt for and open the input file
		Scanner user = new Scanner( System.in );
		System.out.print("File name? ");
		String fileName = user.next().trim(); // removes empty space from file name
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/";
		Scanner scan = new Scanner( new File(path+fileName) );

		while(scan.hasNext())   // check for end of file
		{
			System.out.println(scan.next());  //print  next word
		}
	}
}
