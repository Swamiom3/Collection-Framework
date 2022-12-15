package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q6_InsertEle_particularPos {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		
		System.out.println("Enter elements in arraylist");	
		for (int i = 0; i < 5; i++) 
		{
			int n =sc.nextInt();
			al.add(n);
		}
		System.out.println("Inputted elements are: "+al);
		
		System.out.println("After inserting element particular position :");
		al.add(1, 25);
		System.out.println(al);
	}

}
