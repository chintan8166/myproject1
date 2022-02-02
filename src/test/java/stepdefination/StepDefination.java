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
	driver.get("https://www.demoblaze.com/");
	
	}
 @BeforeMethod 
@Given("User must on Product Store Home page")
public void user_must_on_product_store_home_page_url() {
	
	driver.manage().window().maximize();

}

@Test(priority=1)
@When("User click on signup button")
public void user_click_on_signup_button() throws InterruptedException {
	driver.findElement(By.linkText("Sign up")).click();
	   Thread.sleep(3000);
}
@Test(priority=2)
@When("Signup box is displayed")
public void signup_box_is_displayed() {
	
	boolean acutal = driver.findElement(By.cssSelector("#signInModal > div")).isDisplayed();
	  Assert.assertEquals(true, acutal);
}
@Test(priority=3)
@Then("user enter username & password")
public void user_enter_username_password() throws InterruptedException {
	  Thread.sleep(2000);
	   driver.findElement(By.id("sign-username")).sendKeys("c1000077005541");
	   driver.findElement(By.id("sign-password")).sendKeys("password");
	 
	   WebElement e1=	driver.findElement(By.xpath("//button[@class='btn btn-primary' and contains(@onclick,'register()')]"));
		 e1.click();
}
@Test(priority=4)
@When("user click on Sign Up")
public void user_click_on_sign_up() throws InterruptedException, AWTException {
	
}
@Test(priority=5)
@Then("user should get successful message")
public void user_should_get_successful_message() throws InterruptedException, AWTException {
	Thread.sleep(2000);
 	Robot robot = new Robot();
 	robot.keyPress(KeyEvent.VK_ENTER);

}
@Test(priority=6)
@Given("click on log in button")
public void click_on_log_in_button() throws InterruptedException {
	Thread.sleep(3000);
 	driver.findElement(By.id("login2")).click();
 	
}
@Test(priority=7)
@Given("enter username & password")
public void enter_username_password() throws InterruptedException {
	  driver.findElement(By.id("loginusername")).sendKeys("chintan123");
	 	 Thread.sleep(4000);
	 	   driver.findElement(By.id("loginpassword")).sendKeys("password");
}
@Test(priority=8)
@Then("click on log in")
public void click_on_log_in() throws InterruptedException {
	Thread.sleep(5000);
 	//sign in click event
 			WebElement sign = driver.findElement(By.xpath("//button[@class='btn btn-primary' and contains(@onclick,'logIn()')]"));
 			sign.click();
}
@Test(priority=9)
@Given("click on one product")
public void click_on_one_product() throws InterruptedException {
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,850)");
		Thread.sleep(2000);
	
			driver.findElement(By.partialLinkText("Sony vaio i5")).click();
}
@Test(priority=10)
@Given("add to cart")
public void add_to_cart() throws InterruptedException, AWTException {
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Add to cart")).click();
	Thread.sleep(2000);
	Robot r2 = new Robot();
 	r2.keyPress(KeyEvent.VK_ENTER);
		
}
@Test(priority=11)
@Then("go to cart")
public void go_to_cart() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.id("cartur")).click();
	 	
}
@Test(priority=12)
@Then("confirm product is added")
public void confirm_product_is_added() throws AWTException, InterruptedException {
	Thread.sleep(2000);
	String ac= driver.findElement(By.id("totalp")).getText();
	
	  System.out.println("you total is: $" +ac);
	

	  if(ac=="0") 
	  {
		System.out.println("not product is added into cart");  
		  
	  }
	  else
	  {
		  System.out.println("product is added into cart");  
	  }
	
}

}