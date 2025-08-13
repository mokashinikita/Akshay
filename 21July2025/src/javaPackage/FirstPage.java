package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPage {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Shinde");
		driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("6");
		driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("May");
		driver.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1997");
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][@name='reg_email__']")).sendKeys("098765421");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ytrds");
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

