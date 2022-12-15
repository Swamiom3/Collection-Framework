package ArrayList;

import java.util.ArrayList;

public class Q1_Check_isEmpty {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(1, 25);
		al.add(10);
		al.add('P');
		System.out.println("Inputted elements :");
		System.out.println(al);
		System.out.println("After checking Empty or not : ");
		System.out.println(al.isEmpty());
	}

}
