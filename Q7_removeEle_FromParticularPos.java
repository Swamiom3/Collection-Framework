package ArrayList;
import java.util.*;
public class Q7_removeEle_FromParticularPos {

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
		System.out.println("After removing element from particular position : ");
		System.out.println(al.remove(1));
		System.out.println(al);
	}

}
