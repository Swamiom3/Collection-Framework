package ArrayList;
import java.util.*;
public class Arraylist_ForEach {



		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			
			ArrayList<Integer> om=new ArrayList<Integer> ();
			System.out.println("enter elements");
			for(int i=0; i<=5; i++){
				int n=sc.nextInt();
				om.add(n);
			}

			System.out.println("your arraylist print by using foreach loop");
				
			for(Integer el:om){
				System.out.println(el);
			}
		}
	}
