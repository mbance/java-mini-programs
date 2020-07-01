import java.util.*;
public class MixedInputs {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(" type  something press enter: ");
		while(true)
		{		
			if (in.hasNextInt())
			{
				System.out.println("You entered an integer  " +  in.nextInt());
			}
			else if (in.hasNextDouble())
			{
				System.out.println("You entered  a double " + in.nextDouble());
			}
			else if(in.hasNext())
			{
				System.out.println("You entered  a string  " + in.next());
			}
		}
	}
}
