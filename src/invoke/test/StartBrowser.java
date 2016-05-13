package invoke.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartBrowser {
	private static DesiredCapabilities caps = null;
	private static String projectpath = System.getProperty("user.dir");
	
	// (1)��ie�����
	public WebDriver IE_Browser(WebDriver IEdriver) {
		caps = DesiredCapabilities.internetExplorer();
		caps.setCapability(InternetExplorerDriver.FORCE_CREATE_PROCESS, false);
		caps.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
		caps.setCapability("ignoreZoomSetting", true);
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		// (3)��ie�������driver���·��
		System.out.println(projectpath);
		System.setProperty("webdriver.ie.driver", projectpath + "/tool/IEDriverServer.exe");
		System.out.println("srart selenium");
		IEdriver = new InternetExplorerDriver(caps);
		IEdriver.manage().window().maximize();
		//this.driver = IEdriver;
		return IEdriver;
		
		
	}
	// (2)�򿪹ȸ������
	public  WebDriver Chrome_Browser(WebDriver CHdriver) {
		// �ȸ��������driver���·��
		System.setProperty("webdriver.chrome.driver", projectpath + "/tool/chromedriver.exe");
		CHdriver = new ChromeDriver();
		CHdriver.manage().window().maximize();
		return CHdriver;
	}
	// (3)�򿪻�������
	public WebDriver FireFox_Browser(WebDriver FFdriver) {
		// (3)�򿪻���������driver���·��
		//System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FFdriver = new FirefoxDriver();
		FFdriver.manage().window().maximize();
		return FFdriver;
	}
}