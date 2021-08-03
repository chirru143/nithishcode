package seliniumpractice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		JavascriptExecutor jse = (JavascriptExecutor) cd;
		jse.executeScript("window.scrollBy(218,579)");
		// Thread.sleep(2000);
//		jse.executeScript("window.scrollBy(0,-1000)","");
//		Thread.sleep(2000);
		/*
		 * WebElement element=cd.findElement(By.id("newWindowBtn"));
		 * jse.executeScript("arguments[0].scrollIntoView();", element);
		 * 
		 * WebElement element=cd.findElement(By.id("newWindowBtn")); Point location=
		 * element.getLocation(); int x=location.getX(); int y= location.getY();
		 * System.out.println("the cordinates of x"+x+"the cordinates of y is "+y);
		 */
	}

}
