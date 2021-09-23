package Comcast.orgcontact_Test;

import org.testng.annotations.Test;

public class Contact_orgTest {
	@Test(groups= "SmokeTest")
	public void createContactTest() {
		System.out.println("execute createContactTest");
	}
	@Test(groups= "RegressionTest")
	public void createConwithOrgTest() {
		System.out.println("execute createContactWithOrg");
	}

	@Test(groups= "Regression Test")
	public void deleteConTest() {
		System.out.println("execute deleteContactTest");
	}

}
