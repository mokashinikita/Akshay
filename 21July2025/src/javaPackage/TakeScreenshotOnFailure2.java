package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 
{
	TakeScreenshotOnFailure1 t1=new TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		t1.driver=new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		t1.driver.findElement(By.id("emailwrong")).sendKeys("12345");
	}
	
	@AfterMethod
	public void TakeScreenshot(ITestResult result2) throws Exception
	{
		t1.captureScreenshot(result2);
	}

}
