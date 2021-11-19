package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import pageObject.loginPage;

public class base {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		// Create declare data.properties
		prop= new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Fendy\\QasirApp\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		// Create logic algorithm to keep webdriver not hardcode
		String browserName= prop.getProperty("browser");
		System.out.println(browserName);
		
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Works\\TestNG\\chromedriver.exe");
		    driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Works\\firefoxdriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Works\\iexdriver.exe");
			driver = new InternetExplorerDriver();
		}

		// give time implicit to wait 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void loginPersonal() throws IOException, InterruptedException {
		loginPage login=new loginPage(driver);
		login.clicklogintab().click();
		login.fillemail().sendKeys(prop.getProperty("email"));
		Thread.sleep(5000);
		login.fillpin().sendKeys(prop.getProperty("pin"));
		Thread.sleep(5000);
		login.clicksubmit().click();
		Thread.sleep(10000);
	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		// TODO Auto-generated method stub
		// Declare Screenshot methods
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		
		//must add dependency "Apache Commons IO"
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
	}
}

