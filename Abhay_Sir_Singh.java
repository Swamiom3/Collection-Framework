package ArrayList;
import java.util.*;
public class Abhay_Sir_Singh {

	public static void main(String[] args) {
		      ArrayList <String> list = new ArrayList<String>();
		      //Instantiating an ArrayList object
		      list.add("Praveen Kumar");
		      list.add("Yuvraj Singh");
		      list.add("Harbhajan Singh");
		      list.add("Gurjit Singh");
		      list.add("Virat Kohli");
		      list.add("Rohit Sharma");
		      list.add("Sandeep Singh");
		      list.add("Milkha Singh");
		      
		      System.out.println("Contents of the array list: ");
		      for (String element : list){
		         if (element.contains("Singh")){
		               System.out.println(element);
		         }
		      }
		   }
	}


