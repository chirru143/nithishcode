package batchexcution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login  {
	public static WebDriver driver;
@Test	
public void login()
{
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.get("https://www.snapdeal.com/");
	 driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/span[1]")).click();
	 //driver.findElement(By.linkText("login")).click();
	
}
}
