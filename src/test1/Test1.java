package test1;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	  private WebDriver driver;
	  private String baseUrl;
	  //private boolean acceptNextAlert = true;
	 // private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    baseUrl = "http://www.yorhome.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	  }

	  @Test
	  public void testUntitled2() throws Exception {
	    driver.get(baseUrl);
	    //Thread.sleep(3000);
	    driver.findElement(By.className("colf30im")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.id("lusername")).clear();
	    driver.findElement(By.id("lusername")).sendKeys("18611896092");
	    driver.findElement(By.id("lpassword")).clear();
	    driver.findElement(By.id("lpassword")).sendKeys("123qwe");
	    driver.findElement(By.id("dl")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector("html body div.header div.site_nav div.w980.clearFix ul.sub_nav.fr.clearFix li.fl a.xhl")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.linkText("发布房源")).click();
	    Thread.sleep(5000);
	   // driver.findElement(")).sendKeys("D:\\Program Files\\test.jpg");
	    WebElement Upload= driver.findElement(By.xpath(".//*[@id='file_upload_-button']"));
	    String file="D:\\Program Files\\test.jpg"	;  
	    Upload.sendKeys(file);
	  }
}