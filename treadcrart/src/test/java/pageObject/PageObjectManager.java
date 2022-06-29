package pageObject;

import org.openqa.selenium.WebDriver;

import utlis.TestBase;

public class PageObjectManager {

	public LandingPage landing;
	public WebDriver driver;
	public OfferPage offer;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public LandingPage getLandingPage() {
		
		landing = new LandingPage(driver);
		return landing;
	}
	
	
	public void getOfferPage() {
		offer = new OfferPage(driver);
	}
}
