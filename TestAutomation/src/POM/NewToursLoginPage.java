package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewToursLoginPage extends CommandRepository  {
	
	By Username = By.xpath("//input[@name='userName']");
	By Password = By.xpath("//input[@name='password']");
	By Button = By.xpath("//input[@name='login']");
	
	public void LoginToApplication(WebDriver driver,String url, String username, String password) {
		openApplication(driver, url);
		Type(driver, Username,username);
		Type(driver, Password, password);
		Click(driver, Button);		
	}
	

}
