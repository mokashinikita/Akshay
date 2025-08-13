package javaPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 
{
	@Test
	public void testCase1() throws Exception
	{
		String expText="Facebook helps you connect and share with the people in your life.";
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		
		String actText=driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).getText();
		
		Assert.assertEquals(actText, expText);
		System.out.println("Equal Assetion verified");
		
		Assert.assertFalse(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isSelected());
		System.out.println("False Assetion verified");
		
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]")).isDisplayed());
		System.out.println("True Assetion verified");
		
	}
}
