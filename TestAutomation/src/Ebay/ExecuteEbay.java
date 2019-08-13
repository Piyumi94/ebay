package Ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExecuteEbay {
	
	SearchEbay exe = new SearchEbay();
	WebDriver driver;
	
	@BeforeMethod
	public void Before() {
		System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");		
		driver =new ChromeDriver();
	}
	
	
	@Test(dataProvider="getData")
	public void Test(String url, String search) {
		exe.searchebay(driver, url, search);
			
	}
	
	@AfterMethod
	public void After() {
	//	driver.quit();
		
	}
	
	@DataProvider
	public Object[] [] getData() {
		return new Object[] [] {
			  new Object [] {"https://www.google.com/","ebay"}
			  
			                 
		  };
	
	}
	

}
