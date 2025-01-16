package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base{
	
	@DataProvider(name = "credentials")
	public Object[][] testData(){
		Object data[][] = { {"admin","admin"},{"admin","hello"},{"gm","adimn"}};
		return data;
	}
	@Test(dataProvider =  "credentials",description ="check ligin with correct password ")
	public void verifyTheUserIsAbleToLoginWithCorrectUserNameAndPassword(String username, String password ) throws IOException {
		//String username = "admin";
		//String password = "admin";
		
		//String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		//String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		//login.dashboardDispalyed();
	 
	 boolean isHomePageAvailable = login.dashboardDispalyed();
	 Assert.assertTrue(isHomePageAvailable,"dashboard is not displaying");
	 
	}
	@Test
	@Parameters({"username","password"})
	public void loginTestWithIncorrectPassword(String username ,String password) throws IOException {
		//String username = ExcelUtilities.readStringData(2, 0, "LoginData");
		//String password = ExcelUtilities.readStringData(2, 1, "LoginData");
		LoginPage login = new LoginPage(driver);
	
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
	 
	 boolean isHomePageAvailable = login.isAlertDispalyed();
	 Assert.assertTrue(isHomePageAvailable,"alert is not displaying");
	 
	}
	@Test(groups = {"regression"})
	public void loginWithIncorrectPasswordAndUsername() throws IOException {
		String username = ExcelUtilities.readStringData(3, 0, "LoginData");
		String password = ExcelUtilities.readStringData(3, 1, "LoginData");
		LoginPage login = new LoginPage(driver);
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
	 
	 boolean isHomePageAvailable = login.isAlertDispalyed();
	 Assert.assertTrue(isHomePageAvailable,"alert is not displaying");
	
	 
	 
	}
}
