package practice_2;

import java.util.*;
public class LinkedHash_map {

	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();           
	      map.put(100,"Amit");    
	     map.put(101,"Vijay");    
	     map.put(102,"Rahul");    
	       //Fetching key  
	       System.out.println("Keys: "+map.keySet());  
	       //Fetching value  
	       System.out.println("Values: "+map.values());  
	       //Fetching key-value pair  
	       System.out.println("Key-Value pairs: "+map.entrySet());
	     //removing by the keys
	       map.remove(100);
	      System.out.println("after removing :"+map);
	      //create set so that we can traverse
	      Set st1=map.entrySet();
	      Iterator itr=st1.iterator();
	      while(itr.hasNext())
	      {
	    	  System.out.println(itr.next());
	      }
	      
	      
		
		
		
	}
}