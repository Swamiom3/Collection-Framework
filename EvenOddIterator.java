package ArrayList;
import java.util.*;
public class EvenOddIterator {

	Scanner sc = new Scanner(System.in);
	int i,n,sum=0,c=0;
	ArrayList<Integer> al = new ArrayList<Integer>();
	//<Integer> : It is used to allow only "integer" type of elements.
			
	public void Input()
	{
		System.out.println("Enter array list elements : ");
		for(i=1;i<=10;i++)
		{
			n=sc.nextInt();
			al.add(n);
		}
	}
	
	public void Disp()
	{
		Iterator<Integer> itr = al.iterator();
		System.out.println("Entered elements are : ");
		System.out.println(al);
		
		while(itr.hasNext())//hasNext() : Is used to check next element of ArrayList. It returns boolean value.
		{
			Integer e = (Integer)itr.next();
			if(e%2==1)
			{
				sum = sum + e;
				c++;
				itr.remove();//remove() : It removes current element.
			}
		}
		
		System.out.println("Sum of odd number is : "+sum);
		System.out.println("Count of odd number is : "+c);
		System.out.println("Even elements in arraylist are : ");
		System.out.println(al);
	}
	
	public static void main(String[] args)
	{
		EvenOddIterator eoi = new EvenOddIterator();
		eoi.Input();
		eoi.Disp();
	}
}
