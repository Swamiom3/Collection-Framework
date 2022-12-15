package HashSet;
//2. Write a Java program to iterate through all elements in a hash list.
import java.util.*;
public class Iterate_through_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet ob=new HashSet();
		
		ob.add("omkar");
		ob.add("swami");
		ob.add("baswaraj");
		ob.add("imom");
		ob.add("omom");
		
		Iterator ob1=ob.iterator();
		
		while(ob1.hasNext()) {
			System.out.println(" "+ob1.next());
			ob1.remove();
		}
		try {
		System.out.println(" nothings is here my friend you are deleted alredy "+ob1);
		}
		catch(Exception e) {
			System.out.println("dont mind you are not here");
		}

	}

}
