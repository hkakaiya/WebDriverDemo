package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddONs_PF {

	@FindBy(xpath="//div[contains(@class,'traveller-details-heading')]/h2[1]")
	WebElement AddOns_header;

	@FindBy(xpath="//li[contains(@class,'baggage')]/div[1]/div[3]/span[1]/input[1]")
	WebElement excessbag;

	@FindBy(xpath="//div[@id='divBaggagecontent1']/div[1]/div[2]/div[1]/div[4]/div[1]/select[1]")
	WebElement bag;

	@FindBy(xpath="//div[@id='continue-to-payment-page']/span[1]")
	WebElement continuetoseatpage;

	WebDriver driver;

	public AddONs_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void AddONsHeaderDisplayed() {

		System.out.println(AddOns_header.isDisplayed());
		Assert.assertTrue(AddOns_header.isDisplayed());

	}

	public void scrolldown3() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");
	}

	public void excessbag() {
		excessbag.click();
		bag.click();
		Select bagDropDown = new Select(bag);
		bagDropDown.selectByIndex(1);
	}

	public void selectexcessbag() {

		bag.click();
		Select bagDropDown = new Select(bag);
		bagDropDown.selectByIndex(1);
	}

	public void continuetoseat() {
		continuetoseatpage.click();
	}
}
