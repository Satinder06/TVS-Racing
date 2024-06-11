package stepDefinitions;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TVSRegistration {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Given("User is on the contact us page")
	public void user_is_on_the_contact_us_page() throws InterruptedException {
		driver.get("https://uat-www.tvsmotor.net/tvsracing");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[6]/a")).click();
	}

	@When("User fills up the form")
	public void user_fills_up_the_form() throws InterruptedException {
		driver.findElement(By.id("firstName")).sendKeys("Automationtwo");
        driver.findElement(By.id("lastName")).sendKeys("Demotwo");
        
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Automationtvs15@yopmail.com");
        driver.findElement(By.name("contactNumber")).sendKeys("9988998898");
        
        Thread.sleep(2000);
        
        Select tsize= new Select(driver.findElement(By.name("selectedTshirtSize")));
		tsize.selectByVisibleText("S- 38");
		
		driver.findElement(By.xpath("//*[@id=\"selectedProgram\"]")).click();
		Select Programme = new Select(driver.findElement(By.name("selectedProgram")));
		Programme.selectByVisibleText("TVS Racing Training Academy");
		
		driver.findElement(By.xpath("//*[@id=\"selectedVeichleId\"]")).click();
		Select Vehicle = new Select(driver.findElement(By.id("selectedVeichleId")));
		Vehicle.selectByVisibleText("TVS Apache RR 310");
		
		
		driver.findElement(By.xpath("//*[@id=\"selectedCity\"]")).click();
		Select Country = new Select(driver.findElement(By.name("selectedCity")));
		Country.selectByVisibleText("Jaipur");
		
		driver.findElement(By.xpath("//*[@id=\"11\"]")).click();
	    
	}

	@When("click on Get started button")
	public void click_on_get_started_button() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollBy(0,600)");
		
		driver.findElement(By.xpath("//*[@id=\"submit-button\"]")).click();
		
		Thread.sleep(6000);
		
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
		
		}

	@Then("USer should navigate to the payment page and able to complete the registration for the specific program")
	public void u_ser_should_navigate_to_the_payment_page_and_able_to_complete_the_registration_for_the_specific_program() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("btn")).click();
		
		
	
	}

	@And("comes back on the home page")
	public void comes_back_on_the_home_page() throws InterruptedException {
	    
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/a")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	
	}

}
