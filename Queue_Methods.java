package Map_Interface;
import java.util.*;
public class Queue_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue ob=new PriorityQueue();
		
		System.out.println(ob.peek());
		System.out.println("anil samjal ka?");
		
		//System.out.println(ob.element());
		
		ob.add(1);
		ob.add(2);
		System.out.println("after adding elements");
		System.out.println(ob.element());
		
		System.out.println(ob.peek());
		
		System.out.println("poll");
		System.out.println(ob.poll());
		
		System.out.println(ob.remove());
		
		
	}

}
