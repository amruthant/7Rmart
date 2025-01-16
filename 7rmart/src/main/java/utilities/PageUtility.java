package utilities;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {

	public void javaSriptClick(WebDriver  driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",element);
	}
	
	public void scrollBy(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}
	
	
	public void visibleText(WebElement  element ,String value) {
	
       Select obj = new Select(element);
		obj.selectByVisibleText(value);
		
		
		
	}
	
	public void selectUsingIndex(WebElement  element,int value ) {
		
	       Select obj = new Select(element);
		
			obj.selectByIndex(value);
			
			
		}
	
	public void selectByValue(WebElement  element ,String value) {
		
	       Select obj = new Select(element);
		
			obj.selectByValue(value);
			
		}
	
	//action , rightclick, double click//drag and drop
	
	
	public void dragAndDrop( WebDriver driver ,WebElement element,WebElement element2) {
		
		Actions actions =new Actions(driver);
		
		
		actions.dragAndDrop(element, element2).build().perform();
		
	}

	public void moveToElement(WebDriver driver,WebElement element) {
		
		Actions actions =new Actions(driver);
		actions.moveToElement(element).build().perform();//hoveover
		
		
	}
public void doubleClick(WebDriver driver,WebElement element) {
		
		Actions actions =new Actions(driver);
		actions.doubleClick(element).build().perform();
		
		
	}
public void rightClick(WebDriver driver,WebElement element) {
	
	Actions actions =new Actions(driver);
	actions.contextClick(element).build().perform();
	
	
}
	
	
	
	public String generateCurrentDateAndTime() {
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
		return formater.format(date);
	}
}
