package page;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	//locators---
@FindBy(xpath= "//input[@name ='username']") private WebElement username;
	
	@FindBy(xpath="//input[@name='password']") private WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")private WebElement button;
	@FindBy(xpath= "//p[text()='Dashboard']") private WebElement dashboard ;
	@FindBy(xpath ="//div[@class='alert alert-danger alert-dismissible']") private WebElement alert;
	//Action Method---
	
	public void  passUsername(String name) {
	username.sendKeys(name);
		
	}
	
	public void  passPassword(String password1) {
		 password.sendKeys(password1);
			
		}
	public void  clickButton() {
		//button.click();
		/*
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(button));*/
		//WaitUtility wait = new  WaitUtility();
		//wait.waitForElementToBeClickable(driver, button);
		//PageUtility page = new PageUtility();
		//page.javaSriptClick(driver, button);
		button.click();
		
		}
	
			public boolean dashboardDispalyed() {
		boolean value = dashboard.isDisplayed();
		return value;
		}
	public boolean isAlertDispalyed() {
		//WaitUtility wait = new  WaitUtility();
		//wait.waitForAlertToBeVisible(driver);
		boolean value = alert.isDisplayed();
		return value;
			
		}
}
