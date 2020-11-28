package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.testng.annotations.Test;

public class Launchbrowser2 {

	@Test
	public void browser2() {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://devlabs-860f0.web.app/");
		String myTitle = driver.getTitle();
		System.out.println(myTitle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		driver.quit();
}

}
