package yorhome.pages;

import invoke.test.Do;

import org.openqa.selenium.WebDriver;

import yorhome.testdatas.LoginXpath;

public class NewLogin_page {

	
	private WebDriver driver;
	Do du = new Do(driver);

	public NewLogin_page(WebDriver driver) {
		this.driver = driver;
	}
	
	public NewLogin_page  Lname(String lusername){
		du.what(LoginXpath.name).sendKeys(lusername);
		return this;
	}
	
	public NewLogin_page Lpassword(String lpassword){
		du.what(LoginXpath.password).sendKeys(lpassword);
		return this;
	}
	
	public void LBtn(){
		du.what(LoginXpath.Submit).click();
	}
}
