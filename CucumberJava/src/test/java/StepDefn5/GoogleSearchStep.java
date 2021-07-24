package StepDefn5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchStep {

	WebDriver driver = null;
		
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Test1");
		
		String ProjectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
	}

	@And("User is on Google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Test2");
		
		driver.navigate().to("https://www.google.com");
	}

	@When("User enters the text in the search box")
	public void user_enters_the_text_in_the_search_box() throws InterruptedException {
		System.out.println("Test3");
		
		driver.findElement(By.name("q")).sendKeys("Automation by Raghav Pal");
		
		Thread.sleep(3000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Test4");
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
	}

	@Then("User should be able to see search results")
	public void user_should_be_able_to_see_search_results() throws InterruptedException {
		System.out.println("Test5");
		
		driver.getPageSource().contains("Automation Step by Step - Raghav Pal - YouTube");
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
		
	}

}
