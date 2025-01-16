package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUserPage;
import page.LoginPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;




public class AdminUserTest extends Base{
	@Test(retryAnalyzer = retry.Retry.class,description ="test case used for adding user")
	public void verifyUserCreateTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		AdminUserPage admin = new AdminUserPage(driver);
		
	admin.adminUserClick();
	admin.manageUserClick();
	admin.newsButtonClick();
	FakerUtility fakerutility = new FakerUtility();
	String adminUser = fakerutility.generateName();
	String password1 = fakerutility.generatePassword();
	admin.sendUsername(adminUser);
	admin.sendPassword(password1);
	admin.selectUserType();
	admin.saveClick();
	
		
	boolean alert = 	admin.isAlertDisplayed();
	Assert.assertTrue(alert,"ALERT IS NOT DISPLAYED");
	
	}
	@Test
	public void verifyUserDeleteTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		AdminUserPage admin = new AdminUserPage(driver);
		
	admin.adminUserClick();
	admin.manageUserClick();
	admin.deletClick();
     driver.switchTo().alert().accept();
		
	boolean alert = 	admin.isDeleteAlertDisplayed();
	Assert.assertTrue(alert,"Alert is not displayed");
	}
}
