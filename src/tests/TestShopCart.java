package tests;


import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

/* Quoi tester ? 
 * 
 * - Tester l'ajout au panier:
 * 	- ajouter 1						| Test 1 : AddSingleItemToCart
 * 	- Plusieurs articles identiques				| Test 2 : AddIdenticalItemsToCart
 * 	- Plusieurs différents articles				| Test 3 : AddDifferentItemsToCart
 * 
 * - Tester l'incrément d'ajout:
 * 	- Ajouter 1 puis 1					| Test 4 : IncrementItemToCart
 * 	- 1 puis plusieurs					| Test 5 : IncrementItemsToCart
 * 	- Autres cas :
 * 		- Add Xarticles puis retirer Xarticles=0	| Test 6 : RemoveXItemsFromCart
 * 		- Add Xarticles puis retirer X+1articles=-1	| Test 7 : RemoveXItemsPlusOneItemsFromCart
 * 		- Add Xarticles puis retirer X-1articles=1	| Test 8 : RemoveXItemsMinusOneItemsFromCart
 * 
 * - Tester le retrait d'articles:
 * 	- Retirer 1						| Test 9 : RemoveItemFromCart
 * 	- Retirer plusieurs					| Test 10: RemoveItemsFromCart
 * 
 * - Tester l'incrément du prix du panier :
 * 	- 1 article dans le panier				| Test 11: IncrementTotalPrice
 * 	- De plusieurs fois le même article			| Test 12: IncrementTotalPriceWithIdenticalItems
 * 	- De plusieurs articles diff= prix total du panier	| Test 13: IncrementTotalPriceWithDifferentItems
 * 
 * - Tester la décrementation du prix du panier :
 * 	- 1 article dans le panier				| Test 11: DecrementTotalPrice
 * 	- De plusieurs fois le même article			| Test 12: DecrementTotalPriceWithIdenticalItems
 * 	- De plusieurs articles diff= prix total du panier	| Test 13: DecrementTotalPriceWithDifferentItems
 */

public class TestShopCart {
	
    WebDriver driver;
 
    @Test(groups = { "functest"})
    public void AddSingleItemToCart() {
    	  
    }
    
    
    
    //---------------------------------------------------\\
    //---------------------------------------------------\\
    @BeforeMethod
    public void beforeMethod() {
	driver = WebDriverManager.chromedriver().create(); 
    }
    
    @AfterMethod
    public void afterMethod() {
	driver.quit();
    }

}
