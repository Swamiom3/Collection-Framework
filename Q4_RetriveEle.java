package ArrayList;

import java.util.ArrayList;

public class Q4_RetriveEle {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(2);
		al.add("java");
		al.add(45);
		
		System.out.println(al);
		System.out.println("After retrieving particular element :");
		System.out.println(al.get(1));

	}

}
