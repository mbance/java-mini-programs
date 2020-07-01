package LabExercises;

import java.util.Scanner;

public class TenIntegers {
			
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			System.out.print("Enter an integer: ");
			
			for (int j = 0; j < 10; j++) {
				
				int n = scan.nextInt();
				System.out.println(n);
				
			}
		}
		
	}

}
