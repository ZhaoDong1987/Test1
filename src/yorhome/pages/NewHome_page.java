package yorhome.pages;

import invoke.test.Do;

import org.openqa.selenium.WebDriver;

import yorhome.testdatas.HomeXpath_data;

public class NewHome_page {

	private WebDriver driver;
	Do du = new Do(driver);



	public NewHome_page(WebDriver driver) {
		this.driver = driver;
	}
	

	public NewHome_page getUrl(String url){
		driver.get(url);
		return this;
	} 
	public void LBtn(){
		du.what(HomeXpath_data.loginBtn).click();
	}
}
