package Sample_Test_NG.Sample_Test_NG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demotestng {
	@Test
	public void testnew()
	{
		System.out.println("beformethod");
	}
	@BeforeMethod
	public void car()
	{
		System.out.println("beformethod");
	}
	@AfterMethod
	public void bike()
	{
		System.out.println("aftermethod");
	}

}

}
