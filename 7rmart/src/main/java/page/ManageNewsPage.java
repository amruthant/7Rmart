package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

WebDriver driver;
	
	public ManageNewsPage (WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}
	//a[@onclick='click_button(1)']
	/*
	
	@FindBy(xpath= "//div[@class='row']//descendant::a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin']") private WebElement moreInfo;
	@FindBy(xpath= "//a[@class='btn btn-rounded btn-danger']") private WebElement news;
	
	@FindBy(xpath= "//textarea[@id='news']") private WebElement txtnews;
	//textarea[@id='news']
	
	@FindBy(xpath= "//button[@type='submit']") private WebElement saveButton;
	@FindBy(xpath= "//div[@class='alert alert-success alert-dismissible']") private WebElement alert;
	
	*/
	
	@FindBy(xpath="//p[text()='Manage News']")private WebElement manage ;
 	//a[@class='btn btn-rounded btn-danger']
 	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")private WebElement create ;
 	//textarea[@id='news']
 	@FindBy(xpath="//textarea[@id='news']")private WebElement news1 ;
 	//button[@type='submit']
 	@FindBy(xpath="//button[@type='submit']")private WebElement save ;
 	//div[@class='alert alert-success alert-dismissible']
 	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert;
	public void moreInfoClick() {
 		manage.click();
	}
	public void newsButtonClick() {
		create.click();
		
	}
	public void sendNews(String news) {
		news1.sendKeys(news);
	}
	public void saveButtonClick() {
		save.click();
	}
	
	public boolean isAlertDisplayed() {
		boolean value = alert.isDisplayed();
		return value;
	}
}
