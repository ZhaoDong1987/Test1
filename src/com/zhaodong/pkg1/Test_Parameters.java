package com.zhaodong.pkg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Test_Parameters {
	@Parameters({"platform"})
	@BeforeMethod
	public void beforeMethod(String platform) {
		if (platform.equals("ff")) {
			System.out.println("OK!");
		}
		
	}

	@Test
	public void f() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
