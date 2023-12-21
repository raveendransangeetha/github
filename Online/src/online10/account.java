package online10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class account {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement From=driver.findElement(By.xpath(""));
	    WebElement To=driver.findElement(By.xpath(""));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(From, To).build().perform();
	    
	}

}
