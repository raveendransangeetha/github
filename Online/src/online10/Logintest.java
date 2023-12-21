package online10;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Logintest {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe";
	public WebDriver driver;
	
	
  @Test
  public void verifyHomepageTitle()
  {
	String expectedTitle = "Welcom.mercury Tours";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	System.out.println(actualTitle);
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	System.out.println("Launching firefox browser");
	System.setProperty("webdriver.chrome.driver",driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
	    
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
