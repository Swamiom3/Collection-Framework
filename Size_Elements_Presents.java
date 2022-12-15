package HashSet;
//Write a Java program to get the number of elements in a hash set.
import java.util.*;
public class Size_Elements_Presents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet ob=new HashSet();
		ob.add(15);
		ob.add(150);
		ob.add(12);
		ob.add(166);
		ob.add(105);
		ob.add('a');
		System.out.println(" "+ob);
		
		System.out.println("present elements is : "+ob.size());

		System.out.println(" "+ob.isEmpty());
	}

}
