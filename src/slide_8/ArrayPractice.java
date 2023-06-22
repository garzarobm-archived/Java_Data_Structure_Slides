package slide_8;


/* BEFORE 
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
  public class ArrayPractice {
      public static void main(String[] args){
        String[] my_array = {"Aaron","Joan","Layla"};

        System.out.printf(my_array[1]); // returns "Joan"
        
        int size = my_array.length;
        System.out.println(size); // returns the length or size of the array (3)
      }    

}
