package basicprograms;


import java.util.concurrent.TimeUnit;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autoitclass {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we=driver.findElement(By.id("uploadfile_0"));
		we.click();
		//we.sendKeys("‪C:\\notes\\Manual Testing.pdf");
		Runtime.getRuntime().exec("‪C:\\Users\\nm21185\\Desktop\\scri.exe");
		
	}

}
