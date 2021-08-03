package testngscripts;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	@Test(priority = -1,enabled = true)
	public void demo1() {
		System.out.println("demo1");
		Reporter.log("jnnnr");
		assertEquals(5, 3);
		System.out.println("chintu");
		
	}
	@Test(priority = -2,enabled =true)
	public void run() {
		Reporter.log("run",true);
	}
	@Test(priority = 2,invocationCount = 6)
	public void sent()
	{
		Reporter.log("sent the message",true);
	}

}
