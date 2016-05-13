package yorhome.testcases;

import invoke.test.Do;
import invoke.test.StartBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import yorhome.pages.Home_page;
import yorhome.pages.Login_page;
import yorhome.testdatas.HomeXpath_data;
import yorhome.testdatas.LoginXpath;
import yorhome.testdatas.Login_data;

public class NewLoginCase {
	private WebDriver driver;
	@BeforeMethod
	public void beforeLogin() {
		StartBrowser browser = new StartBrowser();
		driver = browser.Chrome_Browser(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@Test
	public void Login() {
		
		Home_page homepage = new Home_page(driver);
		Login_page login = new Login_page(driver);
		Do du = new Do(driver);
		driver.get("http://www.yorhome.com");
		du.waitForElement(homepage.loginBtn);
		du.what(HomeXpath_data.loginBtn).click();
		du.waitForElement(login.loginname);
		du.what(LoginXpath.name).sendKeys(Login_data.LUname);
		du.waitFor(3000);
		du.what(LoginXpath.password).sendKeys(Login_data.LPword);
		du.what(LoginXpath.Submit).click();
		du.waitFor(8000);
		
	}

	@AfterMethod
	public void afterLogin() {
		driver.quit();
	}

}
