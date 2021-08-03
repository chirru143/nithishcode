package seliniumpractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandle2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String parent=cd.getWindowHandle();
		System.out.println(parent);
		cd.findElement(By.linkText("OrangeHRM, Inc")).click();
		cd.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Set<String> hamdle=cd.getWindowHandles();
		for(String handle:hamdle)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parent))
			{cd.switchTo().window(handle);
			
				cd.findElement(By.xpath("//*[@id=\"header-navbar\"]/ul[3]/li[1]/a")).click();
			}
			cd.switchTo().window(parent);
			cd.findElement(By.id("txtUsername")).sendKeys("hfuhfu");
		}
		
	}

}
