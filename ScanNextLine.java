import java.util.Scanner; // use scanner class 

public class ScanNextLine{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  // allow to ready from keyboard
		String str  = scan.nextLine();  // store the line entered as string in  str 
		System.out.println(str); // print entered string
	}
}
