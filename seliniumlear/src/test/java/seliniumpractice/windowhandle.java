package seliniumpractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String parent =cd.getWindowHandle();
    System.out.println("parent window -"+parent);
		cd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		cd.findElement(By.id("newWindowBtn")).click();
	Set<String>	handles= cd.getWindowHandles();
	for(String handle:handles)
	{
		System.out.println(handle);
		
	if(!handle.equalsIgnoreCase(parent))
	{cd.switchTo().window(handle);
		cd.findElement(By.id("firstName")).sendKeys("nitjee");
	}
		cd.switchTo().window(parent);
		cd.findElement(By.id("name")).sendKeys("ddfff");
	}}}


