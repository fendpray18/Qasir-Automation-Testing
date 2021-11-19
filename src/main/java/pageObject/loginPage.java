package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class loginPage extends base {

	public WebDriver driver;  
	
	//giving knowledge to driver
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//reusable element
	//login tab -> $x("//a[@data-w-tab='Tab 2']")
	//email -> $("input#sign-in-email.field-control-input.w-input")
	//pin -> $("input#password.field-control-input.w-input")
	//sumit -> $("input#submit-btn-signin.submit-button.w-button")
		
	By logintab= By.xpath("//a[@data-w-tab='Tab 2']");
	By email= By.cssSelector("input#sign-in-email.field-control-input.w-input");
	By pin= By.cssSelector("input#password.field-control-input.w-input");
	By submit= By.cssSelector("input#submit-btn-signin.submit-button.w-button");
	
	public WebElement clicklogintab() {
		return driver.findElement(logintab);
	}
	
	public WebElement fillemail() {
		return driver.findElement(email);
	}
	
	public WebElement fillpin() {
		return driver.findElement(pin);
	}
	
	public WebElement clicksubmit() {
		return driver.findElement(submit);
	}
}
