package practice_2;
import java.util.Scanner;
public class Fruit_main 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		fruit obj=new fruit();
		System.out.println("Enter the fruit name : ");
		obj.setFruitname(sc.nextLine());
		obj.getFruitname();
		System.out.println("Enter the true/false whether it has seed or not : ");
		obj.setIsseed(sc.hasNext());
		
		obj.isIsseed(); 
		//System.out.println("Enter the vitamin : ");
	//	char ch=sc.next().charAt(0);
		//obj.setVitamin(ch);
		// obj.getVitamin();
		// obj.display();	
		System.out.println("enter the character : ");
		char ch1 = sc.next().charAt(0);
		System.out.println("character : "+ch1);
	}
}

class fruit
{
	String fruitname;
	boolean isseed;
	char vitamin;
	fruit()
	{
		fruitname="";
		isseed=false;
		vitamin='\0';
	}
	fruit(String fruitname,boolean isseed,char vitamin)
	{
	this.fruitname=fruitname;
	this.isseed=isseed;
	this.vitamin=vitamin;
	}
	
	public String getFruitname() {
		return fruitname;
	}
	public void setFruitname(String fruitname) {
		this.fruitname = fruitname;
	}
	public boolean isIsseed() {
		return isseed;
	}
	public void setIsseed(boolean isseed) {
		this.isseed = isseed;
	}
	public char getVitamin() {
		return vitamin;
	}
	public void setVitamin(char vitamin) {
		this.vitamin = vitamin;
	}
	void display()
	{
		if(isseed==true)
		{
			System.out.println("Seeded Fruit "+fruitname+" has vitamin "+vitamin);
		}
		else
		{
			System.out.println("Seedless Fruit "+fruitname+" has vitamin "+vitamin);
		}
	}
}
