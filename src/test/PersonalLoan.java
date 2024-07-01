package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Test
	public void web() {
		System.out.println("Web Login personal");
	}
	
	@AfterSuite
	public void demo() {
		System.out.println("I will execute last");
	}
	@Test(groups= {"smoke"})
	public void mobile() {
		System.out.println("Mobile Login personal");
	}
	
	
	@Test(dataProvider="getData")
	public void API(String name, String pswd) {
		//System.out.println("API Login personal");
		System.out.println(name);
		System.out.println(pswd);
		System.out.println();
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "First Set Username";
		data[0][1] = "First Set password";
		
		data[1][0] = "Second Set Username";
		data[1][1] = "Second Set password";
		
		data[2][0] = "Third Set Username";
		data[2][1] = "Third Set password";
		
		return data;
	}
 }
