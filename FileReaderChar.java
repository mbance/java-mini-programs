package streams;

import java.io.*;
class FileReaderChar
{
	public static void main ( String[] args ) throws IOException
	{
		String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 
		File file = new File(path+"/output.txt" );  //creates a File object that represents the disk file.
		FileReader  fr = new FileReader(file);  //Get data from this file using a file reader.
		BufferedReader br = new BufferedReader(fr);  //To store the contents read via File Reader
		int n;
		//Read br and store a line in 'data', print data
		while((n=br.read()) != -1)   // check for end of file
		{
			System.out.print((char)n);  //print  char
		}
		fr.close();
	}
}
