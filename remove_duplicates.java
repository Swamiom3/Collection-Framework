package ArrayList;
import java.util.*;
public class remove_duplicates {
	
	/*wap take array list and remove duplicate elements*/
	  Scanner sc=new Scanner(System.in);
	  int n,i;
	public void disp()
	{
	  
	System.out.println("enter element in array list");
	   ArrayList<Integer> ob=new ArrayList<Integer>();
	   for(i=0; i<5; i++) {
	    n=sc.nextInt();
	    ob.add(n);
	   }
	 System.out.println(" your existing Arraylist is");
	   System.out.println(ob);
	   
	   HashSet ob1=new HashSet(ob);
	   System.out.println("hashset ans");
	   System.out.println(ob1);
	  }
	   
	  public static void main(String []arg)
	   {
		  remove_duplicates Rd=new  remove_duplicates();
	         Rd.disp();
	   }
	 }
	  

