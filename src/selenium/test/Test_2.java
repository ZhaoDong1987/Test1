package selenium.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_2 {
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		/*
		 * StartBrowser browser = new StartBrowser(); driver =
		 * browser.Chrome_Browser(driver);
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */
	}

/*	@Test
	public void baidu() {
		driver.get("http://www.baidu.com");
		Wait wait = new Wait(driver);
		driver.findElement(By.xpath("//input[@id='kw']")).clear();
		driver.findElement(By.xpath("//input[@id='kw']")).sendKeys("testng");
		wait.waitFor(2000);
		String title = driver.getTitle();
		System.out.println(title);
	}*/
	
	@Parameters({"bd1","bd2"})
	@Test
	public void baidu1(String bd1,String bd2) {
		
		System.out.println("test1");
		System.out.println(bd1);
		System.out.println(bd2);
		
	}
	@Parameters({"platform"})
	@Test
	public void baidu2(String platform) {
		
		System.out.println(platform);
	}

	@Test
	public void baidu3() {

		System.out.println("test3");
	}

	@AfterMethod
	public void afterMethod() {
		//driver.quit();
	}

}
