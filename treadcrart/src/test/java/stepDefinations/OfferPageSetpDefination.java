package stepDefinations;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.OfferPage;
import pageObject.PageObjectManager;
import utlis.TestContextSetup;

public class OfferPageSetpDefination {

	
	public  WebDriver driver;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
			
	
	@Then("^User serached for shortName (.+) in offers page to check if product exist with same name$")
	public void user_serached_for_shortName_in_offers_page_to_check_if_product_exist(String shortName) throws Throwable {
		
		OfferPage offer = new OfferPage(driver);
			offer.Topdeals();					 
	        SwitchToOfferPage();
	        offer.SearchField(shortName);
	        offer.EditText();
			 }
	
	public void SwitchToOfferPage() {
		testContextSetup.pageObjectManager.getLandingPage().ProductPage();
		testContextSetup.genericUtilis.SwitchToChild();
		}
	
	
	@And("^validate product name in offers page matches with landing page$")
	public void validate_product_name_in_offers_page_matches_with_landing_page () {
	
	Assert.assertEquals(testContextSetup.landingPageProduct,testContextSetup.OfferPageProduct);
	
		
	}

	
}
