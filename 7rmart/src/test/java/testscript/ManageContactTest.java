package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.AdminUserPage;
import page.LoginPage;
import page.ManageContactPage;
import page.ManageFooterPage;
import utilities.ExcelUtilities;
import utilities.FakerUtility;

public class ManageContactTest extends Base {

	
	@Test
	public void verifyManageContactUpdateTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageContactPage contact =  new ManageContactPage(driver);
		contact.manageContactClick();;
		contact.buttonClick();
		FakerUtility faker = new FakerUtility();
		int phonenumber = faker.generateRandomNumber();
				
		String email = faker.generateRandomEmail();
		String address = faker.generateAdress();
		contact.sendphoneNumber(String.valueOf(phonenumber));
		contact.sendemail(email);
		contact.sendAddress(address);
	     contact.deliveryTimeNumber("30");
	     contact.deliverychargeLimit("300");
	
		contact.updateClick();
	
		
	boolean alert = 	contact.isAlertDisplayed();
	Assert.assertTrue(alert,"alert is not displayed");
	}
	
	@Test
	public void verifyManageContactUpdateButtonTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageContactPage contact =  new ManageContactPage(driver);
		contact.manageContactClick();;
		contact.buttonClick();
			
	boolean updatebutton = 	contact.isUpdateButtonDisplayed();
	Assert.assertTrue(updatebutton,"alert is not displayed");
	}
}
