package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Kidzaniapage {

	WebDriver driver = new ChromeDriver();
	
	@Given("I am on Kidzania page")
	public void i_am_on_kidzania_page() throws InterruptedException {
		
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[4]/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"bannerbtnscroll\"]/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"Assembly\"]/span")).click();
		
		}

	@When("I navigate through the page")
	public void i_navigate_through_the_page() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1900)");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"inmrc\"]/div[3]/div/button")).click();
	    
	}

	@Then("I will be able to use its functionalities")
	public void i_will_be_able_to_use_its_functionalities() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		driver.close();
	    
	}

}
