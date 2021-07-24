package PageFactory;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravellersDetails_PF {

	@FindBy(xpath="//div[@class='traveller-details-heading']")
	WebElement TRAVELLER_DETAILS_header;

	@FindBy(xpath="//input[contains(@id,'TextBoxFirstName')]")
	WebElement FirstName;

	@FindBy(xpath="//input[contains(@name,'TextBoxLastName')]")
	WebElement LastName;

	@FindBy(xpath="//input[contains(@name,'TextBoxHomePhone')]")
	WebElement HomeMobile;

	@FindBy(xpath="//input[contains(@name,'TextBoxEmailAddress')]")
	WebElement Email;

	@FindBy(xpath="//select[contains(@name,'cities_')]")
	WebElement City;

	@FindBy(xpath="//p[contains(@class,'formCheckBox ')]/input[1]")
	WebElement CheckBoxIamFlying;

	@FindBy(xpath="//div[@id='continue-to-addons-page']/span[1]")
	WebElement continuetoaddonspage;

	WebDriver driver;

	public TravellersDetails_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void TravellerHeaderDisplayed() {

		System.out.println(TRAVELLER_DETAILS_header.isDisplayed());
		Assert.assertTrue(TRAVELLER_DETAILS_header.isDisplayed());

	}

	public void scrolldown2() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)");
	}

	public void enterFirstName(String firstname) {

		FirstName.sendKeys(firstname);

	}

	public void enterLastName(String lastname) {

		LastName.sendKeys(lastname);
	}

	public void enterMobileNumber (String mnumber)	{

		HomeMobile.sendKeys(mnumber);
	}

	public void enterEmail (String email) {

		Email.sendKeys(email);
	}

	public void selectCity (String city) {

		City.click();
		Select CityDropDown = new Select(City);
		CityDropDown.selectByVisibleText(city);;
	}

	public void chkboxCheckBoxIamFlying () {

		CheckBoxIamFlying.click();
	}

	public void continuetoaddonspageclick () {

		continuetoaddonspage.click();
	}

}
