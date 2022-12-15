package HashSet;
//Write a Java program to convert a hash set to a List/ArrayList.
import java.util.*;
public class HashSet_To_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet ob=new HashSet();
		ob.add(11);
		ob.add(212);
		ob.add(173);
		ob.add(1524);
		ob.add(1515);
		
		System.out.println(" hashset printing "+ob);

		System.out.println("converting into arraylist from hasset");
		
		ArrayList ob1=new ArrayList(ob);
		System.out.println(" your arraylist from hashset "+ob1);
	}

}
