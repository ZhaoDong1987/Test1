package yorhome.testcases;

import java.util.concurrent.TimeUnit;

import invoke.test.StartBrowser;
import invoke.test.Wait;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import yorhome.pages.Home_page;
import yorhome.pages.Login_page;
import yorhome.testdatas.HomeXpath_data;
import yorhome.testdatas.Login_data;

public class LoginCase {
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
		Home_page home_page = new Home_page(driver);
		Login_page login = new Login_page(driver);
		Wait wait = new Wait(driver);
		driver.get("http://www.yorhome.com");
		wait.waitForElementPresent(HomeXpath_data.loginBtn);
		home_page.LBtn();
		wait.waitFor(3000);
		login.Lname(Login_data.LUname);
		wait.waitFor(3000);
		login.Lpassword(Login_data.LPword);
		login.LBtn();
		wait.waitFor(6000);
		
	}

	@AfterMethod
	public void afterLogin() {
		driver.quit();
	}

}
