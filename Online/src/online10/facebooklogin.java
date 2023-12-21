package online10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
public static void main(String[] args)
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/login/");

driver.findElement(By.id("email")).sendKeys("ftty");
driver.findElement(By.id("pass")).sendKeys("12345");
driver.findElement(By.id("loginbutton")).click();
}
}