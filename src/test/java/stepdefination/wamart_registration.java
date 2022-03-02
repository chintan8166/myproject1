package stepdefination;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class wamart_registration {

	WebDriver driver;
	@BeforeSuite
	@BeforeMethod
	@Given("open walmart website")
	public void open_walmart_website() {

		
		
		
		
	}
@Test
	@Given("enter details")
	public void enter_details() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.walmart.ca/create-account");
		driver.manage().window().maximize();
		
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
		//driver.findElement(By.xpath("//button[contains(text(),'Create account')]")).click();
	//	Thread.sleep(2000);
	//	String URL = driver.getCurrentUrl();
		//Assert.assertEquals(URL, "https://www.walmart.ca/my-account" );
	    // driver.close();
		
	}

	@When("click on term and condition")
	public void click_on_term_and_condition() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on create button")
	public void click_on_create_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	}
