package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightListPage_PF {

	@FindBy(xpath="//table[@id='availabilityTable0']/tbody[1]/tr[1]/th[1]/div[2]/span[2]")
	WebElement Flight_header;

	@FindBy (id="taxAndFeeInclusiveDivHeader")
	WebElement Fare_header;

	@FindBy (xpath="//div[@id='continue-to-contact-page']/div[1]/span[1]")
	WebElement btn_Continue;

	@FindBy (xpath="//table[@id='availabilityTable0']/tbody[1]/tr[4]/td[3]/p[1]/label[1]/span[1]")
	WebElement radio_Flight_fare;

	WebDriver driver;

	public FlightListPage_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void FlightListPresent() {

		System.out.println(Flight_header.getText());
		Assert.assertEquals("DEPARTURE FLIGHT",Flight_header.getText());

	}

	public void FarePresent() {

		System.out.println(Fare_header.isDisplayed());
		Assert.assertTrue(Fare_header.isDisplayed());

	}

	public void SelectFlightfare() {

		radio_Flight_fare.click();

	}

	public void clickContinue() {

		btn_Continue.click();

	}

	public void scrolldown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
}



