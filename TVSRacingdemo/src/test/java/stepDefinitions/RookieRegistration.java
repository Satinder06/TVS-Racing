package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RookieRegistration {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on the TVS Racing contact us page")
	public void i_am_on_the_tvs_racing_contact_us_page() throws InterruptedException {
		
		driver.get("https://uat-www.tvsmotor.net/tvsracing");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[6]/a")).click();
	    
	}

	@When("I fill up the entire form")
	public void i_fill_up_the_entire_form() throws InterruptedException {
	    
		driver.findElement(By.id("firstName")).sendKeys("Automationrookie");
        driver.findElement(By.id("lastName")).sendKeys("Registration");
        
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Automationrookie11@yopmail.com");
        driver.findElement(By.name("contactNumber")).sendKeys("9988998898");
        
        Thread.sleep(2000);
        
        Select tsize= new Select(driver.findElement(By.name("selectedTshirtSize")));
		tsize.selectByVisibleText("S- 38");
		
		driver.findElement(By.xpath("//*[@id=\"selectedProgram\"]")).click();
		Select Programme = new Select(driver.findElement(By.name("selectedProgram")));
		Programme.selectByVisibleText("TVS Racing Rookie Training and Selection");
		
		driver.findElement(By.xpath("//*[@id=\"selectedCity\"]")).click();
		Select Country = new Select(driver.findElement(By.name("selectedCity")));
		Country.selectByVisibleText("Chennai");
		
		driver.findElement(By.xpath("//*[@id=\"11\"]")).click();
	}

	@When("click on the get started button")
	public void click_on_the_get_started_button() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By
				.xpath("//*[@id=\"submit-button\"]")).click();
		
		Thread.sleep(6000);
	}

	@Then("I am able to navigate to payment gateway and complete the registration process")
	public void i_am_able_to_navigate_to_payment_gateway_and_complete_the_registration_process() throws InterruptedException {
	    
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("4012000033330026");
		driver.findElement(By.name("expiryMonthCreditCard")).click();
		Select Expmonth = new Select(driver.findElement(By.name("expiryMonthCreditCard")));
		Expmonth.selectByVisibleText("Oct (10)");
		
		driver.findElement(By.id("expiryYearCreditCard")).click();
		Select expyear= new Select(driver.findElement(By.id("expiryYearCreditCard")));
		expyear.selectByVisibleText("2026");
		
		driver.findElement(By.name("CVVNumberCreditCard")).sendKeys("837");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"SubmitBillShip\"]/span")).click();
		
        Thread.sleep(1000);
		
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/a")).click();
		
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
