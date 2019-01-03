package practice_2;

public class Thread_program 
{
	public static void main(String[] args) 
	{
		Thread_1 obj1=new Thread_1();
		Thread_1 obj2=new Thread_1();
		obj1.start();
		obj2.start();
	}
}
class Thread_1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try
			{
				Thread.sleep(100);
				System.out.println("Thread .."+i);	
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}