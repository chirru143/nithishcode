package testngscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert {
	@Test
	public void testsample()
	{
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(2>1);
		sa.assertTrue(3<2);
		sa.assertEquals("abc","abc");
		sa.assertAll();
	}

}
