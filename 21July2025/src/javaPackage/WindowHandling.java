package javaPackage;

import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Software\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows/");
		Thread.sleep(2000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("document.getElementById('windowButton').click()");
		
		Set<String>allWindow=driver.getWindowHandles();
		System.out.println(allWindow);
		String ParentWindow=driver.getWindowHandle();
		System.out.println("ParentWindow:"+ParentWindow);
		
		for(String str : allWindow)		
		{
			driver.switchTo().window(str);
			if(str.equalsIgnoreCase(ParentWindow))
			{
				System.out.println("Parent url:"+driver.getCurrentUrl());
				System.out.println("Parent Title:"+driver.getTitle());
			}
			else
			{
				System.out.println("Child url:"+driver.getCurrentUrl());
				System.out.println("Child Title:"+driver.getTitle());
			}
			
		}
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Window & Tabs Handled");
	}

}
