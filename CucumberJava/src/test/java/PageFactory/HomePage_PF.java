package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class HomePage_PF {
	
	@FindBy(id="logout")
	WebElement btn_Logout;
	WebDriver driver;
	
	public HomePage_PF(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void checkLogOutIsDisplayed() {
		
		btn_Logout.isDisplayed();
	}
	
}
