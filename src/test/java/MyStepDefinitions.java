

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import constants.EndPoint;
import domainobjects.Product;
import factory.DriverFactory;

import org.openqa.selenium.JavascriptExecutor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.CartPage;
import utils.ConfigLoader;

public class MyStepDefinitions {

	private WebDriver driver;

	@Given("I'm on cart page")
	public void i_m_on_cart_page() {
		driver = DriverFactory.getDriver();
		new CartPage(driver).load(EndPoint.CART.url);
	}

	@When("I add a {string} to the cart")
	public void i_add_a_to_the_cart(String productId) throws InterruptedException {
		new CartPage(driver).addToCart(productId);

	}

	@Then("I should see {product} {string} in the cart")
	public void i_should_see_in_the_cart(Product product, String productName) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		CartPage cartPage = new CartPage(driver);
		Assert.assertEquals(product.getQuantity(), cartPage.getProductQty());
	}
}
