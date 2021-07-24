package PageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookFlightPage_PF {

	@FindBy(id="ctl00_mainContent_rbtnl_Trip_0")
	WebElement Radio_OneWay;

	@FindBy(id="ctl00_mainContent_rbtnl_Trip_1")
	WebElement Radio_Round_Trip;

	@FindBy(id="ctl00_mainContent_rbtnl_Trip_2")
	WebElement Radio_Multicity;

	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement From_Origin;

	@FindBy(id="ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement To_Destination;

	@FindBy(xpath="//table[contains(@class,'datepicker-')]/tbody[1]/tr[6]/td[1]/a[1]")
	WebElement Departure_date;

	@FindBy(id="ctl00_mainContent_view_date2")
	WebElement Arrival_date_Box;

	@FindBy(xpath="//table[contains(@class,'ui-datepicker-calendar')]/tbody[1]/tr[5]/td[4]/a[1]")
	WebElement Arrival_date;

	@FindBy(id="divpaxinfo")
	WebElement Number_of_Pax;

	@FindBy(id="ctl00_mainContent_ddl_Adult")
	WebElement Number_of_Adult;

	@FindBy (name="ctl00$mainContent$DropDownListCurrency")
	WebElement CurrencyOption;

	@FindBy(name="ctl00$mainContent$btn_FindFlights")
	WebElement btn_Search;


	WebDriver driver;

	public BookFlightPage_PF(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver,this);

	}

	public void SelectJourneyOption(String JourneyOption) {

		if (JourneyOption.equalsIgnoreCase("oneway"))
			Radio_OneWay.click();
		else if (JourneyOption.equalsIgnoreCase("RoundTrip"))
			Radio_Round_Trip.click();
		else if (JourneyOption.equalsIgnoreCase("Multicity"))
			Radio_Multicity.click();

	}

	public void RoundTrip() {

		Radio_Round_Trip.click();
	}

	public void Selectoneway() {

		Radio_OneWay.click();

	}

	public void SelectOrigine(String Origin) {

		From_Origin.sendKeys(Origin);

	}


	public void SelectDestination(String Destination) {

		To_Destination.sendKeys(Destination);

	}

	public void SelectDeparDate(String DepDate) {


		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(DepDate))
			{
				ele.click();
				break;
			}

		}

	}

	public void SelectArrDate(String Arrdate) {

		Arrival_date_Box.click();

		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement ele:allDates)
		{

			String date=ele.getText();

			if(date.equalsIgnoreCase(Arrdate))
			{
				ele.click();
				break;
			}

		}


	}


	public void SelectnumberofPassnger() {

		Number_of_Pax.click();

	}

	public void SelectnumberofAdult(int NbrAdults) {

		Number_of_Adult.click();
		Select NumberofAdultDropDown = new Select(Number_of_Adult);
		NumberofAdultDropDown.selectByIndex(NbrAdults);
	}

	public void SelectCurrency(String currency) {

		CurrencyOption.click();
		Select CurrencyDropDown = new Select(CurrencyOption);
		CurrencyDropDown.selectByVisibleText(currency);;

	}

	public void Search() {

		btn_Search.click();

	}


}
