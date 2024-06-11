package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class homepagefunctions {
	
	WebDriver driver = new ChromeDriver();
	
	
	@Given("I am on the tvs racing site")
	public void i_am_on_the_tvs_racing_site() {
		
		driver.get("https://www.tvsmotor.com/tvsracing");
		driver.manage().window().maximize();
	    
	}

	@When("I scroll down and check the functionalities")
	public void i_scroll_down_and_check_the_functionalities() throws InterruptedException {

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)");
		
		Thread.sleep(2000);
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"scrollPoint\"]/div[2]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(scroll, -400,0).perform();
		
		
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,1000)");
		
}

	@And("User clicks on the upcoming races dropdown")
	public void user_clicks_on_the_upcoming_races_dropdown() throws InterruptedException {
		
				Select upcoming = new Select(driver.findElement(By.xpath("//*[@id=\"monthDropdown\"]")));
				upcoming.selectByVisibleText("July");
	
	    
	}

	@Then("user should be able to navigate through it seamlessly")
	public void user_should_be_able_to_navigate_through_it_seamlessly() {
		
		System.out.println("user is able to see the upcoming races");
		
	
		driver.close();
	}

}
