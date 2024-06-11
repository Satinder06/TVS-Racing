package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class programs {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Given("user is on the tvs training academy program")
	public void user_is_on_the_tvs_training_academy_program() throws InterruptedException {
	    
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"racProgrammes\"]/ul/li[1]/a")).click();
	}

	@When("user go through the page")
	public void user_go_through_the_page() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[2]/button[2]/i")).click();
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1300)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,1900)");
		
	    
	}

	@Then("it should work as expected")
	public void it_should_work_as_expected() throws InterruptedException {
		
        
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[2]/div[2]/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[2]/div[2]/div[3]/button[3]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@Given("user is on the ARE program")
	public void user_is_on_the_are_program() throws InterruptedException {
		
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"racProgrammes\"]/ul/li[2]/a")).click();
	}

	@When("user navigates through the page")
	public void user_navigates_through_the_page() throws InterruptedException {
		
		Thread.sleep(2000);
	    
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1800)");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]/i")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div[2]/div/div[2]/button[2]")).click();
		
		
	}

	@Then("all the page funtionalities should work as expected")
	public void all_the_page_funtionalities_should_work_as_expected() throws InterruptedException {
		
        Thread.sleep(2000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1800)");
		
		Thread.sleep(2000);
	    
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[10]/div/div/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

	@Given("user is on the Rookie program")
	public void user_is_on_the_rookie_program() throws InterruptedException {
		
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"racProgrammes\"]/ul/li[3]/a")).click();
	    
	}

	@When("user navigates through the rookie page")
	public void user_navigates_through_the_rookie_page() {
	    
	}

	@Then("all the page funtionalities of rookie should work as expected")
	public void all_the_page_funtionalities_of_rookie_should_work_as_expected() {
	   
	}

	@Given("user is on the women program")
	public void user_is_on_the_women_program() throws InterruptedException {
	   
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/div/div[1]/button[2]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"racProgrammes\"]/ul/li[4]/a")).click();
	}

	@When("user navigates through the women program page")
	public void user_navigates_through_the_women_program_page() {
	    
	}

	@Then("all the page funtionalities of women program should work as expected")
	public void all_the_page_funtionalities_of_women_program_should_work_as_expected() {
	   
	}


}
