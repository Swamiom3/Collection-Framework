package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Q12_SortArrayList {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the elements in an arraylist");
		for (int i = 0; i < 5; i++) 
		{
			int n=sc.nextInt();
			al.add(n);
		}
		System.out.println("Inputted arraylist :"+al);
		
		System.out.println("After Sorting an Arraylist :");
		al.sort(null);
		System.out.println(al);
		
		
	}

}
