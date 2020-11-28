package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Launchbrowser {

	@Test
	public void browser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriver driver = new ChromeDriver();
        
driver.get("http://dbankdemo.com/login");
String myTitle = driver.getTitle();
System.out.println(myTitle);
String url = driver.getCurrentUrl();
System.out.println(url);
driver.close();
	
	}

}
