package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		 this.driver=driver;
	}
	
	
	
	By Search =By.xpath("//*[@type='search']");
	By PageProduct = By.xpath("//*[@class='product-name']");
	
	
	public void SearchItem(String shortName) {
		driver.findElement(Search).sendKeys(shortName);
	}
	
	public void ProductPage() {
		String landingPageProduct	=driver.findElement(PageProduct).getText().split("-")[0].trim();
		System.out.println(landingPageProduct);
	}
}
