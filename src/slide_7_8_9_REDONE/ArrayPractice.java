package slide_7_8_9_REDONE;


/* BEFORE 
 * 
 * Using Array methods in Java is done using the Array class in our program. This class is part of the java.util package and can bring in the inheritance of the Array class that let us create and inspect our array.
 * 
 * 
 * 
 * import java.io.Console;
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

 */

//AFTER FIXING
/*DESCRIPTION:
 * Declare an array:
Specify the type of the elements in the array, followed by square brackets [].
Optionally, provide a name for the array variable.
java
Copy code
// Declaration of an integer array
int[] numbers;

// Declaration of a string array
String[] names;
Create an array:
Allocate memory for the array using the new keyword, specifying the size of the array.
Assign the newly created array to the array variable.
java
Copy code
// Creating an integer array of size 5
numbers = new int[5];

// Creating a string array of size 3
names = new String[3];
Initialize array elements:
Assign values to the elements of the array using the array index.
Array indices start from 0 and go up to array.length - 1.
java
Copy code
// Initializing integer array elements
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Initializing string array elements
names[0] = "John";
names[1] = "Jane";
names[2] = "Bob";
Access array elements:
Use the array variable name followed by the index in square brackets to access specific elements of the array.
java
Copy code
// Accessing and printing array elements
System.out.println(numbers[0]);  // Output: 10
System.out.println(names[1]);    // Output: Jane
Array length:
Use the array.length property to get the length or size of the array.
java
Copy code
// Printing array length
System.out.println(numbers.length);  // Output: 5
System.out.println(names.length);    // Output: 3
Iterate over array elements:
Use loops such as for or foreach to iterate over the elements of an array.
java
Copy code
// Iterating over integer array elements using for loop
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}

// Iterating over string array elements using foreach loop
for (String name : names) {
    System.out.println(name);
}
Arrays of objects:
Arrays can also hold objects of any class or custom objects.
Create objects, assign them to array elements, and access their properties and methods.
java
Copy code
// Array of objects
MyClass[] objects = new MyClass[3];

// Creating objects and assigning them to array elements
objects[0] = new MyClass();
objects[1] = new MyClass();
objects[2] = new MyClass();

// Accessing object properties and methods
objects[0].doSomething();
These are the basic steps to declare, create, initialize, and work with arrays in Java. Remember to handle array indices carefully and be mindful of the array length to avoid any IndexOutOfBoundsException.
 */
  public class ArrayPractice {
      public static void main(String[] args){
        String[] my_array = {"Aaron","Joan","Layla"};

        System.out.printf(my_array[1]); // returns "Joan"
        
        int size = my_array.length;
        System.out.println(size); // returns the length or size of the array (3)
      }    

}
