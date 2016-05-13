package com.zhaodong.pkg1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_2 {

	@BeforeMethod(groups = "tb")
	public void beforeMethod() {
		System.out.println("BeforeMethod");
		System.out.println("----------------");
	}

	@Parameters({ "zh_bd1", "zh_bd2" })
	@Test(groups = "tb1")
	public void baidu1(String bd1, String bd2) {
		System.out.println("test1");
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println("----------------");

	}

	
	@Test(groups = "tb2")
	public void baidu2() {

		System.out.println("test2");
		System.out.println("----------------");
	}
	
	@Test(groups = "tb4")
	public void baidu4() {

		System.out.println("test4");
		System.out.println("----------------");
	}

	@Test(groups = "tb3")
	public void baidu3() {

		System.out.println("test3");
		System.out.println("----------------");
	}


	@AfterMethod
	public void afterMethod() {
		
	}

}
