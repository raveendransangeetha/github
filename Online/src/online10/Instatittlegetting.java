package online10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instatittlegetting {

	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Selinium.chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.instagram.com/sem/campaign/emailsignup/?campaign_id=13530338610&extra_1=s%7Cc%7C547419127652%7Ce%7Cinstagram%20login%7C&placement=&creative=547419127652&keyword=instagram%20login&partner_id=googlesem&extra_2=campaignid%3D13530338610%26adgroupid%3D126262414054%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-35100690670%26loc_physical_ms%3D9299934%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQiA6vaqBhCbARIsACF9M6kmw2ISUbm2ALlVzFwxNXQK23tL-FkERBPigwYPJZtjgoZKtqq-EywaApAXEALw_wcB");

	System.out.println("Title is"+driver.getTitle());
	String expected="isLogin • Instagram ";
	String actual=driver.getTitle();
	if(expected.contentEquals(actual))
	{
		System.out.println("test case passed");
	}
	else
		
	{
		System.out.println("Test Case Failed");
	}
	}

}
