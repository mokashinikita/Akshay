package javaPackage;

import org.testng.annotations.Test;

public class TestNG7
{
	
	@Test(groups = "Regression")
	public void a()
	{
		System.out.println("Hello a");
	}
	
	@Test(groups = "Regression")
	public void b()
	{
		System.out.println("Hello b");
	}
	
	@Test(groups = "Regression")
	public void c()
	{
		System.out.println("Hello c");
	}
	
	@Test(groups = "Regression")
	public void d()
	{
		System.out.println("Hello d");
	}
	
	@Test(groups = {"Regression","Sanity"})
	public void e()
	{
		System.out.println("Hello e");
	}
	
	@Test(groups = {"Regression","Smoke"})
	public void f()
	{
		System.out.println("Hello f");
	}
}
