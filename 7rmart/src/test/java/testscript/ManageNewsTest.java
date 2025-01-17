package testscript;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Test;

import page.LoginPage;
import page.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageNewsTest extends Base {

	@Test(groups = {"regression"})
	public void newsTest() throws IOException {
		
		String username = ExcelUtilities.readStringData(1, 0, "LoginData");
		String password = ExcelUtilities.readStringData(1, 1, "LoginData");
		String news = "R Ashwin retires: Sunil Gavaskar criticises timing of spinner's unforeseen call.\r\n"
				+ "Zomato's reply to techie who accused it of selling Rs 10 water bottles for Rs 100 ";
		LoginPage login = new LoginPage(driver);
	
		login.passUsername(username);
		login.passPassword(password);
		login.clickButton();
		
		ManageNewsPage  newspage = new ManageNewsPage(driver);
		newspage.moreInfoClick();
		newspage.newsButtonClick();
		
		
		newspage.sendNews(news);
		newspage.saveButtonClick();
	boolean alert = 	newspage.isAlertDisplayed();
	Assert.assertTrue(alert,"alert is not displayed");
	}
	
	
}
