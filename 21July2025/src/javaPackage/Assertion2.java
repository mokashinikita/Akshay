package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2
{
	@Test
	public void testCase2()
	{
		String actText="abc";
		
		String expText="abc";
		
		int a=10;
		int b=20;
		
		Assert.assertEquals(actText, expText);
		System.out.println("Equal Assertion verified");
		
		Assert.assertFalse(a>b);
		System.out.println("False Assertion Verified");
		
		Assert.assertTrue(a>b);
		System.out.println("True Assertion Verified");
		
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("Hello testCase3");
	}
}
