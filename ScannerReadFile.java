
import java.io.*;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReadFile {

	public static void main(String[] args) throws IOException{
		
		String filename= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/use-of-scanner/src/ScanInt.java";
		//String filename= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/noam-chomsky.txt";
		
		Scanner scan = new Scanner(new File(filename));
	            while (scan.hasNextLine())
	            {
	                String line = scan.nextLine();
	                System.out.println(line);
	            }
	}

}
