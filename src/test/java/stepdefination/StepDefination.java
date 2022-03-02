package stepdefination;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
@BeforeSuite
@Given("Open a browser")
public void open_a_browser() {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.walmart.ca/create-account");
	
	}
 @BeforeMethod 
@Given("User must on Product Store Home page")
public void user_must_on_product_store_home_page_url() {
	
	driver.manage().window().maximize();

}

@Test(priority=1)
@When("User click on signup button")
public void user_click_on_signup_button() throws InterruptedException {
	//driver.findElement(By.linkText("Sign up")).click();
	   //Thread.sleep(3000);
}
@Test(priority=2)
@When("Signup box is displayed")
public void signup_box_is_displayed() {
	
	//boolean acutal = driver.findElement(By.cssSelector("#signInModal > div")).isDisplayed();
	//  Assert.assertEquals(true, acutal);
}
@Test(priority=3)
@Then("user enter username & password")
public void user_enter_username_password() throws InterruptedException {
	driver.findElement(By.id("firstName")).sendKeys("Chintan");
	Thread.sleep(2000);
	driver.findElement(By.id("lastName")).sendKeys("Patel");
	Thread.sleep(2000);
	driver.findElement(By.id("phoneNumber")).sendKeys("1234567890");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("chintan.448@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("patel@123");
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,350)");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='TAndC']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Create account')]")).click();
			Thread.sleep(2000);
		String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, "https://www.walmart.ca/my-account" );
		     driver.close();
}




}