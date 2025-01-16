package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUserPage;
import page.HomePage;
import page.LoginPage;
import page.ManageNewsPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class HomePageTest extends Base{
	@Test
	public void verifyLogoutFunctionality() throws IOException {
		
		 String username = ExcelUtilities.readStringData(1, 0, "LoginData");
	     String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		HomePage home = new HomePage(driver);
		
	home.adminClick();
	home.logout();
		
	boolean signup = 	home.isSignupDisplayed();
	Assert.assertTrue(signup,"Signup is not displayed");
	}
}
