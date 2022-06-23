package stepDefinations;

import cucumber.api.java.After;
import utlis.TestContextSetup;

public class Hooks {

	
	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		
		this.testContextSetup=testContextSetup;
	}
	
	
	@After
	public void close() {
		
		testContextSetup.testBase.WebDriverManager().quit();
		
	}
	
	
}
