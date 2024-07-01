package test;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test
	public void web() {
		System.out.println("Web Login Car");
		Assert.assertTrue(false);
	}
	@Test(groups= {"smoke"})
	public void webmobile() {
		System.out.println("Mobile Login Car");
		Assert.assertTrue(false);
	}
	@Test
	public void webAPI() {
		System.out.println("API Login Car");
	}

	@Parameters({"url"})
	@Test
	public void car(String urlname) {
		System.out.println("CAR");
		System.out.println(urlname);
	}
}
