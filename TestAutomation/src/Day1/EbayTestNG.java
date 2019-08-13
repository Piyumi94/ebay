package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class EbayTestNG {
  ChromeDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
  System.setProperty("webdriver.chrome.driver", "/C:\\Users\\pruparathna\\Downloads\\chromedriver.exe");
  driver = new ChromeDriver(); // open browser
	  
  }	
	
  @Test(dataProvider="dataProvider")
  public void Test(String url, String site, String product) {
	  // Search ebay
	  driver.get(url);
	  driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(site);
     // driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys(Keys.RETURN);
	  driver.findElement(By.xpath("//input[@title=\"Search\"]")).submit();
      
      //Search Item
      driver.findElement(By.xpath("//a/h3[contains(text(),\"eBay: Electronics, Cars, Fashion, Collectibles\")]")).click();
	  driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys(product);
	  driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN);
	  
	  //click on category
	  driver.findElement(By.xpath("//div[1]/span[2]/a[1][@href= \"https://www.ebay.com/sch/i.html?_nkw=bags+women&_sop=12\"]")).click();
	  
	  //view product description of particular item
	  driver.findElement(By.xpath("//li[1]/div/div/a/h3[@class=\"s-item__title s-item__title--has-tags\"]")).click();
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	 driver.quit();
	  
  }
  
	@DataProvider
	public Object[][] dataProvider() {
		return new Object[][] {
			new Object[] {"https://www.google.com/" , "ebay" , "Bags"} 
		};
	}

}
