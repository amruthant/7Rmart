package page;

import java.awt.Button;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	//locators---
@FindBy(xpath= "//img[@class='img-circle']") private WebElement admin; 
	
	@FindBy(xpath="//a[@class='dropdown-item'][normalize-space()='Logout']") private WebElement logout;
	
	@FindBy(xpath= "//button[@type='submit']") private WebElement signup;

	//Action Method---
	
	public void  adminClick() {
	admin.click();;
		
	}
	
	
	public void  logout() {
		
		logout.click();
		
		}
	
		public boolean isSignupDisplayed() {
			boolean value =signup.isDisplayed();
			return value;
		}
			
		
}
