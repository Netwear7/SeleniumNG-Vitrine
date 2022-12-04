package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop {
    
    WebDriver driver;
  
    @FindBy(css="h3 a")
    List<WebElement> products;
    
    WebElement product;
    public String shopUrl = "https://shop.demoqa.com/shop/";
    
    
    public Shop(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
    
  
    /**
     * Clique sur un produit aléatoire.
     * @return Retourne le titre du produit.
     */
    public String ClickOnRandomProduct() {
	this.RandomProduct();
	String RandomProductTitle = product.getText();
	product.click();
	return RandomProductTitle;
    }
    
    /**
     * Génère un index permettant de choisir aléatoirement un produit dans la liste products.<br/>
     * (Affectation du choix aléatoire sur la variable product)
     */
    public void RandomProduct() {
	int rnd = new Random().nextInt(this.products.size());
	this.product = this.products.get(rnd);
    }
}
