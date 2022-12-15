package ArrayList;
import java.util.*;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		ArrayList ob=new ArrayList();
		
		ob.add("swami");
		ArrayList ob1=new ArrayList();
		ob1.add("pranjali");
		ob1.add("hanumanta");
		
		ob.addAll(ob1);
		System.out.println(ob);
		ob1.remove(1);
		System.out.println(" "+ob1);
		Iterator om=ob.iterator();
		while(om.hasNext()) {
			//hasnext cheacks next value is present or not
			System.out.print(" "+om.next());
			//next print next value if it is present
		}
		System.out.println("\n"+ob);
	}

}
