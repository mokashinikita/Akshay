package javaPackage;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestNG6
{
	@Test
	public void z()
	{
		Assert.assertTrue(3<12);
		System.out.println("Hello z test method");
	}
	
	@Test
	public void a()
	{
		Assert.assertTrue(3>12);
		System.out.println("Hello a test method");
	}
	
	@Test(dependsOnMethods = {"z","a"})
	public void b()
	{		
		System.out.println("Hello b test method");
	}

}
