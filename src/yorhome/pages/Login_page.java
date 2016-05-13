package yorhome.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

	@FindBy(xpath = "//input[@id='lusername']")
	public WebElement loginname;

	@FindBy(xpath = "//input[@id='lpassword']")
	public WebElement loginpassword;

	@FindBy(xpath = "//input[@id='dl']")
	public WebElement loginBtn;

	public Login_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Lname(String lusername){
		loginname.sendKeys(lusername);
	}
	
	public void Lpassword(String lpassword){
		loginpassword.sendKeys(lpassword);
	}
	
	public void LBtn(){
		loginBtn.click();
	}
}
