package ArrayList;
import java.util.*;
public class Delete_Duplicate {

	public static void main(String[] args) {
		ArrayList ob=new ArrayList();
		ob.add(1);
		ob.add(1);
		ob.add(2);
		
		HashSet ob1=new HashSet(ob);
		System.out.println(ob1);

	}

}
