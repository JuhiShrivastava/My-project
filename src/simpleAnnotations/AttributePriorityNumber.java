package simpleAnnotations;

import org.testng.annotations.Test;

public class AttributePriorityNumber {
	@Test(priority=3)
	public void M1()
	{
		System.out.println("I am method M1");
	}

	@Test(priority=1)
	public void M2()
	{
		System.out.println("I am method M2");
	}
	
	@Test(priority=2)
	public void M3()
	{
		System.out.println("I am method M3");
	}
	
}
