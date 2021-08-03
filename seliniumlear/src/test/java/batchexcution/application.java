package batchexcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class application {
	public static WebDriver driver;
	@Test
	 public void application()
	 {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.snapdeal.com/");
		 driver.close();
		 
		 
		
	}

}
