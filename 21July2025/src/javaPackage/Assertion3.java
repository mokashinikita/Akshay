package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion3
{
	@Test
	public void testCase4()
	{
		String actText="abc";
		String expText="ab";
		
		try {
			Assert.assertEquals(actText, expText);
		} catch (Error e) {
			e.printStackTrace();
		}
		System.out.println("Equal Assertion verified");
		
	}

	
}
