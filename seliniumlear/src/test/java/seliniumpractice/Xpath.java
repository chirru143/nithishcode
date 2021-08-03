package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
	public static WebDriver driver;
	public static void absolutexpath() throws InterruptedException
	{WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("/html/body/table[2]/tbody[1]/tr[1]/td[2]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("rameshadepuu");
		Thread.sleep(5000);
		driver.close();
	}

	public static void realtivexpath() throws Throwable
	{	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).sendKeys("2556555");
		System.out.println("realtivexpath");
		Thread.sleep(5000);
		driver.close();
	}
	public static void xpathwithattribute() throws Throwable
	{	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("4654654654");
		Thread.sleep(5000);
		System.out.println("xpathwithattribute");
		driver.close();
	}
	public static void xpathwithcontains() throws Throwable
	{	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("4654654654");
		System.out.println("xpathwithcontains");
		Thread.sleep(5000);
		driver.close();
	}
	public static void xpathwithtEXT() throws Throwable
	{	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[text()='New User Register Here']")).click();
		System.out.println("xpathwithtEXT");
		Thread.sleep(5000);
		driver.close();
	}
	public static void xpathcandt() throws Throwable
	{	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'New User Register Here')]")).click();
		Thread.sleep(5000);
		System.out.println("xpathcandt");
driver.close();

	}
	public static void main(String[] args) throws Throwable {
		absolutexpath();
		realtivexpath();
		 xpathwithattribute();
		 xpathwithcontains();
		 xpathwithtEXT();
		 xpathcandt();
	}
	
	
	
}
