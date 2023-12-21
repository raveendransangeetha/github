package online10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demologin_ {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/login.html");
driver.findElement(By.id("email")).sendKeys("sona@");
driver.findElement(By.id("passwd")).sendKeys("12345");
driver.findElement(By.id("SubmitLogin")).click();
	}

}