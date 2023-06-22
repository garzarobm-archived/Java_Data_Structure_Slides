package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		//Create a new string
		String myString = "I really love icecream!";

		//Create another string that holds the split version of the first
		String str[] = myString.split(" ");

		//Use the List class to create a new ArrayList          
		List<String> arrayString = new ArrayList<String>();

		//Store the contents of our split string as elements in
		//arrayString using the Array.asList to convert the string into an array
		arrayString = Arrays.asList(str);
		System.out.println(arrayString);
		//=>[I, really, love, icecream!] //Turns the string myString into an array
	}

}
