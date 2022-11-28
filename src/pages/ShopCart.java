package pages;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCart {
    
    WebDriver driver;

    
    public ShopCart(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }

}
