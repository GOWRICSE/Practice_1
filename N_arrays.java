package practice_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class N_arrays {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		//list.add(sc.nextLine());
		list.add("ccc");
		list.add("ddd");
		Iterator itr=list.iterator();

		System.out.println("Printing all the values in single line :"+list);
		System.out.println("Printing one by one :");
		while(itr.hasNext())
		{  
		 System.out.println(itr.next());  
		} 
		//removing by value
		list.remove("bbb");
		System.out.println(list);
		//removing by index value
		list.remove(2);
		System.out.println(list);
		// update the list
		list.add("vvv");
		System.out.println(list);
		list.removeAll(list);
		//after removing all values
		System.out.println(list);
		list.add("ddd");
		list.add("sss");
		list.add("www");
		list.add("eee");
		list.add("ttt");
		list.add("iii");
		list.add("vvv");
		//printing all the updated values
		System.out.println(list);
		//removing particular values 
		list.removeIf(ac -> ac.contains("ttt"));
		System.out.println(list);
		
		ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ajay");
		  al.add("Hanumat");
		  System.out.println("Al 1 : "+al);
		  System.out.println("size of arraylist :"+al.size());
		  ArrayList<String> al2=new ArrayList<String>();  
		 /* al2.add("Ravi");  
		  al2.add("Hanumat");  
		  al.retainAll(al2);  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator itr1=al.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }  
		*/
		  al2.addAll(al);
		  Collections.sort(al);
		  System.out.println("sorted arraylist : "+al);
		  System.out.println("AL 2 : "+al2);
	}
}