package qasirTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;

public class NavigateLoginPage extends base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test
	public void navigationToLogin() throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		loginPersonal();
		log.info("Success login-ScenarioLoginPage");
	}
	
	/*	@AfterTest
	public void teardown() {
		driver.close();
		
		log.info("Success closed");
	}
*/

}
