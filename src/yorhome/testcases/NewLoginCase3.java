package yorhome.testcases;

import invoke.test.Do;
import invoke.test.StartChromeBrowser;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import yorhome.pages.Home_page;
import yorhome.pages.Login_page;
import yorhome.testdatas.HomeXpath_data;
import yorhome.testdatas.LoginXpath;
import yorhome.testdatas.Login_data;

public class NewLoginCase3 {
	private WebDriver driver;

	@BeforeMethod
	public void beforeLogin() {

		driver = StartChromeBrowser.Chrome_Browser();

	}

	@Test
	public void Login() {

		Home_page homepage = new Home_page(driver);
		Login_page login = new Login_page(driver);
		Do du = new Do(driver);
		driver.get("http://www.kuaiyoujia.com");
		du.waitForElement(homepage.loginBtn);
		du.what(HomeXpath_data.loginBtn).click();
		du.waitForElement(login.loginname);
		du.what(LoginXpath.name).sendKeys(Login_data.LUname);
		du.waitFor(3000);
		du.what(LoginXpath.password).sendKeys(Login_data.LPword);
		du.what(LoginXpath.Submit).click();
		du.waitForElementPresent(HomeXpath_data.center);
		String username = du.what(HomeXpath_data.center).getText();
		System.out.println(username);
		du.waitFor(3000);

	}

	@AfterMethod
	public void afterLogin() {
		driver.quit();
	}

}
