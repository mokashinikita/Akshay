package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception
	{
		//Specify the location of config properties file
		File src1 = new File("D:\\Software\\Java\\workspace\\21July2025\\Repository\\config.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis1=new FileInputStream(src1);
		//Create properties class object to read properties file
		Properties pro1=new Properties();
		pro1.load(fis1);
		 
		//Specify the location of config properties file
		File src2=new File("D:\\Software\\Java\\workspace\\21July2025\\Repository\\locators.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis2=new FileInputStream(src2);
		//Create properties class object to read properties file
		Properties pro2=new Properties();
		pro2.load(fis2);
		
		//Specify the location of testdata properties file
		File src3=new File("D:\\Software\\Java\\workspace\\21July2025\\Repository\\testdata.properties");
		//Create FileInputStream class object to load the file
		FileInputStream fis3=new FileInputStream(src3);
		//Create the properties class object to read the properties file
		Properties pro3=new Properties();
		pro3.load(fis3);
		
		//setting the property of chrome driver and passing chromedriver path
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pro1.getProperty("URL_1"));
		Thread.sleep(2000);
		
		//getProperty() method will accept key and return value of that key
		driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
		driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));
		Thread.sleep(2000);
		driver.close();
		
	}

}
