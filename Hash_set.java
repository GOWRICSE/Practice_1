package practice_2;
//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class Hash_set {

	public static void main(String[] args) 
	{
	Set<Integer> st=new HashSet<Integer>();
	List<Integer> ls=new ArrayList<Integer>();
	ls.add(1);
	ls.add(2);
	ls.add(3);
	ls.add(3);
	ls.add(4);
	ls.add(5);
	st.addAll(ls);
	System.out.println("Arraylist :"+ls);
	System.out.println("Set : "+st);
	
	Set<String> st2=new HashSet<String>();
	String str="hi hi hi hello welcome";
	String strArray[]=str.split(" ");
	System.out.println("String :"+str);
	//System.out.println("StringArray :"+strArray);
	List<String> ls2=new ArrayList<String>();
	ls2= Arrays.asList(strArray);
	System.out.println("ArrayList : "+ls2);
	st2.addAll(ls2);
	System.out.println("As set :"+st2);
	if(!st2.isEmpty())
	{
		System.out.println("true ");
	}
	

	
	
	
	}
}