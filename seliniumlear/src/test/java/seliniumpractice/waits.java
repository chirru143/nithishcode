//package seliniumpractice;
//
//import java.sql.Time;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class waits {
//	public static WebDriver driver;
//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	// implicity wait
//	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//	 
//	
//		WebDriverManager.chromedriver().setup();
//		  driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://adactinhotelapp.com/");
//	Wait<WebDriver> wait =new FluentWaitt<WebDriver>(driver)
//			.withTimeout(30, TimeUnit.SECONDS)
//			.pollingEvery(5, TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
//	
//
//
