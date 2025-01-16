package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUserPage;
import page.LoginPage;
import page.ManageFooterPage;
import utilities.ExcelUtilities;

public class ManageFooterTest extends Base {

	
	@Test
	public void verifyManageFooterUpdate() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageFooterPage footer =  new ManageFooterPage(driver);
		footer.manageFooterClick();
	   footer.buttonClick();
	   
	  footer.sendAddress("data value");
	  footer.sendemail("sky@gmail.com");
	  footer.sendphoneNumber("89764568");
	  footer.updateClick();
	
		
	boolean alert = 	footer.isAlertDisplayed();
	Assert.assertTrue(alert,"alert is not displayed");
	}
	
	@Test
	public void verifyUpdateButtonPresent() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageFooterPage footer =  new ManageFooterPage(driver);
		footer.manageFooterClick();
	   footer.buttonClick();
	  
	
		
	boolean update = 	footer.isUpdateButtonDisplayed();
	Assert.assertTrue(update,"alert is not displayed");
	}
}
