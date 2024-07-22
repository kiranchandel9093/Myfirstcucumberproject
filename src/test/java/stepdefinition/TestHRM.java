package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.I;

public class TestHRM implements I{	
	WebDriver driver;	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
	@Given("^Enter url$")
	public void Enter_url() throws InterruptedException {
	   driver.get(baseurl);
	   driver.manage().window().maximize();
	   Thread.sleep(3000);
	}
	@Then("^Enter (.*) and (.*)$")
	public void enter_Username_and_Password(String Username , String Password) throws InterruptedException {
	    
		driver.findElement(name).sendKeys(Username);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(buttonclick).click();		
		Thread.sleep(3000);		
	}
	@After
	public void closepage() {
		driver.close();
	}
	
}
