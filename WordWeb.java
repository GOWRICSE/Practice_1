package practice_1;
import java.util.Scanner;
public class WordWeb 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	String str="WORLD WIDE WEB";
	String s1[]=str.split(" ");
	int ascii1,ascii2,pos1,pos2;
	int sum[]=new int[s1.length];
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0; j < s1[i].length() / 2 ; j++)
		{
		s1[i]=s1[i].toLowerCase();
		if(s1[i].length() %2 ==0) 
			{
				ascii1=(int)s1[i].charAt(j);
				ascii2=(int)s1[i].charAt(s1[i].length()-(j+1));
				pos1=ascii1 - 96;
				pos2=ascii2 - 96;
				sum[i]=sum[i] + (pos1 - pos2);
			}
		else
		{
			ascii1=(int)s1[i].charAt(j);
			ascii2=(int)s1[i].charAt(s1[i].length()-(j+1));
			pos1=ascii1 - 96;
			pos2=ascii2 - 96;
			sum[i]=sum[i] + (pos1 - pos2);
			if(j==(s1[i].length() / 2)-1)
			{
				int ascii=(int)s1[i].charAt(s1[i].length()/2);
				int pos=ascii - 96;
				sum[i]=sum[i] + pos;	
			}
		}
		}
	}
	System.out.println(sum[0]+""+sum[1]+""+sum[2]);
	}
}