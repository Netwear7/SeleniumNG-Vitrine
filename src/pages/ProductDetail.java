package pages;

//import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductDetail {
    
    WebDriver driver;
    
    @FindBy(id="pa_size")
    WebElement size;
    
    @FindBy(id="pa_color")
    WebElement color;
    
    @FindBy(name="quantity")
    WebElement quantity;
    
    @FindBy(css="single_add_to_cart_button")
    WebElement btnAddCart;
    
    public String getProductTitle() {
	return "S";
    }
    
    public ProductDetail(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
    }
    
    
    /**
     * Choisit la taille du produit aléatoirement.
     * @return Retourne la valeur Size de l'élément selectionné
     */
    public String chooseRandomSize() {
	Select sSize = new Select(this.size);
	sSize.selectByIndex(this.getRandomOfValue(sSize.getOptions().size()));
	return sSize.getFirstSelectedOption().getText();
    }
    
    /**
     * Choisit la couleur du produit aléatoirement.
     * @return Retourne la valeur Color de l'élément selectionné
     */
    public String chooseRandomColor() {
	Select sColor = new Select(this.color);
	sColor.selectByIndex(this.getRandomOfValue(sColor.getOptions().size()));
	return sColor.getFirstSelectedOption().getText();
	
    }
    
    public void randomChooseQuantity() {
	
    }
    
    public void ClickOnBtnAddCart() {
	
    }
    
    public int getRandomOfValue(int size) {
	int rnd = new Random().nextInt(1, size);
	return rnd;
    }


}
