package Comcast.Contact_Test;

import org.testng.annotations.Test;

public class contact_Test {
	@Test(groups= "SmokeTest")
	public void creContactwithOrgTest() {
		System.out.println("execute createContactWithOrg");
		  String BROWSER = System.getProperty("chrome");
		  String ENV = System.getProperty("localhost:8888");
		  System.out.println("======BROWSER=====> "+BROWSER+"");
		  System.out.println("======url====>" +ENV+"");
	}

	@Test(groups= "RegressionTest")
	public void delContactTest() {
		System.out.println("execute deleteContaTest");
	}
	@Test(groups= "RegressionTest")
	public void delactContactTest() {
		System.out.println("execute delactContactTest");
	}
	@Test(groups= "RegressionTest")
	public void delactContTest() {
		System.out.println("execute delactContTest");




}

}
