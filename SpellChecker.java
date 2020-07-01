package MarkedExercises;

import java.util.*;
import java.io.*;

public class SpellChecker{

		public static void main(String [] args) {

		//Name of file to read from
		//String dictionary = "dictionary.txt";

	    // create token
	    String token = "";
	    // create Scanner inFile
	    Scanner inFile = new Scanner(new File("dictionary.txt")).useDelimiter(",\\s+"); //Scans dictionary file into an array, separated by spaces
	    List<String> words = new ArrayList<String>(); //ArrayList containing words, from dictionary array
	    // while loop
	    while (inFile.hasNext()) { //While inFile has next element in array
	    // find next line
		    token = inFile.next(); //Token is next word in array
		    words.add(token); //Add 
	    }
	    inFile.close();
	    //array containing words in dictionary
	    String[] dictArray = words.toArray(new String[0]);
	    //for loop
	    for (String w : dictArray) {
		    System.out.println(w);
	    }

		//Reads file as command line argument
		String file = args[0];


        for (int i = 0; i < dictArray.length; i += 2){
        	System.out.println("distance(" + dictArray[i] + ", " + dictArray[i+1] + ") = " + distance(dictArray[i], dictArray[i + 1]));
		}
	}

		public static boolean spellCheck(String file, String [] dictArray){
			String currentWord = ""; //Current word is empty
			boolean speltCorrect = true; //Is word spelt correctly?
			Scanner spellCheck = new Scanner(file); //Reads through test file
			spellCheck.useDelimiter("\\s+"); //Separates each word in test file
			while(spellCheck.hasNext()){ //While test file has more words
				currentWord = spellCheck.next(); //
					if(currentWord != dictArray){ //If current word is not in dictionary
						System.out.println(currentWord + " is spelt incorrectly. Add to Dictionary? (Y/N)"); //Print word spelt incorrectly
						speltCorrect = false; //Word is spelt incorrectly (boolean set to false)
						Scanner scan = new Scanner(); //Scanner recording user input
						if (scan == "Y"){ //If user enters "Y" then add word to dictionary
							// currentWord = ;
						}
						else if(scan == "N"){ //If user enters "N" then continue without adding
						}
					}
			}
			return speltCorrect; //returns boolean result of speltCorrect
		}

		public static boolean checkWord(String file, String[] dictArray){
			boolean correct = false; //Sets boolean correct to false which checks if spelling is correct
			int length = dictArray.length; //Declared length as the length of the array
			int i = 0; //Initialise integer i to 0
			while(!correct && i < length){ //While spelling is incorrect and i is less than length
				if(file.trim().equalsIgnoreCase(dictArray[i])){ //If word exists in dictionary array
					correct = true;	//return true
				}
				i++; //Increment
			}
			return correct; //Return correct
		}

}
