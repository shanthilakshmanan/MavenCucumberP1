package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("We shud be in Login Page")
	public void we_shud_be_in_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\chromedriver_88\\chromedriver.exe");
		//Start a new instance of Chrome Driver
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}

	@When("Enter valid name")
	public void enter_valid_name() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		Thread.sleep(2000);
	}
	
	@When("Enter valid password")
	public void enter_valid_password() throws InterruptedException {
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		Thread.sleep(2000);
	}
	
	@When("click on login button when valid")
	public void click_on_login_button_when_valid() throws InterruptedException {
		driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
	}
	@Then("Login Should be Success")
	public void login_should_be_success() throws InterruptedException {
		String expected =driver.findElement(By.id("welcome")).getText();
		String actual="Welcome Paul";
		Assert.assertEquals(expected, actual);
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.close();
	}

	
	//Invalid

	@Given("We shud be in Login Page1")
	public void we_shud_be_in_login_page1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Shanthi_bkp\\CRD_Project\\Study Materials\\ManipalPro\\chromedriver_88\\chromedriver.exe");
		//Start a new instance of Chrome Driver
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
	}

	@When("Enter Invalid name")
	public void enter_invalid_name() throws InterruptedException {
		driver.findElement(By.id("txtUsername")).sendKeys("shanthi");
		Thread.sleep(2000);
	}
	
	@When("Enter Invalid pwd")
	public void enter_invalid_pwd() throws InterruptedException {
		driver.findElement(By.id("txtPassword")).sendKeys("pwd");
		Thread.sleep(2000);
	}

	@When("Click on Login button when invalid")
	public void click_on_login_button_when_invalid() throws InterruptedException {
	    driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(3000);
	}
	
	@Then("Login fails")
	public void login_fails() throws InterruptedException {
	    String error=driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		String actualError = "Invalid credentials";
		Assert.assertEquals(error, actualError);
		Thread.sleep(3000);
		driver.close();
		
	}

	
}
