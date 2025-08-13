package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/audio-video/pr?sid=0pm&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_1d3c49cf-b79a-4b5e-a28e-da84b999b2a6_1_372UD5BXDFYS_MC.9JGNW7M0TUHD&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Electronics~Audio~All_9JGNW7M0TUHD&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L2_view-all&cid=9JGNW7M0TUHD");
		Thread.sleep(2000);
		
		
		//Create Electronics WebElement reference
		
		WebElement electro=driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		//Mouse Simulation using Actions class
		
		
		Actions act=new Actions(driver);
		
		//Mouse hover to Electronics
		act.moveToElement(electro).build().perform();
		
		driver.findElement(By.xpath("//*[text()='Realme']")).click();
		
		//Keyboard operations
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		act.sendKeys(home,Keys.ENTER).build().perform();
		System.out.println("Home option clicked");
		driver.findElement(By.xpath("//*[text()='Beds']")).click();
		
		//Right click on webpage
		act.contextClick(electro).build().perform();
	}

}
	