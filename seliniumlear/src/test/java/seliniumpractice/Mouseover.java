package seliniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {
	public void mouse()throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.orangehrm.com/");
		WebElement c=cd.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[1]/li[2]/a"));
		Actions ac=new Actions(cd);
		ac.moveToElement(c).perform();
		Thread.sleep(2000);
		cd.findElement(By.linkText("Case Studies")).click();
	}
		public void doubleclick() {
			
			WebDriverManager.chromedriver().setup();
			ChromeDriver cd1=new ChromeDriver();
			cd1.get("https://adactinhotelapp.com/");
			WebElement w=cd1.findElement(By.id("username"));
					w.sendKeys("nitheesh");
			Actions a= new Actions(cd1);
			a.doubleClick(w).perform();
			//right click
			a.contextClick(w).perform();
		}
			public void draganddrop(){
				
				WebDriverManager.chromedriver().setup();
				ChromeDriver cd2=new ChromeDriver();
				cd2.get("http://demo.guru99.com/test/drag_drop.html");
				cd2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				WebElement accountname=cd2.findElement(By.xpath("//*[@id=\"bank\"]/li"));
				WebElement amount=cd2.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
				Actions a2=new Actions(cd2);
				a2.dragAndDrop(accountname, amount).perform();
			}
			
		public static void main(String[] args) throws Throwable {
			Mouseover m=new Mouseover();
		m.mouse();
m.doubleclick();
		m.draganddrop();
		}
	
		
	}
	


