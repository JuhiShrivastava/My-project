package simpleAnnotations;

import org.testng.annotations.Test;

public class groups {
	@Test(groups = "regression")
	public void M1()
	{
		System.out.println("I am method M1");
	}

	@Test(groups = "smoke")
	public void M2()
	{
		System.out.println("I am method M2");
	}
	
	@Test(groups = "smoke")
	public void M3()
	{
		System.out.println("I am method M3");
	}

}
