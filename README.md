# Java_Data_Structure_Slides
Proposed Changes for Java Data Structures:
- Removal of slide 2 (Homework Review) for dynamic content for instructors not involved in homework reviewal
- linked table of content on slide 3
	- Introduction to Data Structures
	- Arrays
	- Collections Framework
	- ArrayList
	- HashMap
	- Linked List
	- Queues
	- Stacks
- Answers to "Java review" on slide below the questions (slide 4)
- slide 5: quick edits
- Slide 5b: a slide right after 5 telling students to make a new project since they just got introduced to how everything works:
	-Create a new Java project in Eclipse:
		- Go to "File" > "New" > "Java Project".
		- Provide a project name and click "Finish".
	- Create a new Java class:
		- Right-click on the project folder in the "Package Explorer" view.
		- Go to "New" > "Class".
		- Provide a class name and select the package for the class.
		- Click "Finish".
- Slide 6: minor edit of information so jump to code with arrays isn't so random:
	Arrays are a collection of data.
	The data stored in an array is collectively known as elements.
	//creates an array of strings 
	String[] fruit;
	
	//creates an array of integers
	int[] classSize;

	In Java, an array can hold any sort of datatype all elements in an array must be of the same data type
	
	//creates an array of names
	String[] names = {"John", "Daryl", "Mike", "Sarah", "Michelle"};
slide 7: code corrections (console doesn't work in  Eclipse IDE)
String[] my_array = {"mary","sybil","edith"};
console.printf(my_array[1]);
 // returns "sybil"
slide 8: content and code corrections
Incorrect Content (This isn't how you use Array Methods, Array methods are by default included into every java program): Using Array methods in Java is done using the Array class in our program. This class is part of the java.util package and can bring in the inheritance of the Array class that let us create and inspect our array.
import java.io.Console;
import java.util.*;
  public class ArrayPractice {
      public static void main(String[] args){
String[] my_array = {"Aaron","Joan","Layla"};
        Console console = System.console();
        console.printf(my_array[1]);
        // returns "Joan"
        int size = my_array.length;
        System.out.println(size);
          // returns the length or size of the array (3) 
      } 
}
