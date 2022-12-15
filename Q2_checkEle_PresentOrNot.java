package ArrayList;

import java.util.ArrayList;

public class Q2_checkEle_PresentOrNot {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add("Pranjal");
		al.add(21);
		al.add(1, "khairnar");
		System.out.println("Default elements :");
		System.out.println(al);
		
		System.out.println(al.contains(21));
		
	}

}
