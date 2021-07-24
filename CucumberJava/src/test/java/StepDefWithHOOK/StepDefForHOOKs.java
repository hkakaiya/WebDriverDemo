package StepDefWithHOOK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class StepDefForHOOKs {

	WebDriver driver=null;
	
	@Before(order=1)
	public void browserSetUP() {
		
		System.out.println("Before Scenerio \n");
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Before(order=0)
	public void setUP2() {
		System.out.println("I am inside setup2 \n");
	}
	
	
	@After(order=0)
	public void Teardown() throws InterruptedException {
		
		System.out.println("After Scenerio \n");
		
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
	}
	
	@After(order=1)
	public void Teardown2() {
		
		System.out.println("Teardown 2 \n");
			
	}
	
	@BeforeStep
	public void beforeStepdemo() {
		
		System.out.println("before Step \n");
	}
	
	@AfterStep
	public void afterStepdemo() {
		
		System.out.println("after Step \n");
	}
	
	@Given("User is on logIn page")
	public void user_is_on_log_in_page() {
	}

	@When("User enters UserID & Password")
	public void user_enters_user_id_password() {
	}

	@And("Clicks on LogIn Button")
	public void clicks_on_log_in_button() {
	}

	@Then("User is allowed to logIn and see the HomePage")
	public void user_is_allowed_to_log_in_and_see_the_home_page() {
	}

}
