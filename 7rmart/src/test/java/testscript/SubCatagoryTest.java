package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.HomePage;
import page.LoginPage;
import page.SubCatagoryPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class SubCatagoryTest extends Base{
	
@Test
	public void verifySubCatagoryFunctionality() throws IOException, AWTException {
		
		 String username = ExcelUtilities.readStringData(1, 0, "LoginData");
	     String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		SubCatagoryPage subcatagory = new SubCatagoryPage(driver);
		subcatagory.SubCategoryClick();
		subcatagory.newClick();
		subcatagory.categorySelect(2);
		FakerUtility faker = new FakerUtility();
		String value = faker.generateName();
		subcatagory.SubCategoryType(value);;
		subcatagory.imagefileselect();
		subcatagory.saveClick();
		
		
	boolean alert = 	subcatagory.isAlertDisplayed();
	Assert.assertTrue(alert,"alert is not displayed");
	}
}
