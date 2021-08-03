package seliniumpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotclass {
	public static void main(String[] args) throws Throwable {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver cd=new ChromeDriver();
	cd.get("https://www.selenium.dev/");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_PAGE_DOWN);
	robot.keyPress(KeyEvent.VK_PAGE_UP);
}}
