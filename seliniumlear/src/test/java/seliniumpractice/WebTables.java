package seliniumpractice;

import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTables {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver cd1=new ChromeDriver();
	cd1.get("http://demo.guru99.com/test/web-table-element.php");
WebElement table1=cd1.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody"));

  List<WebElement> row=table1.findElements(By.tagName("tr"));
// int size= row.size();
// System.out.println(size);
	List<WebElement> col=cd1.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th"));
//	int size1=col.size();
//	System.out.println(size1);
	for(int i=1;i<=col.size()-1;i++)
	{
		
		System.out.println(col.get(i).getText());
		//String value = cd1 .findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr[2]/td[3]")).getText(); 
		//System.out.println(value);
		
	}
 
}

}


