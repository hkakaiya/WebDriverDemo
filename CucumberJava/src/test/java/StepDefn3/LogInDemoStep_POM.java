package StepDefn3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LogInPage;
import io.cucumber.java.en.*;

public class LogInDemoStep_POM {

	WebDriver driver = null;
	LogInPage login;
	
	@Given("browser is already open by User")
	public void browser_is_already_open_by_user() {
		
		System.out.println("POM - Test1");
		
		String ProjectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver",ProjectPath+"/src/test/resources/Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("User is already at log-in page")
	public void user_is_already_at_log_in_page() {
		System.out.println("Test2");
		
		driver.navigate().to("https://example.testproject.io/web/");

	}

	@When("^User provides (.*) and (.*)$")
	public void user_provides_username_and_password(String username, String password) throws InterruptedException {
		System.out.println("Test3");
		
		login = new LogInPage(driver);
		
        login.enenterUsername(username);
        login.enenterPassword(password);
		
		Thread.sleep(3000);	

	}

	@And("User enters")
	public void user_enters() throws InterruptedException {

		System.out.println("Test4");
		
		login.clickLogin();
		
		Thread.sleep(3000);
		
	}

	@Then("User is able to login and home page is shown")
	public void user_is_able_to_login_and_home_page_is_shown() throws InterruptedException {

		System.out.println("Test5");
		
		login.checkLogoutIsDisplayed();
		
		Thread.sleep(3000);
		
		driver.close();
		driver.quit();
		
	}


}
