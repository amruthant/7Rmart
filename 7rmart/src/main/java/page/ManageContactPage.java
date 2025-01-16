package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {

WebDriver driver;
	
	public ManageContactPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//p[text()='Manage Contact']")private WebElement manageContact ;
	
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1']")private WebElement button ;
 
 	@FindBy(xpath="//textarea[@id='content'][1]") private WebElement address ;
 	
 	@FindBy(xpath="//input[@id='email']")private WebElement email ;
 	//button[@type='submit']
 	@FindBy(xpath="//textarea[@name='del_time']")private WebElement deliveryTime ;  
 	//div[@class='alert alert-success alert-dismissible']
 	
 	@FindBy(xpath="//input[@id='phone']")private WebElement phoneNumber ;  
 	
 	@FindBy(xpath="//input[@id='del_limit']") private WebElement deliveryChargeLimit;
 	
	@FindBy(xpath="//button[@name='Update']")private WebElement update ;
	
	@FindBy(xpath="//h5[normalize-space()='Alert!']")private WebElement alert ;
 	
 	public void manageContactClick() {
 		manageContact.click();
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
	
	
	public void deliveryTimeNumber(String time) {
	deliveryTime.sendKeys(time);
	}
	
	public void deliverychargeLimit(String limit) {
		deliveryChargeLimit.sendKeys(limit);
		}
	public void updateClick() {
		PageUtility C = new PageUtility();
		C.javaSriptClick(driver, update);
		
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
