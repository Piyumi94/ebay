package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class TestCalcWithTestNG {
	ChromeDriver driver;
	
	@BeforeMethod
	public void setupchromebrowser() {
	    System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(); // open browser		
		
	}
	
	@Test(dataProvider="getDataforTest")
	public void test(String url , String fristValue , String secondValue) {
		 driver.get(url);
		 driver.findElement(By.linkText("Percentage Calculator")).click();
		 driver.findElement(By.id("cpar1")).sendKeys("fristValue");
		 driver.findElement(By.id("cpar2")).sendKeys("secondValue");
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
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		
	}
	
	@DataProvider
	public Object[][] dataProvider() {
		return new Object[][] {
			new Object[] {"https://www.calculator.net/" , "20" , "10" , "0.5"} 
			//,
//			new Object[] {"https://www.calculator.net/" , "40" , "20" , "1"} ,
//			new Object[] {"https://www.calculator.net/" , "40" , "20" , "2"}
		};
	}

}
