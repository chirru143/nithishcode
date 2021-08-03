package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboard {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd1=new ChromeDriver();
		cd1.get("https://adactinhotelapp.com/");
	WebElement w=cd1.findElement(By.id("username"));
			w.sendKeys("rameshadepu"+Keys.TAB+"ramesh11"+Keys.ENTER);
	}

}
