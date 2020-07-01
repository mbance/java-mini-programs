import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CopyFileTry {
	public static  void  main(String arg[])  
	{
		try {

			Scanner scan =new Scanner(System.in);
			String path= "/Users/lahcenouarbya/Documents/courses/2018-2019/pap/week5/code-2018/"; 

			System.out.println("Enter the file source file name");
			String sfile=scan.next();

			System.out.println("Enter the destination  file name");
			String dfile=scan.next();

			FileReader  fin = new   FileReader(path+"/"+sfile); // allow to read from a file
			FileWriter fout= new FileWriter(path+"/"+dfile,true); // allow to write to write to file

			int c;
			while((c=fin.read()) != -1)  // read and copy character by character
			{
				fout.write(c);  
				//System.out.println((char)c);
			}
			System.out.println("Copy has  finished...");
			fin.close(); // close source source file
			fout.close();  // close destination file
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	} 
}
