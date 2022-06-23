package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	
	public WebDriver driver;
	
	public OfferPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	
	
	By TopDeals = By.linkText("Top Deals");
	By Search = By.xpath("//*[@id='search-field']");
	By text = By.linkText("Tomato");
	
	
	
	public void Topdeals() {
		driver.findElement(TopDeals).click();
	}
	
	public void SearchField(String shortName ) {
	driver.findElement(Search).sendKeys(shortName);
	}
	
	
	public void EditText() {
	String tomato=	driver.findElement(text).getText();
	System.out.println(tomato);
	}
}
