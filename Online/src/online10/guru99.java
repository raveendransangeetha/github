package online10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class guru99  {
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/");
	driver.findElement(By.name("emailid")).sendKeys("sangeetha.com");
	driver.findElement(By.name("btnLogin")).click();

}
}