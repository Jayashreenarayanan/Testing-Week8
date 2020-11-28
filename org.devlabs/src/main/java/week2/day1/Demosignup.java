package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demosignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/signup");
		/*String myTitle = driver.getTitle();
		System.out.println("myTitle");
		String url = driver.getCurrentUrl();
		System.out.println(""+driver.getCurrentUrl());
		
		*/
		// enter name
	 
	
		driver.findElementById("firstName").sendKeys("Jaya1");
		driver.findElementById("lastName").sendKeys("narayanan1");
		driver.findElementByCssSelector("[value='F']").click();
		driver.findElementById("dob").sendKeys("10/10/2020");
		driver.findElementById("ssn").sendKeys("1234");
		driver.findElementById("emailAddress").sendKeys("kaushik350@mail.com");
		driver.findElementById("password").sendKeys("Devlabs2020");
	//	driver.findElementByTagName("button").click();
		// enter pass
		driver.findElementByName("password").sendKeys("Pass123$");
		// click login
//		driver.findElementById("submit").click();
	//	driver.findElementByTagName("button").click();
		
		
		
		//driver.close();
		//driver.quit();

	}

}


