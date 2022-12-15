package HashSet;
//Write a Java program to compare two hash set.
import java.util.*;
public class Compare_Two_HashSet {

	private static final HashSet<Integer> Integer = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> ob=new HashSet<Integer>();
		ob.add(15);
		ob.add(150);
		ob.add(12);
		ob.add(166);
		ob.add(105);
		
		System.out.println(" 1st hashset"+ob);
		
		HashSet ob1=new HashSet();
		
		ob1.add(151);
		ob1.add(150);
		ob1.add(121);
		ob1.add(166);
		ob1.add(1051);
		
		
		System.out.println(" 2nd hashset"+ob1);
		
		System.out.println("compairing two hashsets");
		
		HashSet result_set = new HashSet ();
        for ( int element : ob){
            System.out.println(ob1.contains(element) ? "Yes" : "No");
         }      
		
		
		
		

	}

}
