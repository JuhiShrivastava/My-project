package simpleAnnotations;

import org.testng.annotations.Test;

public class PriorityAttributeCharacter {

	@Test(priority='a')
	public void M1()
	{
		System.out.println("I am method M1");
	}

	@Test(priority='c')
	public void M2()
	{
		System.out.println("I am method M2");
	}
	
	@Test(priority='b')
	public void M3()
	{
		System.out.println("I am method M3");
	}
	
}
