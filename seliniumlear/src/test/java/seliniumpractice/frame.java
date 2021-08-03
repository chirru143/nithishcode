package seliniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {
	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver dr=new ChromeDriver();
	dr.get("https://www.naukri.com/");
	Thread.sleep(5000);
	List<WebElement> frame =dr.findElements(By.tagName("iframe"));
	  System.out.println(frame.size());
	  
//	  dr.switchTo().frame(1);
//	  dr.findElement(By.xpath("/html/body/a/img")).click();
//	

	}

}
