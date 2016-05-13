package test1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	/*
	 * private String baseUrl; private boolean acceptNextAlert = true; private
	 * StringBuffer verificationErrors = new StringBuffer();
	 */

	public static void main(String[] arg) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.yorhome.com/");
		// Thread.sleep(3000);
		driver.findElement(By.className("colf30im")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("lusername")).clear();
		driver.findElement(By.id("lusername")).sendKeys("18611896092");
		driver.findElement(By.id("lpassword")).clear();
		driver.findElement(By.id("lpassword")).sendKeys("123qwe");
		driver.findElement(By.id("dl")).click();
		Thread.sleep(5000);
		driver.findElement(
				By.cssSelector("html body div.header div.site_nav div.w980.clearFix ul.sub_nav.fr.clearFix li.fl a.xhl"))
				.click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("发布房源")).click();
		Thread.sleep(5000);
		// driver.findElement(")).sendKeys("D:\\Program Files\\test.jpg");
		// 获得当前窗口句柄
		String sreach_handle = driver.getWindowHandle();
		// 获得所有窗口句柄
		Set<String> handles = driver.getWindowHandles();
		// 判断是否为注册窗口，并操作注册窗口上的元素
		for (String handle : handles) {
			if (handle.equals(sreach_handle) == false) {
				// 切换到注册页面
				driver.switchTo().window(handle);
				System.out.println("now register window!");
				Thread.sleep(2000);
				WebElement Upload = driver.findElement(By
						.xpath(".//*[@id='file_upload_-button']"));
				/*
				 * String file = "test.jpg"; Upload.sendKeys(file);
				 */

				Upload.click();
				Thread.sleep(5000);
				System.out.println("等待5秒");
				// 通过Java 的Runtime 模块的getruntime.exec()方法可以调用exe 程序并执行
				Runtime rn = Runtime.getRuntime();
				try {
					String str = "F://upfile.exe";
					rn.exec(str);
				} catch (Exception e) {
					System.out.println("Error to run the exe");
				}
				// Thread.sleep(10000);
			}
			// driver.quit();
		}
	}
}