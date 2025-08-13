package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		//switching to frame
		
		driver.switchTo().frame(0);
		
		//reference of draggable web element
		WebElement drag= driver.findElement(By.id("draggable"));
		
		//reference of droppable web element
		WebElement drop= driver.findElement(By.id("droppable"));
		
		//Drag and drop using actions class
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		

		//driver.close();
	}

}
