package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/clothing-and-accessories/topwear/pr?sid=clo,ash&p[]=facets.ideal_for%255B%255D%3DMen&p[]=facets.ideal_for%255B%255D%3Dmen&otracker=categorytree&fm=neo%2Fmerchandising&iid=M_dd0a1434-1921-41c3-8f67-6bf91bc5e0d1_1_372UD5BXDFYS_MC.AHHHWF67UPNB&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Fashion~Men%27s%2BTop%2BWear~All_AHHHWF67UPNB&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L2_view-all&cid=AHHHWF67UPNB");
		Thread.sleep(2000);

		WebElement electro=driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(electro).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Vivo']")).click();
		
		//Keyboard operations
		
		WebElement men=driver.findElement(By.xpath("//*[text()='Men']"));
		act.sendKeys(men,Keys.ENTER).build().perform();
		System.out.println("Men option clicked");
		Thread.sleep(2000);
		
		
		//Right click on webpage
		
		act.contextClick(electro).build().perform();
		
	}

}
