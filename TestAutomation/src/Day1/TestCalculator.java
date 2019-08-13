package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCalculator {
	
 public static void main(String[] args) {
	 
	 System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");
	 ChromeDriver driver = new ChromeDriver(); // open browser
	 driver.get("https://www.calculator.net/");
	 driver.findElement(By.linkText("Percentage Calculator")).click();
	 driver.findElement(By.id("cpar1")).sendKeys("10");
	 driver.findElement(By.id("cpar2")).sendKeys("5");
     driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Percentage Calculator'])[3]/following::input[5]")).click();    
     String Ans =driver.findElement(By.xpath("//b[text()='0.5']")).getText();
    // Assert.assertEquals(Ans,"0.5");
     
     if(Ans.equals("0.5")) {
    	 System.out.println("This value is equal");
     }
     else
     {
    	 System.out.println("This value is not equal");
     }
     driver.close();
         
 }
 

}
