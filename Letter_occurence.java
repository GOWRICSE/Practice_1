package practice_2;
import java.util.HashMap;
import java.util.Map.Entry;
public class Letter_occurence {
	static void characterCount(String inputString) 
    {  
        HashMap<Character, Integer> charCountMap 
            = new HashMap<Character, Integer>(); 
 
        char[] strArray = inputString.toCharArray();  
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) 
            {  
                charCountMap.put(c, charCountMap.get(c) + 1);
            } 
            else 
            {  
                charCountMap.put(c, 1); 
            } 
        } 
   
        for (Entry<Character, Integer> en : charCountMap.entrySet()) { 
            System.out.println(en.getKey() + "=" + en.getValue()); 
        } 
    }
    public static void main(String[] args) 
    { 
        String str ="gowrigowri"; 
        characterCount(str); 
    }
}