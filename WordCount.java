package LabExercises;

import java.util.*;
import java.io.*;

public class WordCount {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter some string separated by white space: ");
		String in = scan.nextLine();
		System.out.println("This string has: " + in.length() + " words.");
	}

}
