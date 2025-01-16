package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUserPage;
import page.LoginPage;
import page.ManageFooterPage;
import page.ManageProductPage;
import utilities.ExcelUtilities;

public class ManageProductTest extends Base {

	
	@Test
	public void adminUserTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageProductPage product =  new ManageProductPage(driver);
	product.manageProductClick();
	product.deleteClick();
	
	  
	
		
	boolean update = 	product.isAlertDisplayed();
	Assert.assertTrue(update,"alert is not displayed");
	}
}
