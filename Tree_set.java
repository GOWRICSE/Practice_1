package practice_2;
import java.util.TreeSet;
import java.util.*;
public class Tree_set {

	public static void main(String[] args)
	{
		 TreeSet<String> al=new TreeSet<String>();
		  al.add("aaa");
		  al.add("vvv");
		  al.add("bbb");
		  al.add("ccc");

		  Iterator<String> itr=al.iterator();
		  System.out.println("Displaying in ascending order :");
		  while(itr.hasNext())
		  {
		   System.out.println(itr.next());
		  }
		System.out.println("displaying in descending order :");
		Iterator<String> itr2=al.descendingIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		System.out.println("Displaying the highest values :"+al.pollFirst());
		System.out.println("Displaying the lowest values : "+al.pollLast());
		System.out.println("Displaying the size :"+al.size());
	}
}