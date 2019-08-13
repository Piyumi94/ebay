package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Commands {
	public void openApplication(WebDriver driver , String url) {
		driver.get(url);
	}
	
	public void Type(WebDriver driver, By element, String values) {
		driver.findElement(element).sendKeys(values);
	}
	
	public void Click(WebDriver driver, By element) {
		driver.findElement(element).click();
	}
	
	public void Submit(WebDriver driver, By element) {
		driver.findElement(element).submit();	
	}

}
