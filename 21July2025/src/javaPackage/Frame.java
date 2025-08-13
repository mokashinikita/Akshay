package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		
		Thread.sleep(2000);
		
		//Find the total no of frames present on webpage
		int allframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames:"+allframes);
		
		//Check if the element is present or not
		
		for(int i=0;i<allframes;i++)
		{
			driver.switchTo().frame(i);
			driver.switchTo().frame(i);
			
			String exp="Open Paytm App";
			String actual = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
			
			if(actual.equalsIgnoreCase(exp))
			{
				System.out.println("Element found");
				break;
			}
			else
			{
				System.out.println("Element Not found");
			}
		}
	}

}
