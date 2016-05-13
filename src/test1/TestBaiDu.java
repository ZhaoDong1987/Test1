package test1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBaiDu {
	public static void main(String[] args) {
		/*System.out.println("srart selenium");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com/");
		WebElement txtbox=driver.findElement(By.id("kw"));
		txtbox.sendKeys("selenium java");
		WebElement btn=driver.findElement(By.id("su"));
		btn.click();
		driver.close();
		System.out.println("end selenium");*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.baidu.com");
		try {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("f:\\screenshot.png"));
		} catch (Exception e) {
		e.printStackTrace();
		}
		driver.quit();
	}
}
