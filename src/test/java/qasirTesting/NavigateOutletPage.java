package qasirTesting;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.outletPage;
import resources.base;

public class NavigateOutletPage extends base {
	
		public WebDriver driver;
		public static Logger log=LogManager.getLogger(base.class.getName());
		
		@BeforeTest
		public void initialize() throws IOException {
			driver = initializeDriver();
			
		}
		
		@Test
		public void navigationToOutlet() throws IOException, InterruptedException {
			driver.get(prop.getProperty("url"));
			driver.manage().window().maximize();
			
			loginPersonal();
			log.info("Success login-ScenarioOutletPage");
			
			outletPage outlet= new outletPage(driver);
			outlet.clickOutletPage().click();
			Thread.sleep(10000);
			outlet.clickUbah().click();
			Thread.sleep(10000);
			outlet.filladdress().sendKeys(Keys.chord(Keys.CONTROL, "a"));
			outlet.filladdress().sendKeys("Testing");
			Thread.sleep(10000);
			outlet.filllocation().click();
			Thread.sleep(10000);
			outlet.typinglocation().sendKeys("Purwokerto");
			Thread.sleep(10000);
			outlet.typinglocation().sendKeys(Keys.ENTER);
			Thread.sleep(10000);
			//outlet.uploadImage().click();
			//Runtime.getRuntime().exec("C:\\Users\\Fendy\\Documents\fileUpload.exe"+""+prop.getProperty("image"));
			//Thread.sleep(10000);
			outlet.ClickSimpan().click();
			Thread.sleep(10000);
			
			log.info("Success update Outlet-ScenarioOutletPage");
		}
		
		/*	@AfterTest
		public void teardown() {
			driver.close();
			
			log.info("Success closed");
		}
	*/

	}
