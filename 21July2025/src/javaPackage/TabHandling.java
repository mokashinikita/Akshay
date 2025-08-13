package javaPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandling {

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
		Set <String> allWindows =driver.getWindowHandles();
		System.out.println(allWindows);
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window:"+parentWindow);
		
		for(String window:allWindows)
		{
			driver.switchTo().window(window);
			if(parentWindow.equalsIgnoreCase(window))
			{
				System.out.println("Parent Url:"+driver.getCurrentUrl());
			}
			else
			{
				System.out.println("Child Url:"+driver.getCurrentUrl());
			}
		}

	}

}
