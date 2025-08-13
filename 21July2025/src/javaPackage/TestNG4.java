package javaPackage;

import java.awt.event.InvocationEvent;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4
{
	
	public void a()
	{
		System.out.println("Hello a");
	}
	
	@Test
	public void b()
	{
		System.out.println("Hello b");
	}
	
	@Test(invocationCount = 2)
	public void c()
	{
		System.out.println("Hello c");
	}
	
	@Test(enabled = false)
	public void d()
	{
		System.out.println("Hello d");
	}
	
	@Test()
	public void e()
	{
		System.out.println("Hello e");
		throw new SkipException("Skipping e method");
	}


}
