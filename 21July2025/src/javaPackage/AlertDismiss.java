package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDismiss {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Software\\\\\\\\chromedriver-win64\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('confirmButton').click()");
		Thread.sleep(2000);
	    System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		System.out.println("Alert Dismissed");
		
	
		
		
		

	}

}
