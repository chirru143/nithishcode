package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nestedframe {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.hyrtutorials.com/p/frames-practice.html");
		cd.findElement(By.id("name")).sendKeys("nitheesh");
		cd.switchTo().frame("frm3");
		cd.switchTo().frame("frm2");
cd.findElement(By.id("firstName")).sendKeys("nitheesh");
cd.switchTo().parentFrame();
cd.findElement(By.id("name")).sendKeys("vsus");
cd.switchTo().defaultContent();
cd.findElement(By.id("name")).clear();
	}

}
