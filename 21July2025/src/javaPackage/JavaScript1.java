package javaPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1
{

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	
		Thread.sleep(2000);
		
		//JavaScriptExecutor
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		//locate web element using javascript
		jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
		
		jse.executeScript("document.getElementsByName('pass')[0].value='1234'");
		jse.executeScript("document.getElementsByName('login')[0].click()");
		
		//scroll down using javascript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		

		//Scroll up using JavaScript
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-500)"); //or(500,0)
	}

}

