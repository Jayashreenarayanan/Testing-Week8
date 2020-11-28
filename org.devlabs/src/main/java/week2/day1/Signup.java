package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	/*	  driver.get("http://dbankdemo.com/login");
		  driver.findElementByLinkText(" Sign Up Here").click();
		  driver.findElementByTagName("a").click(); String url1 =
		  driver.getCurrentUrl(); System.out.println(url1);
		 
	}
}*/
		
		driver.get("http://dbankdemo.com/signup");
		WebElement title = driver.findElementById("title");
		Select sel = new Select(title);
		sel.selectByVisibleText("Ms.");
		driver.findElementById("firstName").sendKeys("abc4");
		driver.findElementById("lastName").sendKeys("def4");
		
		driver.findElementByCssSelector("[Value='F']").click();
		
		driver.findElementById("dob").sendKeys("10/11/2020");
		driver.findElementById("ssn").sendKeys("727-45-6781");
		driver.findElementById("emailAddress").sendKeys("def4@gmail.com");
		driver.findElementById("password").sendKeys("Devlabs2020");
		driver.findElementById("confirmPassword").sendKeys("Devlabs2020");
		
        driver.findElementByTagName("button").click();
        String url = driver.getCurrentUrl();
        System.out.println("Totally 3 screens navigation \n");
        System.out.println("1st Screen: " +url + "\n");
        
        driver.findElementById("address").sendKeys("0987 roger road");
		driver.findElementById("locality").sendKeys("San Carlos");
		driver.findElementById("region").sendKeys("CA");
		driver.findElementById("postalCode").sendKeys("94302");
		driver.findElementById("country").sendKeys("USA");
		driver.findElementById("homePhone").sendKeys("(575) 204-7395");
		driver.findElementById("mobilePhone").sendKeys("(575) 204-7395");
		driver.findElementById("workPhone").sendKeys("(575) 204-7395");
		driver.findElementById("agree-terms").click();
		driver.findElementByTagName("button").click();
		
		 String url1 = driver.getCurrentUrl();
	     System.out.println("2nd Screen: " +url1+ "\n");
	     
	     driver.findElementById("username").clear();
	     driver.findElementById("username").sendKeys("def4@gmail.com");
		 driver.findElementById("password").sendKeys("Devlabs2020");
		 driver.findElementById("remember-me").click();
		 driver.findElementById("submit").click();
			
		 String url2 = driver.getCurrentUrl();
		 System.out.println("3rd Screen: " +url2+ "\n");
	     

		
//		driver.close();
//		driver.quit();
		

	}

}
