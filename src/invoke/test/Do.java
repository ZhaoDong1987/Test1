package invoke.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Do {
	private WebDriver driver;
	private Wait wait;

	public Do(WebDriver driver) {
		this.driver = driver;
		wait = new Wait(driver);
	}

	public WebElement what(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public List<WebElement> whats(String xpaths) {
		return driver.findElements(By.xpath(xpaths));
	}

	public void waitForElementPresent(String xpath) {
		wait.waitForElementPresent(xpath);
	}

	public void waitForElement(WebElement element){
		wait.waitForElement(element);
	}
	public void waitFor(long timeout) {

		wait.waitFor(timeout);

	}
	
}
