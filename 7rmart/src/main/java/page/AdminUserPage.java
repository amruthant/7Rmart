package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AdminUserPage {

WebDriver driver;
	
	public AdminUserPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@class='nav-link']//p[contains(text(),'Admin Users')]")private WebElement adminUser ;
	
	
	@FindBy(xpath="//p[text()='Manage Users']")private WebElement manageUser ;
 
 	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") private WebElement news ;
 	
 	@FindBy(xpath="//input[@id='username']")private WebElement username ;
 	//button[@type='submit']
 	@FindBy(xpath="//input[@id='password']")private WebElement password ;  
 	//div[@class='alert alert-success alert-dismissible']
 	
 	@FindBy(xpath="//select[@id='user_type']")private WebElement dropdown ;  
 	
 	
 	
	@FindBy(xpath="//button[@name='Create']")private WebElement save ;  
 	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert;
	@FindBy(xpath="//tbody/tr[1]/td[5]/a[3]/i[1]")private WebElement delete;
	//h5[normalize-space()='Alert!']
 	
	@FindBy(xpath="//h5[normalize-space()='Alert!']") private WebElement deleteAlert;
	public void adminUserClick() {
		adminUser.click();
	}
	public void manageUserClick() {
		manageUser.click();
	}
	public void newsButtonClick() {
		news.click();
		
	}
	public void sendUsername(String name) {
		username.sendKeys(name);
	}
	
	public void sendPassword(String name) {
		password.sendKeys(name);
	}
	public void selectUserType() {
		 PageUtility pageutility = new  PageUtility();
		 pageutility.visibleText(dropdown, "Staff");
	}
	
	public void saveClick() {
		save.click();
	}
	public void deletClick() {
		delete.click();
	}
	public boolean isAlertDisplayed() {
		boolean value = alert.isDisplayed();
		return value;
	}
	
	public boolean isDeleteAlertDisplayed() {
		boolean value = deleteAlert.isDisplayed();
		return value;
	}
}
