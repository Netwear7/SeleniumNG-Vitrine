package tests;


import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestShopCart {
	
    WebDriver driver;
 
    @Test(groups = { "functest"})
    public void AddOneProductToCart() {
    	  
    }
    
    
    @BeforeMethod
    public void beforeMethod() {
	driver = WebDriverManager.chromedriver().create(); 
    }
    
    @AfterMethod
    public void afterMethod() {
	driver.quit();
    }

}
