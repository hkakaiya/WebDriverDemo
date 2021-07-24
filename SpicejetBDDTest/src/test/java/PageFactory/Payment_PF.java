package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_PF {

	@FindBy(xpath="//div[@id='wrapper']/div[2]/div[1]/div[1]/h2[1]/span[1]")
	WebElement Pay_header;

	WebDriver driver;

	public Payment_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void PayHeaderDisplayed() {

		System.out.println(Pay_header.isDisplayed());
		Assert.assertTrue(Pay_header.isDisplayed());

	}

	public void scrolldown5() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}




}
