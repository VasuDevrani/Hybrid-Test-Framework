package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001AccountRegistrationTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void verify_account_registration()
	{
		logger.info("Starting TC001_AccountRegistrationTest");
		try {
			HomePage hp=new HomePage(driver);
			hp.clickMyAccount();
			logger.info("Clicked on MyAccount Link");

			hp.clickRegister();
			logger.info("Clicked on Register Link");

			AccountRegistrationPage registerPage=new AccountRegistrationPage(driver);

			logger.info("Providing customer details");
			registerPage.setFirstName(randomeString().toUpperCase());
			registerPage.setLastName(randomeString().toUpperCase());
			registerPage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
			registerPage.setTelephone(randomNumber());

			String password= randomAlphaNumeric();

			registerPage.setPassword(password);
			registerPage.setConfirmPassword(password);

			registerPage.setPrivacyPolicy();
			registerPage.clickContinue();

			logger.info("Validating expected message");

			String confirmMsg = registerPage.getConfirmationMsg();
			Assert.assertEquals(confirmMsg, "Your Account Has Been Created!", "Confirmation message mismatch");

			logger.info("Test passed");
		} 
		catch (Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		} 
		finally {
			logger.info("Finished TC001_AccountRegistrationTest");
		}
	
	}
	
	
	
	
}
