package Ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchEbay extends Commands  {
	
	By Search = By.xpath("//input[@title=\"Search\"]");
	By Submit = By.xpath("//input[@id='fakebox-input']");
	
	public void searchebay(WebDriver driver,String url, String search) {
		openApplication(driver, url);
		Type(driver, Search ,search);
		Submit(driver, Submit);
		
	}
	

}
