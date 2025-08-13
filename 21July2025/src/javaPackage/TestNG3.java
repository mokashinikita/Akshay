package javaPackage;

import org.testng.annotations.Test;

public class TestNG3
{
	@Test(priority= -10)
	public void a()
	{
		System.out.println("a method");
	}
	
	@Test(priority=2)
	public void b()
	{
		System.out.println("b method");
	}
	
	@Test(priority=0)
	public void c()
	{
		System.out.println("c method");
	}
	
	@Test
	public void d()
	{
		System.out.println("d method");
	}
	
}
