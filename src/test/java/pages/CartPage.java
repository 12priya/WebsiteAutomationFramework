package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {

	@FindBy(xpath = "//input[@data-locator=\"code-cart\"]")
	private WebElement productenter;

	@FindBy(xpath = "//button[@data-locator=\"add-to-cart-button-cart\"]")
	private WebElement addtoCartBtn;
	
	@FindBy(xpath="//span[@data-locator=\"sku-number\"]")
	private WebElement productSKUFld;
	
	@FindBy(xpath="//input[@data-locator=\"input-sku-tiles-update-quantity\"]")
	private WebElement ProductQuantityFld;
	
	public void addToCart(String productId) {
		wait.until(ExpectedConditions.elementToBeClickable(productenter)).sendKeys(productId);
		wait.until(ExpectedConditions.elementToBeClickable(addtoCartBtn)).click();

	}
	
	public String getProductId() {
		return wait.until(ExpectedConditions.visibilityOf(productSKUFld)).getText();
	}
	
	public String getProductQty() {
		return wait.until(ExpectedConditions.visibilityOf(ProductQuantityFld)).getAttribute("value");
	}
	

	public CartPage(WebDriver driver) {
		super(driver);
	}

}
