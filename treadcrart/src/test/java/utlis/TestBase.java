package utlis;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.j2objc.annotations.Property;

public class TestBase {

	public WebDriver driver;
	Properties pro;
	
	public WebDriver WebDriverManager() {
		 
		try {
		File file= new File(System.getProperty("user.dir")+"//src//test//java//Resources//globle.properties");
		FileInputStream input = new FileInputStream(file);
		pro = new Properties ();
		pro.load(input);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		String url =pro.getProperty("QAURL");
			if(driver==null) {
			{
			if(pro.getProperty("browser")=="chrome")
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver= new ChromeDriver();
			}
		if(pro.getProperty("browser")=="firefox")	
			System.setProperty("webdriver.chrome.driver","C:\\geckodriver.exe");
		driver= new FirefoxDriver();
			
		driver.get(url);
		}
		return driver;
	}



	}
	

