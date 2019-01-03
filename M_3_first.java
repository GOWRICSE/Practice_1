package practice_1;
import java.util.Scanner;
public class M_3_first 
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int input1=sc.nextInt();
	int input2=sc.nextInt();
	int input3=sc.nextInt();
	int input4=sc.nextInt();
	int arr[]= new int[input4];
    arr[0]=input1;
	arr[1]=input2;
	arr[2]=input3;
	for(int i=3  ; i<input4 ; i++)
	{
		arr[i]=(input2 + input3 ) - input1 ;
		input1=input2;
		input2=input3;
		input3=arr[i];
	}
    System.out.println(arr[arr.length-1]);
		

		
	}
	
}