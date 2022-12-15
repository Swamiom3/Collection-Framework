package Map_Interface;
import java.util.*;
public class Show_Key_and_Elements_in_Hashmap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		HashMap ob=new HashMap();
		ob.put(1,"omkar");
		ob.put(9, "aman1");
		ob.put(7,"aman2");
		ob.put(4,"pranjal");
		ob.put(5, "hemanat");
		ob.put(9, "priya");
//1. Write a Java program to associate the specified value with the 
		//specified key in a HashMap.
		System.out.println("fisrt output");
		System.out.println(" "+ob);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//2. Write a Java program to count the number of key-value (size)
		//mappings in a map.

		System.out.println("secound output");
		System.out.println(" key size="+ob.size());
		System.out.println();
		System.out.println("-----------------------------------------------");

//3. Write a Java program to copy all of the mappings from the specified 
		//map to another map. 
		System.out.println("third output");
		HashMap ob2=new HashMap(ob);
		
		System.out.println("copied elements sycussfully="+ob2);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//4. Write a Java program to remove all of the mappings from a map.
		
	
		System.out.println("fourth output");
		ob2.clear();
		System.out.println("after removal elements sycussfully="+ob2);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//5. Write a Java program to check whether a map contains key-value mappings
		//(empty) or not. 
		System.out.println("fifth output");
		System.out.println(" chaeking is empty or not:-"+ob2.isEmpty());
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//6. Write a Java program to get a shallow copy of a HashMap instance.
		System.out.println("sixth output");
		HashMap ob3=new HashMap(ob);
		ob3.clone();
		
		System.out.println("clone map:-"+ob3);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//8. Write a Java program to test if a map contains a mapping for the 
		//specified value.
		
		System.out.println("enter to serch value");
		String s=sc.nextLine();
		if(ob3.containsValue("omkar")) {
			System.out.println("eight output");
			System.out.println("yes its available");
			System.out.println();
			System.out.println("-----------------------------------------------");
			
		}
		else {
			System.out.println("eight output");
			System.out.println("No!");
			System.out.println();
			System.out.println("-----------------------------------------------");
		}
//9. Write a Java program to create a set view of the mappings contained in 
		//a map.
		System.out.println("nineth output");
		Set om = ob3.entrySet();
		
		System.out.println("SET Values:-"+om);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//10. Write a Java program to test if a map contains a mapping for the 
		//specified value.
		
		System.out.println("enter key to search it is present or not");
		int key=sc.nextInt();
		if(ob3.containsKey(key)) {
			System.out.println("10th output");
			System.out.println("yes its available");
			System.out.println();
			System.out.println("-----------------------------------------------");
			
		}
		else {
			System.out.println("10th output");
			System.out.println("No!");
			System.out.println();
			System.out.println("-----------------------------------------------");
		}
//11. Write a Java program to get a set view of the keys contained in this map. 
		Set keyset = ob3.keySet();

		System.out.println("11 output");
		System.out.println("KEYSET Values:-"+keyset);
		System.out.println();
		System.out.println("-----------------------------------------------");
		
//12. Write a Java program to get a collection view of the values contained in 
		//this map.
		System.out.println("12 output");
		System.out.println("collection values:-"+ob3.values());
		System.out.println("-----------------------------------------------");
	}

}
