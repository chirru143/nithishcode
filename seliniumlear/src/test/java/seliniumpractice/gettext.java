package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gettext {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
	d.get("https://adactinhotelapp.com/index.php");	
String bcb=d.findElement(By.id("username")).getAttribute("name");
System.out.println(bcb);

	}

}
