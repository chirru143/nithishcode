package testngscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class snapdeal {
	public static WebDriver driver;
	@BeforeMethod
	public void open()
	{
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 System.out.println("open");
		 
	}
	@Test(priority=1)
	public void search()  
	{
		WebElement we= driver.findElement(By.name("keyword"));
		we.click();
		we.sendKeys("mobiles");
		 System.out.println("search");
	}
@Test(priority  =2)
public void searching() {
	driver.findElement(By.className("searchTextSpan")).click();;
	System.out.println("searching");
}
@AfterMethod
public void close()
{
	driver.close();
	System.out.println("close");
}

}

