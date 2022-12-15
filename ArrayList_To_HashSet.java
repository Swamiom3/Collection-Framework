package HashSet;
//AyyayList to HashSet convert
import java.util.*;
public class ArrayList_To_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList ob=new ArrayList();
		ob.add(11);
		ob.add(212);
		ob.add(173);
		ob.add(1524);
		ob.add(1515);
		
		System.out.println(" your arraylist "+ob);
		HashSet ob1=new HashSet(ob);
		
		System.out.println(" hashset printing from Arraylist "+ob1);
	}

}
