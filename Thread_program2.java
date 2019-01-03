package practice_2;

public class Thread_program2
{
	public static void main(String[] args) 
	{
		Thread_2 obj1=new Thread_2();
		Thread_2 obj2=new Thread_2();
		obj1.setName("thread1");
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj1.run();
		obj2.setName("thread2");
		obj2.setPriority(Thread.MIN_PRIORITY);
		obj2.run();
	}
}
class Thread_2 extends Thread
{
	public void run()
	{
		System.out.println("Current thread : "+Thread.currentThread());
		System.out.println("thread name : "+Thread.currentThread().getName());
		System.out.println("priority : "+Thread.currentThread().getPriority());
	}
	
	
}