package BasicTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends {



	@Test(priority = 1)
	void launchurl() {
		Assert.assertTrue(true); // This will pass and be executed first
	}

// This test has priority 2 and depends on the successful execution of 'launchurl'
	@Test(priority = 2, dependsOnMethods = { "launchurl" })
	void login() {
		Assert.assertTrue(true); // This will pass
	}

// This test has priority 3 and depends on the successful execution of 'login'
	@Test(priority = 3, dependsOnMethods = { "login" })
	void search() {
		Assert.assertTrue(true); // This will pass
	}

	@Test(dependsOnMethods = {"launchurl", "login", "search", "click"})
	void logout() {
		Assert.assertTrue(true); // This will pass and be executed last
	}
// This test has priority 4 and depends on the successful execution of 'login' and 'search'
	@Test(priority = 4, dependsOnMethods = {"login", "search"})
	void click() {
		Assert.assertTrue(true); // This will pass
	}

// This test has priority 5 and does not depend on any other test
	
}
