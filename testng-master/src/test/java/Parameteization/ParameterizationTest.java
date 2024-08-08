package Parameteization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationTest {

	@Parameters("browser")
	@Test
	public void getParameter(String browser) {

		System.out.println("The Browser name is-----" + browser);
	}

	@Parameters({ "userName", "password" })
	@Test
	public void loginCredentials(String userName, String password) {

		System.out.println("The Username is-----" + userName);
		System.out.println("The Password is-----" + password);
	}
}
