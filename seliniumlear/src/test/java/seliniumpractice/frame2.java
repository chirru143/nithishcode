package seliniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame2 {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.hyrtutorials.com/p/frames-practice.html");
		dr.manage().window().maximize();
//		List<WebElement> ch=dr.findElements(By.tagName("iframe"));
//	System.out.println(ch.size());
		dr.findElement(By.id("name")).sendKeys("nitheesh");
		dr.switchTo().frame("frm2");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	dr.findElement(By.id("firstName")).sendKeys("firstName");
	dr.switchTo().defaultContent();
	dr.findElement(By.id("name")).sendKeys("chdhd");
	}

}
