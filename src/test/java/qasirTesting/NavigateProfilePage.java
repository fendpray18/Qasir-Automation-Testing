package qasirTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.profilPage;
import resources.base;

public class NavigateProfilePage extends base {

	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test
	public void navigationToProfile() throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		loginPersonal();
		
		//Note logs
		log.info("Success login-ScenarioProfilePage");
		
		profilPage prof=new profilPage(driver);
		prof.clickProfilePath().click();
		Thread.sleep(10000);
		prof.clickProfileUser().click();
		Thread.sleep(10000);
		//prof.editImage().click();
		//Runtime.getRuntime().exec("C:\\Users\\Fendy\\Documents\fileUpload.exe"+""+prop.getProperty("image"));Thread.sleep(10000);
		//prof.clickChooseIamge().click();
		//Thread.sleep(10000);
		prof.inputFirstName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		prof.inputFirstName().sendKeys("Fendy");
		Thread.sleep(10000);
		prof.inputLastName().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		prof.inputLastName().sendKeys("Prayogi");
		Thread.sleep(10000);
		prof.inputMobilePhone().sendKeys(Keys.chord(Keys.CONTROL, "a"));
		prof.inputMobilePhone().sendKeys("6282213871714");
		Thread.sleep(10000);
		prof.clickSave().click();
		Thread.sleep(10000);
		//Note logs
		log.info("Success update Profile-ScenarioProfilePage");
	}	
	/*	@AfterTest
	public void teardown() {
		driver.close();
		
		log.info("Success closed");
	}
*/

}
