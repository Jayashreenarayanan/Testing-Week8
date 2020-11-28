package week6.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DifferentBrowser {
	
	@Parameters({"URL", "Title", "Browser"})
	@Test
	public void browsering(String url, String title, String BW) {
		// TODO Auto-generated method stub
		
		
		if(BW.equalsIgnoreCase("ch"))
		{
			System.out.println(BW);
			System.setProperty(url,"ChromeDriver");
			ChromeDriver driver = new ChromeDriver();
			
			
			
			driver.manage().window().maximize();
			driver.get("https://devlabs-860f0.web.app/");
			String myTitle = driver.getTitle();
			System.out.println(myTitle);
			if(myTitle.equalsIgnoreCase(title))
			{
				System.out.println("Title Correct");
			}
			String url1 = driver.getCurrentUrl();
			System.out.println(url1);
			driver.close();
			driver.quit();
		}
		
		else
		{
			System.out.println(BW);
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			ChromeDriver driver = new ChromeDriver();
			
			
			
			driver.manage().window().maximize();
			driver.get("https://devlabs-860f0.web.app/");
			String myTitle = driver.getTitle();
			System.out.println(myTitle);
			if(myTitle.equalsIgnoreCase("Workspace"))
			{
				System.out.println("Title Correct");
			}
			String url1 = driver.getCurrentUrl();
			System.out.println(url1);
			driver.close();
			driver.quit();
		}
		
		
}

}
