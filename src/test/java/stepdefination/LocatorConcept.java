package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {
	
	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://demo.wpeverest.com/user-registration/restricted-registration-form/");
		
		// Handle drop box
		Select S1 = new Select(driver.findElement(By.id("country_1629717450")));
		S1.selectByVisibleText("India");
		
		

}
	}
