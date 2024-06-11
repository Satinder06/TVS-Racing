package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class raceformat {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("I am on the supercross championship page")
	public void i_am_on_the_supercross_championship_page() throws InterruptedException {
		
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"raceFormat\"]/div/div/div[2]/div/ul/li[1]/a")).click();
     
     
	}

	@When("I scroll down and use the carousel and teams functionalities")
	public void i_scroll_down_and_use_the_carousel_and_teams_functionalities() throws InterruptedException {
		
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollBy(0,700)");
	    
		Thread.sleep(2000);
		
		WebElement scroll = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[4]/div/div[2]/div/div"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(scroll, -171,0).perform();
		
		Thread.sleep(2000);
		
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,300)");
		
		driver.findElement(By.xpath("//*[@id=\"riderCarousel\"]/div[2]/div/div[2]/button[2]")).click();
		
		Thread.sleep(2000);
	    
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,2800)");
		
	Thread.sleep(2000);
		
		
		driver.close();
		
	}

	@Then("User should be able to navigate through it seamlessly and able to scroll down further")
	public void user_should_be_able_to_navigate_through_it_seamlessly_and_able_to_scroll_down_further() {
		
		System.out.println("caraousel is working successfully");
	    
		
	}
	
	@Given("I am on the dakar rally page")
	public void i_am_on_the_dakar_rally_page() throws InterruptedException {
		
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		driver.findElement(By.name("Dakar Rally")).click();
		
		}

	@When("I navigate through the page functionalities")
	public void i_navigate_through_the_page_functionalities() {
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2500)");
		
	}

	@Then("all functions shoudl work as expected")
	public void all_functions_shoudl_work_as_expected() {
	    
		driver.findElement(By.xpath("//*[@id=\"raceGalleryHighlights\"]/div[2]/div[3]/button[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"raceGalleryHighlights\"]/div[2]/div[3]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"raceGalleryHighlights\"]/div[2]/div[3]/button[3]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/h3/span")).click();
		
		driver.findElement(By.id("indian-national-rally-championship-inrc")).click();
		
		driver.close();
	}

	@Given("I am on the rally championship page")
	public void i_am_on_the_rally_championship_page() {
		driver.get("https://www.tvsmotor.com/tvsracing/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/nav/div/div[1]/button/span")).click();
		
		driver.findElement(By.name("Rally Championship (INRC)")).click();
		
		
	}

	@When("I go through the page")
	public void i_go_through_the_page() {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	    
	}

	@Then("It should work as expected")
	public void it_should_work_as_expected() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]")).click();
		
		JavascriptExecutor jt = (JavascriptExecutor) driver;
		jt.executeScript("window.scrollBy(0,2500)");
		

	}



}
