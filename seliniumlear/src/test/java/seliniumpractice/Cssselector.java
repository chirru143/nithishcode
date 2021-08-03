package seliniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cssselector {
	public static WebDriver driver;
	public static void main(String[] args) throws Throwable   {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		//Thread.sleep(4000);
		//String we = driver.findElement(By.linkText("New User Register Here")).getAttribute("href");
		//String s=we.getText();
		//System.out.println(we);
//String an=driver.findElement(By.id("login")).getAttribute("name");
	//System.out.println(an);	
	WebElement an=driver.findElement(By.id("login"));
	String s=an.getText();
	System.out.println(s);		
			
		//System.out.println("this is "+ss);
		//	System.out.println("dsgsudgyudg");
			Thread.sleep(5000);
			driver.close();
	}

}
