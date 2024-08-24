package JavaBasics;

public class Threding {
	
	public synchronized void PrintTable(int num)
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" "+i+" ="+(num*i));
		}
	}
	
	

}
 class First extends Thread
{
	Threding th;
	public First(Threding th)
	{
		this.th=th;
	}
	
	public void run()
	{
		th.PrintTable(12);
	}
	
	
}
 class Second extends Thread
{
	Threding th;
	public Second(Threding th)
	{
		this.th=th;
	}
	
	public void run()
	{
		th.PrintTable(11);
	}
	
	
}
 
 class Third extends Thread
{
	Threding th;
	public Third(Threding th)
	{
		this.th=th;
	}
	
	public void run()
	{
		th.PrintTable(14);
	}
	
	
}
