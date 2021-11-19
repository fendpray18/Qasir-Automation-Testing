package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base;

public class profilPage extends base {


	// profil $x("//li[@class='dropdown']/a")
	// profilpengguna
	// $x("//a[@href='https://fendy-testing-607891.qasir.id/account/profile']")
	// editfoto $x("//label[@for='user_image']/span")
	// terapkan $x("//button[@class='button button-small button-secondary
	// btn-block']")
	// firstname $x("//input[@name='first_name']")
	// lastname $x("//input[@name='last_name']")
	// mobile $x("//input[@name='mobile']")
	// simpan $x("//div[@class='col-xs-12']/div/button")

	// giving knowledge to driver
	public profilPage(WebDriver driver) {
		this.driver= driver;
		// TODO Auto-generated constructor stub
	}

	By profilePath = By.xpath("//li[@class='dropdown']/a");
	By profileUser = By.xpath("//a[@href='https://fendy-testing-607891.qasir.id/account/profile']");
	By editImage = By.xpath("//label[@for='user_image']/span");
	By chooseImage = By.xpath("//button[@class='button button-small button-secondary btn-block']");
	By firstName = By.xpath("//input[@name='first_name']");
	By lastName = By.xpath("//input[@name='last_name']");
	By mobilePhone = By.xpath("//input[@name='mobile']");
	By saveButton = By.xpath("//div[@class='col-xs-12']/div/button");

	public WebElement clickProfilePath() {
		return driver.findElement(profilePath);
	}

	public WebElement clickProfileUser() {
		return driver.findElement(profileUser);
	}

	public WebElement editImage() {
		return driver.findElement(editImage);
	}

	public WebElement clickChooseIamge() {
		return driver.findElement(chooseImage);
	}

	public WebElement inputFirstName() {
		return driver.findElement(firstName);
	}

	public WebElement inputLastName() {
		return driver.findElement(lastName);
	}

	public WebElement inputMobilePhone() {
		return driver.findElement(mobilePhone);
	}

	public WebElement clickSave() {
		return driver.findElement(saveButton);
	}
}
