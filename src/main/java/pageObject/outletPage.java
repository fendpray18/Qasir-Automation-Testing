package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class outletPage extends base {

	// giving knowledge to driver
	public outletPage(WebDriver driver) {
		this.driver=driver;
	}
	
	//outlet -> $x("//ul[@class='menu accordion-menu']/li[10]")
	//outlet -> $x("//a[@href='https://fendy-testing-607891.qasir.id/outlets']")
	//ubah -> $x("//a[@href='https://fendy-testing-607891.qasir.id/outlet/form/630771']")
	//address -> $x("//textarea[@class='form-control']")
	//filllocation $("span#select2-location_id-container.select2-selection__rendered")
	//typinglocation $x("//input[@class='select2-search__field']")
	//uploadiamge -> $x("//label[@for='outlet_img']/span")
	//simpan -> $x("//div[@class='row flex space-between align-center']/div[2]/button")
	
	By outlet = By.xpath("//a[@href='https://fendy-testing-607891.qasir.id/outlets']");
	By ubah = By.xpath("//a[@href='https://fendy-testing-607891.qasir.id/outlet/form/630771']");
	By address = By.xpath("//textarea[@class='form-control']");
	By formlocation = By.cssSelector("span#select2-location_id-container.select2-selection__rendered");
	By typelocation = By.xpath("//input[@class='select2-search__field']");
	By uploadimage = By.xpath("//label[@for='outlet_img']/span");
	By simpan = By.xpath("//div[@class='row flex space-between align-center']/div[2]/button");
	
	public WebElement clickOutletPage() {
		return driver.findElement(outlet);
	}
	public WebElement clickUbah() {
		return driver.findElement(ubah);
	}
	public WebElement filladdress() {
		return driver.findElement(address);
	}
	public WebElement filllocation() {
		return driver.findElement(formlocation);
	}
	public WebElement typinglocation() {
		return driver.findElement(typelocation);
	}
	public WebElement uploadImage() {
		return driver.findElement(uploadimage);
	}
	public WebElement ClickSimpan() {
		return driver.findElement(simpan);
	}
}
