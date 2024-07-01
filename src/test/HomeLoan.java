package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Test(enabled=false)
	public void web() {
		System.out.println("Web Login home");
	}
	@Test(groups= {"smoke"})
	public void mobile() {
		System.out.println("Mobile Login home");
	}
	@Test(dependsOnMethods= {"mobile"})
	public void API() {
		System.out.println("API Login home");
	}

	@BeforeSuite
	public void demo() {
		System.out.println("I will execute first");
	}
	
	@Test(timeOut=40000)
	public void anime()
	{
		System.out.println("Animation");
	}
}
