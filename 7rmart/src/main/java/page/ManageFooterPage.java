package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageFooterPage {

WebDriver driver;
	
	public ManageFooterPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='active nav-link']//p[contains(text(),'Manage Footer Text')]")private WebElement manageFooter ;
	
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/a[1]/i[1]")private WebElement button ;
 
 	@FindBy(xpath="//textarea[@id='content']") private WebElement address ;
 	
 	@FindBy(xpath="//input[@id='email']")private WebElement email ;
 	//button[@type='submit']
 	@FindBy(xpath="//input[@id='password']")private WebElement password ;  
 	//div[@class='alert alert-success alert-dismissible']
 	
 	@FindBy(xpath="//input[@id='phone']")private WebElement phoneNumber ;  
 	
 	
	@FindBy(xpath="//button[@name='Update']")private WebElement update ;  
 	@FindBy(xpath="//h5[text()=' Alert!']") private WebElement alert;
 	
 	public void manageFooterClick() {
 		manageFooter.click();
	}
	public void buttonClick() {
		button.click();
	}

		
	
	public void sendAddress(String value) {
		address.sendKeys(value);
	}
	
	public void sendemail(String email1) {
		email.sendKeys(email1);
	}
	
	public void sendphoneNumber(String number) {
		phoneNumber.sendKeys(number);
	}
	
	public void updateClick() {
		update.click();
	}
	
	public boolean isUpdateButtonDisplayed() {
		boolean value = update.isDisplayed();
				return value;
	}
	public boolean isAlertDisplayed() {
		boolean value = alert.isDisplayed();
		return value;
	}
	
}
