package JavaBasics;

public class SyncTest {
	
	public static void main(String[] args)
	{
	Threding t=new Threding();
	
	First first=new First(t);
	first.start();
	Second sec=new Second(t);
	sec.start();
	Third th=new Third(t);
	th.start();
	
	}
	

}
