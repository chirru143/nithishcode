package seliniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/");
	driver.findElement(By.id("username")).sendKeys("rameshadepu");
	driver.findElement(By.id("password")).sendKeys("ramesh11");
	driver.findElement(By.id("login")).click();
	WebElement we=driver.findElement(By.xpath("//select[@name='location']"));
	Select sc=new Select(we);
	if(sc.isMultiple())
	{
		System.out.println("the drop down is multiple");
	}
	else
	{
		System.out.println("single dropdown");
	}
	sc.selectByValue("Melbourne");
	Thread.sleep(4000);
	Select sc1=new Select(we);
	//sc1.deselectByValue("Melbourne");
	sc1.selectByIndex(1);
	//sc.selectByIndex(3);
	System.out.println(sc.getOptions().size());
	//
	List<WebElement> text =sc.getOptions();
	for(int i=0;i<text.size();i++)
	{
		String s =text.get(i).getText();
		System.out.println(s);
		}
	}

}
