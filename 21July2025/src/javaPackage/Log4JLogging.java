package javaPackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging
{

	public static void main(String[] args)
	{
		//Create Logger Instance
		Logger logger=Logger.getLogger("Log4JLogging");
		
		//Configure log4j.properties file
		PropertyConfigurator.configure("D:\\Software\\Java\\workspace\\21July2025\\Repository\\log4j.properties");
		
		//Open Browser Instance
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		logger.info("Opened Browser Instance");
		
		//Maximize the window
		driver.manage().window().maximize();
		logger.info("Window.maximize");
		
		//Launch the application
		driver.get("https://www.facebook.com/");
		logger.info("Application launched");
		
		//check if the web element is displayed or not
		try{
			driver.findElement(By.id("emails")).isDisplayed();
			 logger.info("Web element found");
		   }catch(Exception e)
		{
			   logger.info("Failure alert:Web element not found");
		}
		

	}

}
