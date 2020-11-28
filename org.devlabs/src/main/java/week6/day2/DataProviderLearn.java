package week6.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLearn {
	
	@Test(description = "opening browser", dataProvider = "name_details")
	public void bankDataProvider(String FName, String LName) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	ChromeDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("http://dbankdemo.com/signup");
	/*String myTitle = driver.getTitle();
	System.out.println(myTitle);
	String url = driver.getCurrentUrl();
	System.out.println(""+driver.getCurrentUrl());
	
	*/

 
Thread.sleep(3000);
	driver.findElementById("firstName").sendKeys("FName");
	driver.findElementById("lastName").sendKeys("LName");
	driver.findElementByCssSelector("[value='F']").click();
	driver.findElementById("dob").sendKeys("10/10/2020");
	driver.findElementById("ssn").sendKeys("1234");
	driver.findElementById("emailAddress").sendKeys("shik35@mail.com");
	driver.findElementById("password").sendKeys("Devlabs2020");
//	driver.findElementByTagName("button").click();
	// enter pass
	driver.findElementByName("password").sendKeys("Pass123$");
	// click login
//	driver.findElementById("submit").click();
//	driver.findElementByTagName("button").click();
	
	
	
	//driver.close();
	//driver.quit();
	
	}
	
	@DataProvider(name = "name_details")
	public String[][] setName()
	{
		String givename[][] = new String[3][2];
		givename[0][0] = "Jaya1";
		givename[0][1] = "narayanan1";
		givename[1][0] = "Jaya12";
		givename[1][1] = "narayanan12";
		givename[2][0] = "Jaya123";
		givename[2][1] = "narayanan123";
		return givename;
		
				
	}
	


}
