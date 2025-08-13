package javaPackage;


import org.testng.annotations.*;

public class TestNG1
{
	//c b e h A1 d k h a1 d k h a2 d k h n d k g f i
	
	
	@Test
	public void a2()
	{
		System.out.println("Hello a2 Test Method");
	}
	
	@BeforeTest
	public void b()
	{
		System.out.println("Hello b Method");//2
	}
	
	
	@BeforeSuite
	public void c()
	{
		System.out.println("Hello c Method");//1
	}
	
	@AfterMethod
	public void d()
	{
		System.out.println("Hello d Method");//6
	}
	
	@BeforeClass
	public void e()
	{
		System.out.println("Hello e Method");//3
	}
	
	@AfterTest
	public void f()
	{
		System.out.println("Hello f Method");
	}
	@Test
	public void n()
	{
		System.out.println("Hello n Test Method");
	}
	
	@AfterMethod
	public void k()
	{
		System.out.println("Hello k Method");//6
	}
	
	@AfterClass
	public void g()
	{
		System.out.println("Hello g Method");
	}
	
	@BeforeMethod
	public void h()
	{
		System.out.println("Hello h Method");//4
	}
	
	@Test
	public void b1()
	{
		System.out.println("Hello b1 Test Method");
	}
	
	@AfterSuite
	public void i()
	{
		System.out.println("Hello i Method");
	}
	
	@AfterSuite
	public void a6()
	{
		System.out.println("Hello a6 Method");
	}
		
	@Test
	public void a1()
	{
		System.out.println("Hello a1 Test Method");
	}
	
	@Test
	public void A1()
	{
		System.out.println("Hello A1 Test Method");//5
	}
	
	public static void main(String[] args) {
		System.out.println("Hello main method");
	}
	
	//c b e h A1 d k h a1 d k h a2 d k h b1 d k h n d k g f i
	
	
	
	
}
