package simpleAnnotations;

import org.testng.annotations.Test;

public class Dependson {
	
	@Test(dependsOnMethods = "M2")
	public void M1()
	{
		System.out.println("I am method M1");
	}

	@Test
	public void M2()
	{
		System.out.println("I am method M2");
	}
	
	@Test
	public void M3()
	{
		System.out.println("I am method M3");
	}

}
