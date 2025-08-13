package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception 
	{
		//Specify the location of Excel File
		
		File src=new File("D:\\Short Notes.xlsx");
		
		//Loading the file 
		FileInputStream fis=new FileInputStream(src);
		
		//Load workbook
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//Load worksheet
		XSSFSheet sh= wb.getSheet("Sheet1");
		//XSSFSheet sh2= wb.getSheet("Sheet2");
		
		
		
		
		//Print the loaded sheet name
		System.out.println(sh.getSheetName());
		
		//Print merged cell
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Print Check Java installed or not from ExcelSheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		//Print float/double from Excel sheet
		System.out.println(sh.getRow(1).getCell(3).getNumericCellValue());
		
		//Print int from Excel sheet
		System.out.println((int)sh.getRow(1).getCell(3).getNumericCellValue());
		
		//Print total no of rows -1st way
		System.out.println("Total rows::"+sh.getPhysicalNumberOfRows());
		
		//print total number of rows-2nd way
		System.out.println("Total Rows:"+(sh.getLastRowNum()+1));
		
		//print total no of columns
		System.out.println("Total columns:"+sh.getRow(2).getPhysicalNumberOfCells());
		
		//print total number of columns-2nd way
		System.out.println("Total Columns:"+sh.getRow(2).getLastCellNum());
		
		//Real Time Implementation
		System.setProperty("webdriver.chrome.driver", "D:\\\\Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(2000);
		
		//Enter UserName from Excel File
		String abc=sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(abc);
		
	}

}
