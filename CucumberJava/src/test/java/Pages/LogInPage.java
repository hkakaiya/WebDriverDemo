package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

	protected WebDriver driver;
	
	private By txt_username = By.id("name");
	private By txt_password = By.id("password");
	private By btb_login = By.id("login");
	private By btb_logout = By.id("logout");
	
	public LogInPage (WebDriver driver) {
		
		this.driver = driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			
			throw new IllegalStateException("Not on login page. Current page is "+driver.getCurrentUrl());
			
		}
			
	}
	
	public void enenterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);

				
	}
	
	public void enenterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
				
	}
	
	public void clickLogin() {
		
		driver.findElement(btb_login).click();
		
				
	}
	
	public void checkLogoutIsDisplayed() {
		
		driver.findElement(btb_logout).isDisplayed();
						
	}
	
	public void loginValidUser(String username,String password) {
		
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btb_login).click();
		
}
	
}


