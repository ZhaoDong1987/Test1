package yorhome.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import yorhome.testdatas.HomeXpath_data;

public class Home_page {

	@FindBy(xpath = HomeXpath_data.loginBtn)
	public WebElement loginBtn;

	@FindBy(xpath = HomeXpath_data.center)
	public WebElement center;

	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void LBtn(){
		loginBtn.click();
	}
}
