package invoke.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChromeBrowser {
	//private static DesiredCapabilities caps = null;
	private static String projectpath = System.getProperty("user.dir");
	private static WebDriver driver;
	public static WebDriver Chrome_Browser() {
		// ¹È¸èä¯ÀÀÆ÷µÄdriver´æ·ÅÂ·¾¶
		System.setProperty("webdriver.chrome.driver", projectpath + "/tool/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
	
}