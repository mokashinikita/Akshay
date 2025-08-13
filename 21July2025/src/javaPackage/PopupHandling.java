package javaPackage;

import java.security.AllPermission;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Software\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows/");
		Thread.sleep(2000);
		
		//Step 1 - Tab Handling
		
		driver.findElement(By.id("tabButton")).click();
		
		//Get the total no of open tabs
		
		Set<String>allWindowId=driver.getWindowHandles();
		System.out.println(allWindowId);
		
		String parentWinow=driver.getWindowHandle();
		System.out.println("Parent window:"+parentWinow);
		
		for(String windows : allWindowId)
		{
			driver.switchTo().window(windows);
			if(windows.equalsIgnoreCase(parentWinow))
			{
				System.out.println("Parent Title:"+driver.getTitle());
			}
			else
			{
				System.out.println("Child Url::"+driver.getCurrentUrl());
			}
		}
				
				
		
		
	
	}

}
