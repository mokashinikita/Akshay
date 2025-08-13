package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation3 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		Thread.sleep(2000);
		
		//switching to frame
		
		driver.switchTo().frame(0);
		
		//reference of draggable web element
		WebElement drag= driver.findElement(By.id("draggable"));
		
		//Drag and drop using actions class
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		//to change the position
		act.dragAndDropBy(drag, 150, 80).build().perform();
		
		

		//driver.close();
	}

}
