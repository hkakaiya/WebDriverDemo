package StepDefnOnewayBooking;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OnewayBookingFlowStepDefn {


	WebDriver driver = null;
	BookFlightPage_PF BookFlight;
	FlightListPage_PF FlightList;
	TravellersDetails_PF TravellersDetails;
	AddONs_PF Addon;
	SeatSelection_PF SeatSelect;
	Payment_PF Payment;
	
	
	@Given("^Customer is on the Book flight page$")
	public void customer_is_on_the_book_flight_page() throws InterruptedException {

		System.out.println("Test1");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.navigate().to("https://spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		Thread.sleep(1000);

	}

	@And("^Customer selects oneway$")
	public void customer_selects_oneway() throws InterruptedException {

		System.out.println("Test2");

		BookFlight = new BookFlightPage_PF(driver);

		BookFlight.Selectoneway();
		Thread.sleep(1000);

	}

	@And("^Customer selects origin as (.*)$")
	public void customer_selects_origin(String Origin) throws InterruptedException {

		System.out.println("Test3");
		BookFlight.SelectOrigine(Origin);

		Thread.sleep(1000);
	}

	@And("^Customer selects destination as (.*)$")
	public void customer_selects_destination(String Destination) throws InterruptedException {

		System.out.println("Test4");
		BookFlight.SelectDestination(Destination);
		Thread.sleep(2000);


	}

	@And("^Customer selects Departure date as (.*)$")
	public void customer_selects_departure_date(String DepDate) throws InterruptedException {

		System.out.println("Test5");
		BookFlight.SelectDeparDate(DepDate);
		Thread.sleep(2000);

	}


	@And("^Customer selects Number of passngers as (.*)$")
	public void customer_selects_number_of_passngers(int NbrAdults) throws InterruptedException {

		System.out.println("Test7");
		BookFlight.SelectnumberofPassnger();
		BookFlight.SelectnumberofAdult(NbrAdults-1);
		Thread.sleep(1000);

	}

	@And("^Customer selects currency as (.*)$")
	public void customer_selects_currency(String currency) throws InterruptedException {

		System.out.println("Test8");
		BookFlight.SelectCurrency(currency);	
		Thread.sleep(1000);
	}

	@And("^Customer clicks on Search$")
	public void customer_clicks_on_search() throws InterruptedException {

		System.out.println("Test9");
		BookFlight.Search();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(3000);
	}

	@Then("^various available flights are shown to the Customer$")
	public void various_available_flights_are_shown_to_the_customer() throws InterruptedException {

		System.out.println("Test10");
		FlightList = new FlightListPage_PF(driver);
		FlightList.scrolldown();
		FlightList.FlightListPresent();
		FlightList.FarePresent();
		Thread.sleep(2000);

	}

	@And("^Customer selects flight$")
	public void customer_selects_flight() throws InterruptedException {

		System.out.println("Test11");
		FlightList.SelectFlightfare();
		Thread.sleep(2000);


	}

	@And("^Customer clicks on Continue for details page$")
	public void customer_clicks_on_continue_for_detail() throws InterruptedException {

		System.out.println("Test12");
		FlightList.clickContinue();
		Thread.sleep(2000);


	}

	@Then("^Customer details page is displayed$")
	public void customer_details_page_is_displayed() throws InterruptedException {

		System.out.println("Test13");
		TravellersDetails = new TravellersDetails_PF(driver);
		TravellersDetails.TravellerHeaderDisplayed();
		TravellersDetails.scrolldown2();
		Thread.sleep(2000);
				
			}
	
	
	@And("^Customer enters first Name (.*)$")
	public void customer_enters_first_Name(String Fname) throws InterruptedException {

		System.out.println("Test14");
		TravellersDetails.enterFirstName(Fname);
		Thread.sleep(2000);
	}
	
	
	@And("^Customer enters last Name (.*)$")
	public void customer_enters_last_Name(String Lname) throws InterruptedException {

		System.out.println("Test15");
		TravellersDetails.enterLastName(Lname);
		Thread.sleep(2000);
	}
	
	@And("^Customer enters mobile number (.*)$")
	public void customer_enters_mobile_number(String Mnumber) throws InterruptedException {

		System.out.println("Test16");
		TravellersDetails.enterMobileNumber(Mnumber);
		Thread.sleep(2000);
	}

	@And("^Customer enters email (.*)$")
	public void customer_enters_email(String email) throws InterruptedException {

		System.out.println("Test17");
		TravellersDetails.enterEmail(email);
		Thread.sleep(2000);
	}
	
	@And("^Customer selects city (.*)$")
	public void customer_enters_city(String city) throws InterruptedException {

		System.out.println("Test18");
		TravellersDetails.selectCity(city);
		Thread.sleep(2000);
	}
	
	@And("^Customer selects I am flying check box$")
	public void customer_selects_Flying_CHKBOX() throws InterruptedException {

		System.out.println("Test19");
		TravellersDetails.chkboxCheckBoxIamFlying();
		Thread.sleep(2000);
	}
	
	@And("^Customer clicks on Continue for ancillary page$")
	public void customer_selects_Continue_for_anx() throws InterruptedException {

		System.out.println("Test20");
		TravellersDetails.continuetoaddonspageclick();
		Thread.sleep(2000);
	}
	
	@Then("^ancillary purchase page is displayed$")
	public void ancillary_purchase_page_is_displayed() throws InterruptedException {

			
		System.out.println("Test21");
		Addon = new AddONs_PF(driver);
		Addon.AddONsHeaderDisplayed();
		Addon.scrolldown3();
		Thread.sleep(2000);
		
		}
	
	@And("^Customer clicks on excess bag$")
	public void customer_clicks_on_excess_bag() throws InterruptedException {

		System.out.println("Test22");
		Addon.excessbag();
		Thread.sleep(2000);
	}
	
	@And("^Customer selects excess bag$")
	public void customer_selects_excess_bag() throws InterruptedException {

		System.out.println("Test23");
		Addon.selectexcessbag();
		Thread.sleep(2000);
	}
	
	@And("^Customer clicks on Continue for seat selection$")
	public void Customer_clicks_on_Continue_for_seat_selection() throws InterruptedException {

		System.out.println("Test24");
		Addon.continuetoseat();
		Thread.sleep(2000);
	}
	
	@Then("^seat selection page is displayed$")
	public void seat_selection_page_is_displayed() throws InterruptedException {

			
		System.out.println("Test25");
		SeatSelect = new SeatSelection_PF(driver);
		SeatSelect.SeatHeaderDisplayed();
		SeatSelect.scrolldown4();
		Thread.sleep(2000);
					
		}
	
	@And("^Customer skips the seat selection$")
	public void Customer_skips_the_seat_selection() throws InterruptedException {

		System.out.println("Test26");
		SeatSelect.skip();
		Thread.sleep(2000);
	}
	
	@Then("^payment page is displayed$")
	public void payment_page_is_displayed() throws InterruptedException {

			
		System.out.println("Test28");
		Payment = new Payment_PF(driver);
		Payment.PayHeaderDisplayed();
		Payment.scrolldown5();
		Thread.sleep(2000); 
		driver.close();
		driver.quit();
		
		}
	
}
