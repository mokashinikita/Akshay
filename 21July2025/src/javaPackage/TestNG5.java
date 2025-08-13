package javaPackage;

import org.testng.annotations.Test;

public class TestNG5
{
	@Test
	public void a()
	{
		System.out.println("Hello a");
	}
	
	@Test(invocationCount = 2,priority=1,enabled = true & false)
	public void b()
	{
		System.out.println("Hello b");
	}
	
	@Test(invocationCount = 2)
	public void c()
	{
		System.out.println("Hello c");
	}
}
 