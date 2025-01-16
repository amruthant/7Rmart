package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	
	WebDriver driver;
	public ManageProductPage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product'][normalize-space()='More info']")private WebElement manageProduct;
 	//a[@class='btn btn-rounded btn-danger']
 	@FindBy(xpath="//a[normalize-space()='29']")private WebElement pageination ;
 	//textarea[@id='news']
 	@FindBy(xpath="//tbody/tr[4]/td[9]/a[2]")private WebElement delete ;
 	//button[@type='submit']
 
 	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") private WebElement alert;
 	
	public void manageProductClick() {
		manageProduct.click();
	}
	public void deleteClick() {
		delete.click();
		driver.switchTo().alert().accept();	
	}

	
	public boolean isAlertDisplayed() {
		boolean value = alert.isDisplayed();
		return value;
	}
}
