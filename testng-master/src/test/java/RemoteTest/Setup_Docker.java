package RemoteTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Setup_Docker {
	
	
	
	@BeforeTest
	public void startDockergrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start-dockergrid.bat ");
		Thread.sleep(20000);
	}
	
	@AfterTest
	public void shutdownDockergrid() throws IOException, InterruptedException
	{
		
		Runtime.getRuntime().exec("cmd /c start shutdown-dockergrid.bat ");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
		
		
	}

}
