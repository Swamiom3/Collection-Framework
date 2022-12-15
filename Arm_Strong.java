package ArrayList;
import java.util.*;
public class Arm_Strong {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		    ArrayList obj=new ArrayList();
		   
		    System.out.println("enter the elements :");
		    for(int i=1; i<=5; i++)
		    {
		       obj.add(in.nextInt());
		    }
		     System.out.println(obj);

		   
		   
		     Iterator itr=obj.iterator();
		   
		     Integer rem,sum ;
		     while(itr.hasNext())
		     {
		        Integer el=(Integer)itr.next();
		       
		        sum=0;
		        Integer num=el;      
		        while(num!=0)
		        {
		           rem=(Integer)num%10;
		           sum=(Integer)(sum+(rem*rem*rem));
		           num=num/10;
		        }
		               
		           if(sum.equals(el))
		           {
		              System.out.print(el+" ");
		           }
		           
		        }  
	}

}
