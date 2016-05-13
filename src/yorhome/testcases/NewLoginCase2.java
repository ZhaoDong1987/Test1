package yorhome.testcases;

import invoke.test.Do;
import invoke.test.StartBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import yorhome.pages.NewHome_page;
import yorhome.pages.NewLogin_page;
import yorhome.testdatas.HomeXpath_data;
import yorhome.testdatas.Login_data;

public class NewLoginCase2 {
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
		NewHome_page newhomepage = new NewHome_page(driver);
		NewLogin_page newlogin = new NewLogin_page(driver);
		Do du = new Do(driver);

		newhomepage.getUrl(HomeXpath_data.url).LBtn();
		newlogin.Lname(Login_data.LUname).Lpassword(Login_data.LPword).LBtn();
		du.waitFor(8000);
		
	}

	@AfterMethod
	public void afterLogin() {
		driver.quit();
	}

}
