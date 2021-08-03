package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class openbrowser {
	public static WebDriver driver;
	public static void open(){
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
	driver.manage().window().maximize();
	
	}
	public static void  application() throws Throwable {
		driver.get("https://mail.google.com/mail/u/0/#inbox");
//		Thread.sleep(2000);
//		driver.navigate().to("https://accounts.google.com/");
//	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
//	driver.navigate().forward();
//	Thread.sleep(2000);
//	Dimension d=new Dimension(500,500);
//	driver.manage().window().setSize(d);
//	
//	driver.navigate().refresh();
//	driver.navigate().back();
	}
	public static void findelement() {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("medi");
		
	}
	
	
		public static void main(String[] args) throws Throwable {
     open();
     application();
     findelement();
			
	}

}
