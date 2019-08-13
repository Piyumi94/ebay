package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommandRepository {
	
	public void openApplication(WebDriver driver , String url) {
		//System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		driver.get(url);
	}
	
	public void Type(WebDriver driver, By element, String values) {
		driver.findElement(element).sendKeys(values);
	}
	
	public void Click(WebDriver driver, By element) {
		driver.findElement(element).click();
	}

}
