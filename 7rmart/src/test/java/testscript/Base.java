package testscript;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenShotUtility;




public class Base {
 public WebDriver driver;
 public ScreenShotUtility scrshot;
 
 @BeforeMethod(alwaysRun = true)
@Parameters("browser")
	public void instalizeBrowser(String browser) throws Exception {
		//driver = new ChromeDriver();
		
	 
	 if(browser.equalsIgnoreCase("chrome"))
	 {
		 driver = new ChromeDriver();
	 }
	 else if(browser.equalsIgnoreCase("edge")) {
		 driver = new EdgeDriver();
	 }
	 else if(browser.equalsIgnoreCase("firefox")) {
		 driver = new FirefoxDriver();
	 }
	 
	 else {
		 throw new Exception("invalid browser");
	 }
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
	}
	
	
 @AfterMethod(alwaysRun = true)
 public void browserQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			scrshot = new ScreenShotUtility();
			scrshot.getScreenShot(driver, iTestResult.getName());
		}

		// driver.quit();
	}
}
