package utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import constants.Contants;


public class FileUploadUtility {

	
	
	
	public void  uploadUsingSendKeys(WebElement element, WebElement element2,String path) {
		
	element.sendKeys(path);
	element2.click();
	}
	
public void  RobotClass() throws AWTException {
		String path = Contants.TESTDATAIMAGE;
	      StringSelection select = new StringSelection(path);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select,null);
		 Robot r =new Robot();
		 r.delay(2500);
		 r.keyPress(KeyEvent.VK_CONTROL);
		 r.keyPress(KeyEvent.VK_V);
		 r.keyRelease(KeyEvent.VK_CONTROL);
		 r.keyRelease(KeyEvent.VK_V);
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
	}
}
