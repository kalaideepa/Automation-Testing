package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoldLoan {
	

	
	@Test
	public void web() {
		System.out.println("Web Login gold");
	}
	@Test(groups= {"smoke"})
	public void mobile() {
		System.out.println("Mobile Login gold");
	}
	@Test
	public void API() {
		System.out.println("API Login gold");
	}
	
	@Parameters({"name"})
	@Test
	public void Gold(String name) {
		System.out.println(name);
	}



}
