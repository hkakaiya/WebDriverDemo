package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeatSelection_PF {

	@FindBy(xpath="//div[@id='wrapper']/div[2]/div[1]/div[1]/h2[1]/span[1]")
	WebElement Seat_header;

	@FindBy(xpath="//*[contains(text(),'Skip to Continue')]")
	WebElement SkiptoContinue;

	@FindBy(xpath="//div[@id='continue-to-addons-page']/span[1]")
	WebElement continuetopaymentpage;

	WebDriver driver;

	public SeatSelection_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void SeatHeaderDisplayed() {

		System.out.println(Seat_header.isDisplayed());
		Assert.assertTrue(Seat_header.isDisplayed());

	}

	public void scrolldown4() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}

	public void skip() {
		SkiptoContinue.click();
	}

	public void continueforpay() {
		continuetopaymentpage.click();
	}


}
