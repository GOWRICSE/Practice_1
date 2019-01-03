package practice_1;
import java.util.Scanner;
public class M_3_third 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int input4=sc.nextInt();
		int input5=sc.nextInt();
		
		int arr[]= {input1,input2,input3,input4,input5};
		for(int i=0;i<5;i++)
		{
			String str=Integer.toString(arr[i]);
			int num[]=new int[str.length()];
			for(int j=0;j<num.length;j++)
			{
				num[j] = Integer.parseInt(str, str.charAt(j));
				System.out.println("______"+num[j]);
			}
					
			
			
			
		}
		
	}
}