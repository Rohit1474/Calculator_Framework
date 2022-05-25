package Com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static ConfigDataProvider config;
	@BeforeSuite
	public void bs() throws Exception {
		config= new ConfigDataProvider();
	}
	@BeforeMethod
		public void openBrowser() {
	


	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	//driver.get("https://www.calculator.net/");
	driver.get(config.getBaseUrl_Stage());
	driver.manage().window().maximize();
	
	
}
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}
	

}
