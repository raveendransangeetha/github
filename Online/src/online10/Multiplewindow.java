package online10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args)
	{
     System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
  
     WebDriver driver=new ChromeDriver();
     
    driver.get("https://www.facebook.com/login/");
    driver.findElement(By.linkText("Sign up for Facebook")).click();
    Set<String>a=driver.getWindowHandles();
    Iterator<String>it=a.iterator();
    while(it.hasNext()) 
    {
    	String childwindow=it.next();
    	
    	driver.switchTo().window(childwindow);
    }
    
	}

}

