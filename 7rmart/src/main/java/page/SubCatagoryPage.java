package page;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.FileUploadUtility;
import utilities.PageUtility;






public class SubCatagoryPage {

WebDriver driver;
	
	public SubCatagoryPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	//locators---

	
	@FindBy(xpath="(//i[@class='fas fa-arrow-circle-right']//parent::a[@class='small-box-footer'])[4]")private WebElement subcategoryclick;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement newclick;
	@FindBy(xpath="//select[@id='cat_id']")private WebElement categoryselect;
	@FindBy(xpath="//input[@id='subcategory']")private WebElement Subcategorytype;
	@FindBy(xpath="//input[@id='main_img']")private WebElement imagefileselect;
	@FindBy(xpath="//button[@class='btn btn-danger']")private WebElement saveclick;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")private WebElement isalertdisplayed;

	
	public void SubCategoryClick() {
		
		subcategoryclick.click();
	}
	
	public void newClick() {
		
		newclick.click();
	}
	
	public void categorySelect(int value) {
		
		PageUtility page = new PageUtility();
		page.selectUsingIndex(categoryselect, value);
	}
	
	public void SubCategoryType(String value) {
		
		Subcategorytype.sendKeys(value); 
	}
	
	public void imagefileselect() throws AWTException{
		
		PageUtility page1 = new PageUtility();
		 page1.javaSriptClick(driver, imagefileselect);	
		 FileUploadUtility upload = new FileUploadUtility();
		  upload.RobotClass();
	}
	
	public void saveClick() {
		
		saveclick.click();
	}
	
	public Boolean isAlertDisplayed() {
		
		boolean value = isalertdisplayed.isDisplayed();
		return value;
	

	}
}
	
		

