package practice_1;

public class Converting_Datatype 
{
	public static void main(String[] args) 
	{
		// Number in character into Integer
		char c='5';  
		int num=Integer.parseInt(String.valueOf(c));  
		System.out.println(num); 
		// Character into String 
		char ch='S';  
		String str=String.valueOf(ch);  
		System.out.println(str); 
		// String into Integer
		String str1="896";
		int num1=Integer.parseInt(str1);
		System.out.println(num1);
		// String into character
		String s1="Gowri";
		char[] c1=s1.toCharArray();
		System.out.println(c1);
		// Integer into String
		int num2=689;  
		// String s2=String.valueOf(num2);
		 String s2=String.format("%d",num2);
		//String s2= Integer.toString(num2);
		System.out.println(s2);
		// String into Long
		String s3="9990449935";  
		long l=Long.parseLong(s3);  
		System.out.println(l);
		//  Integer into Long
		int num3=9897878;
		long l1=num3;
		System.out.println(l1);
		// long into Integer
		long l2=5800;  
		int num4=(int)l2;  
		System.out.println(num4); 
		// Integer into Character 
		int num5=8;
		char ch2=(char)(num5 + 48);
		System.out.println(ch2);
	}
}