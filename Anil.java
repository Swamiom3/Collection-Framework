/*wap take array list and remove duplicate elements*/
import java.util.*;
class remove_duplicate
{
  Scanner sc=new Scanner(System.in);
public void display()
{
  int n, i;
System.out.println("enter element in array list");
   ArrayList ob=new ArrayList();
for(i=1;i<5;i++)
{
    n=sc.nextInt(ob);
    ob.add(n);
}
 System. out.println("Array list is");
   System.out.println(ob);
   
   Hashset ob1=new HashSet(ob);
   System.out.println(ob1);
  }
   
  public static void main(String []arg)
   {
       remove_duplicate Rd=new  remove_duplicate();
         Rd.display();
   }
 }
  