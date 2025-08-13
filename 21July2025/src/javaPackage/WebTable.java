package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		Thread.sleep(2000);
		
		List<WebElement> allcompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Allcompanies::"+allcompanies.size());
		
		List<WebElement> currentprice=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Price:"+currentprice.size());
		
		String exp = "Kesar Enterprise";
		
		for(int i=0;i<allcompanies.size();i++) 
		{
			if(allcompanies.get(i).getText().equalsIgnoreCase(exp))
			{
				System.out.println(allcompanies.get(i).getText()+"="+currentprice.get(i).getText());
			}
		}
		
		driver.findElement(By.xpath("//a[@href='//money.rediff.com/companies/Restile-Ceramics-Ltd/11540020']")).click();
		Thread.sleep(2000);
		//driver.close();

	}

}
