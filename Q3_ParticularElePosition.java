package ArrayList;

import java.util.ArrayList;

public class Q3_ParticularElePosition {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add(2);
		al.add("java");
		al.add(45);
		
		System.out.println(al);
		System.out.println("position of particular element is :");
		System.out.println(al.indexOf("java"));

	}

}
