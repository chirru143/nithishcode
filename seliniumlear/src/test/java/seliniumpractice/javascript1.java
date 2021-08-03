package seliniumpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript1 {
 public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	JavascriptExecutor jre=(JavascriptExecutor)cd;
	jre.executeScript("window.scrollBy(0,500)");
	
}

}
