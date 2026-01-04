package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass {
	
	public static WebElement visiblityOf(WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement wb1 =wait.until(ExpectedConditions.visibilityOf(wb));
		return wb1;
		
		
	}
	public static void click(WebElement wb) {
		// create Object of WebDriverWait by passing WebDriver instance and time in
		// seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		// use until() method and inside the Method use
		// ExpectedConditions.elementToBeClickable() method by passing WebElement
		// instance
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
	}

	// create sendKeys() static method with WebElement arg and String args
	public static void sendKeys(WebElement wb, String value) {
		Wait.visiblityOf(wb).sendKeys(value);
	}

	// create isDisplayed() static method with WebElement arg and boolean return
	// type
	public static boolean isDisplayed(WebElement wb) {
		return Wait.visiblityOf(wb).isDisplayed();
	}

}
