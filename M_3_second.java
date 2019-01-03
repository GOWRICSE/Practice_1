package practice_1;
import java.util.Scanner;
public class M_3_second 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int arr[] = new int[input1];
		int num=input1-1;
		int rs=input1;
		for(int i=1;i<input1;i++)
		{
			arr[0]=input1;
			arr[i]=num--;
			if(input2==1)
			{
			if(i%2==0)
					rs+=arr[i];
			else
					rs-=arr[i];
			}
			else if(input2==2)
			{
			if(i%2==0)
					rs-=arr[i];
			else
					rs+=arr[i];
			}
		}
	System.out.println(rs);		
	}
}