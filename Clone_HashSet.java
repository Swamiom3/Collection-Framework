package HashSet;
//6. Write a Java program to clone a hash set to another hash set.
import java.util.*;
public class Clone_HashSet {

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
		
		HashSet ob1=new HashSet();
		ob1=(HashSet)ob.clone();
				
		
		System.out.println(" 2nd hashset "+ob1);

	}

}
