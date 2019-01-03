package practice_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class Linked_list {

	public static void main(String[] args) 
	{
	List<Integer> ls1=new LinkedList<Integer>();
	ls1.add(1);
	ls1.add(2);
	ls1.add(4);
	ls1.add(4);
	ls1.add(9);
	ls1.add(6);
	ls1.add(7);
	System.out.println("printall values : "+ls1);
	List<Integer> ls2=new ArrayList<Integer>();
	ls2.addAll(ls1);
	System.out.println("printall values of LS2 : "+ls1);
	Collections.sort(ls2);
	System.out.println("sorted list : "+ls2);
	}
}