package practice_1;
import java.util.Scanner;

public class SSubString_1 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1="imagination";
	String s2="ahtng";
	for(int i=0;i<s2.length();i++)
	{
		char ch=s2.charAt(i);
		for(int j=0;j<s2.length();j++)
		{
			if(i!=j)
			{
			for(int k=0;k<=s1.length()-2;k++)
			{
				if((""+ch+s2.charAt(j)).equals(s1.substring(k,k+2)))
				{
					s1=s1.replaceFirst(""+s2.charAt(j),"");
				}
				
			}
		}
		}
	}
	System.out.println(s1);
}
}
