package HashSet;

/*4. Write a Java program to empty an hash set. 

5. Write a Java program to test a hash set is empty or not.*/
import java.util.*;
public class Remove_isEmpty {

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
		
		System.out.println(" before removing el "+ob.isEmpty());
		
		ob.removeAll(ob);
		System.out.println(" removed all " +ob);
		System.out.println(" after removing el "+ob.isEmpty());
		

	}

}
