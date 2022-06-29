package stepDefinations;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utlis.TestContextSetup;

public class LandingPageStepDefination {
 
	public static WebDriver driver;
    
    public String OfferPageProduct;
    TestContextSetup testContextSetup;
    
   public  LandingPageStepDefination(TestContextSetup testContextSetup) {
	   this.testContextSetup=testContextSetup;
   }
    
    
	@Given("^User is on GreenCart Landing Page$")
	public void user_is_on_GreenCart_Landing_Page() throws Throwable {
		Assert.assertTrue(testContextSetup.landingPageProduct.contains("GreenKart"));
		
				
	   	}

	@When("^User searched with shortName (.+) and extracted actual name of product $")
	public void user_searched_with_shortName_and_extracted_actual_name_of_product(String shortName) throws Throwable {
		LandingPage Landing = new LandingPage(driver);
		Landing.SearchItem(shortName);
	    	 
		}

	
	
	

		
	

	
	
}
