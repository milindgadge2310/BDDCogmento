package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.Wait;

public class HomePage extends BaseClass{

	// create OR using POM with Page Factory

	@FindBy(xpath = "//div[@class='header item']")
	private WebElement logo;

	// initialize the OR using PageFactory.initElements() method
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// create associated method for each and every OR without entering test data.
	public boolean checkLogoStatus() {
		return Wait.isDisplayed(logo);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getHomePageUrl() {
		return driver.getCurrentUrl();
	}


}
