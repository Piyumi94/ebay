package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Execution {
	NewToursLoginPage login = new NewToursLoginPage();
	WebDriver driver;
	
	@BeforeMethod
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");		
		driver =new ChromeDriver();
	}
	
	@Test(dataProvider="getData")
	public void testLoginFunctionality(String url, String username, String password) {
		login.LoginToApplication(driver, url, username, password);
		
	}
	
	@AfterMethod
	public void After() {
		driver.quit();
	}
	
	@DataProvider
	public Object[] [] getData() {
		return new Object[] [] {
			  new Object [] {"http://newtours.demoaut.com/","aaa","aaa"}
			  
			                 
		  };
	
	}
}
