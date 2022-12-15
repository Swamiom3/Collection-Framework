package HashSet;
// Write a Java program to convert a hash set to an array. 
import java.util.*;
public class Cover_HasSet_int_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> ob=new HashSet<String>();
		ob.add("o");
		ob.add("a");
		ob.add("e");
		ob.add("c");
		ob.add("z");
		
		System.out.println(" simple hashset "+ob);
		
		String[] new_array = new String[ob.size()];
	      ob.toArray(new_array);
	 
	     // Displaying Array elements
	     System.out.println("Array elements: ");
	      for(String element : new_array){
	        System.out.println(element);
	     }
	}

}
