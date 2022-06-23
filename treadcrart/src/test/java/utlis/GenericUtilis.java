package utlis;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtilis {

	public WebDriver driver;
	
	public GenericUtilis (WebDriver driver) {
		this.driver=driver;
	}
	
	public void SwitchToChild() {
		
		if(driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/")){
			Set<String> windows= driver.getWindowHandles();
			Iterator<String> main =windows.iterator();
		   String parent=main.next();
		   String child= main.next();
		  driver.switchTo().window(child);
	}
	}}
