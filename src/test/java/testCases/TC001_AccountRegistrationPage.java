package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_AccountRegistrationPage extends BaseClass{
	@Test(groups= {"Master"})
	public void verify_Account_Registration() {
		logger.info("Execution started");
		try {
		
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Manage account is clicked");
		hp.clickRegister();
		logger.info("Moved to Registration page");
		RegistrationPage regPage= new RegistrationPage(driver);
		regPage.setFirstName(randomString());
		regPage.setLastName(randomString());
		regPage.setEmail(randomString()+"@gmail.com");
		regPage.setTelephone(randomNumeric());
		String Password= randomAlphaNumeric();
		regPage.setPassword(Password);
		regPage.setConfirmPwd(Password);
		regPage.clickPrivatePolicy();
		regPage.clickSubmit();
		String cnfmsg=regPage.getMessageConfirmation();
		Assert.assertEquals(cnfmsg, "Your Account Has Been Created!!");
		logger.info("Test passed");
		}
		catch(Exception e){
			logger.error("Test Failed: " + e.getMessage());
			Assert.fail("Test Failed: " + e.getMessage());
		}
		finally {
			logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}


}
