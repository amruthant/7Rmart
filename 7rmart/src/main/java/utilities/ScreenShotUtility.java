package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotUtility {

	public void getScreenShot(WebDriver driver, String failedTestCase) throws IOException {
		TakesScreenshot scrShot = (TakesScreenshot) driver;//TakeScreenshot--interface //typecasting
		File screenShot = scrShot.getScreenshotAs(OutputType.FILE);//capture screnshot the method to capture screenshot of the current browser window and save as image file
		String timeStamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());//date --class to get current date and time 
	
		File f1 = new File(System.getProperty("user.dir") + "//OutputScreenShot");
		if (!f1.exists()) {
			f1.mkdirs();//make directy
		}
		String destination = System.getProperty("user.dir") + "//outputScreenShot//" + failedTestCase + timeStamp
				+ ".png";
		File finalDestination = new File(destination);
		FileHandler.copy(screenShot, finalDestination);
	}
}
