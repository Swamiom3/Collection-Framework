package ArrayList;

//String "i am very happy in india an india is called country of temple"---> find freaquency of each char use ArrayList or Linklist.
import java.util.*;
class Freq1
{
	public void frequency(String s)
	{
		int lock=-1;
		String str[]=s.split("");
		int count[]=new int[str.length];
		ArrayList <String>list=new ArrayList<String>(Arrays.asList(str)); 
		for(int i=0;i<str.length;i++)
		{
			int c=1;
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].equals(str[j]))
				{
					count[j]=lock;
					c++;
				}
			}
			if(count[i]!=lock)
			{
				count[i]=c;
			}
		}

		for(int i=0;i<str.length;i++)
		{
			if(count[i]!=lock)
			{
				list.add(i,str[i]);
			}else
			{
				list.add(i,null);
			}
		}
		System.out.println("Frequency\t char");
		for(int i=0;i<str.length;i++)
		{
			if(count[i]!=lock)
			{
				System.out.println(list.get(i)+"\t\t"+count[i]);
			}
		}
	}
	public static void main(String args[])
	{
		String s="i am very happy in india an india is called country of temple";
		Freq1 fk=new Freq1();
		fk.frequency(s);
	}
}

