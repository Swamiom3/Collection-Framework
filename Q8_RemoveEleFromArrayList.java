package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Q8_RemoveEleFromArrayList {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(1, 25);
		al.add(10);
		al.add('P');
		System.out.println("Inputted elements in Arraylist are:");
		System.out.println(al);
		System.out.println("After removing particular element from ArrayList: ");
		System.out.println("Enter the element you want to remove");
		int remove=sc.nextInt();
		Iterator itr=al.iterator();
		
			Integer i=Integer.valueOf(remove);
			al.remove(i);
		
		System.out.println(al);
	}

}
