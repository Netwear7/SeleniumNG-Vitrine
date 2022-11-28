package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop {
    
    WebDriver driver;
    String shopUrl = "https://shop.demoqa.com/shop/";
    
    @FindBy(xpath="//div[contains(@class, 'noo-product-item one')]")
    List<WebElement> article;
  
    
    public Shop(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
    
    
   /*
    public ClickOnRandomProduct() {
	return void;
    }
    */
}
