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
		driver.findElement(By.linkText("������Դ")).click();
		Thread.sleep(5000);
		// driver.findElement(")).sendKeys("D:\\Program Files\\test.jpg");
		// ��õ�ǰ���ھ��
		String sreach_handle = driver.getWindowHandle();
		// ������д��ھ��
		Set<String> handles = driver.getWindowHandles();
		// �ж��Ƿ�Ϊע�ᴰ�ڣ�������ע�ᴰ���ϵ�Ԫ��
		for (String handle : handles) {
			if (handle.equals(sreach_handle) == false) {
				// �л���ע��ҳ��
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
				System.out.println("�ȴ�5��");
				// ͨ��Java ��Runtime ģ���getruntime.exec()�������Ե���exe ����ִ��
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