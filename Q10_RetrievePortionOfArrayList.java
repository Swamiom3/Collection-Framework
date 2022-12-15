package ArrayList;
import java.util.*;
public class Q10_RetrievePortionOfArrayList {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the elements in an arraylist");
		for (int i = 0; i < 8; i++) 
		{
			int n=sc.nextInt();
			al.add(n);
		}
		System.out.println("Inputted arraylist :"+al);
		
		System.out.println("After Retrieving portion of an Arraylist :");
		System.out.println(al.subList(3, 7));
		
	}

}
