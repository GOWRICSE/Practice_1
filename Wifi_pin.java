package practice_1;
import java.util.Scanner;
public class Wifi_pin
{
	public static void main(String[] args) 
{	
	Scanner sc=new Scanner(System.in);
	int rn=sc.nextInt()	;
	String fname=sc.nextLine();
	String name=sc.nextLine();
    char[] pin=new char[4];
    int num=rn/10;
    num=num % 10;
   // char s=(char) (num+48);
    pin[0]=(char) (num+48);
    char[] sp={')','!','@','#','$','%','^','&','*','('};
    int num2=rn/100;
    for(int i=0;i<sp.length;i++)
    {
       if(num2==i) 
       {
           pin[1]=sp[i];
       }
    }
    pin[2]=name.charAt(name.length()-1);
    pin[3]=pin[0];
    for(int i=0;i<4;i++)
    {
        System.out.print(pin[i]);
    }
}
}