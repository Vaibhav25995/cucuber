package utlis;

import org.openqa.selenium.WebDriver;

import pageObject.PageObjectManager;

public class TestContextSetup {

	
	public WebDriver driver;
	public String landingPageProduct;
	public String OfferPageProduct;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtilis genericUtilis;
	
	
	
	public TestContextSetup() {
		 testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtilis = new GenericUtilis(testBase.WebDriverManager());
	}
	
	
}
