package qasirTesting;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.loginPage;
import pageObject.outletPage;
import pageObject.profilPage;
import resources.base;

public class NavigateFullTesting extends base {

	public WebDriver driver;
	public static Logger log=LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

	}

	@Test
	public void navigateToEnd2End() throws IOException, InterruptedException {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

		//Note logs
		log.info("Success enter browser");
		
		//loginPersonal();
		
		loginPage login=new loginPage(driver);
		login.clicklogintab().click();
		login.fillemail().sendKeys(prop.getProperty("email"));
		Thread.sleep(5000);
		login.fillpin().sendKeys(prop.getProperty("pin"));
		Thread.sleep(5000);
		login.clicksubmit().click();
		Thread.sleep(10000);
		
		//Note logs
		log.info("Success Login");
		
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

		//Note logs
		log.info("Success update Outlet");
		
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
		log.info("Success update Profile");
	}

/*	@AfterTest
	public void teardown() {
		driver.close();
		
		log.info("Success closed");
	}
*/
	
}
