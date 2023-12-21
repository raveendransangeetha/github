package online10;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sreenshot {

	public static void main(String[] args) throws IOException {
		
System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshot, new File("C:\\Users\\User\\Desktop\\Sangeetha\\abc.jpeg"));
	}

}
