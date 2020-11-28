package week6.day1;

import org.testng.annotations.Test;

public class DependsOn {
	
	
	@Test()
	public void supplier()
	{
		System.out.println("Supplier");
	
	}
	
	@Test(dependsOnMethods = "week6.day1.DependsOn.integrations")
	public void Payments()
	{
		System.out.println("Payments");
	}

	@Test()
	public void integrations()
	{
		System.out.println("Integrations");
	
	}
	
	@Test()
	public void Pay()
	{
		System.out.println("Pay");
	}
	

}
