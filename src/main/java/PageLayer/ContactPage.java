package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class ContactPage extends BaseClass{
	

	@FindBy(xpath = "//a[@href='/contacts']")
	private WebElement contactLink;

	@FindBy(xpath = "//a[@href='/contacts/new']")
	private WebElement createbutton;

	@FindBy(name = "first_name")
	private WebElement firstname;

	@FindBy(name = "last_name")
	private WebElement lastname;

	@FindBy(xpath = "//label[text()='Email']/following-sibling::div/descendant::input[@name='value']")
	private WebElement emailId;

	@FindBy(xpath = "//label[text()='Status']/following-sibling::div")
	private WebElement statusDropDown;

	@FindBys(@FindBy(xpath = "//div[@name='status']/child::span"))
	private List<WebElement> statusList;

	@FindBy(xpath = "//button[text()='Save']")
	private WebElement saveButton;
	
	// initialize the OR using PageFactory.initElements() method
	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void createNewContact(String FirstName, String LastName, String Email, String Status)
			throws InterruptedException {
		Thread.sleep(2000);
		Wait.click(contactLink);
		Thread.sleep(2000);
		Wait.click(createbutton);
		Thread.sleep(2000);

		Wait.sendKeys(firstname, FirstName);
		Wait.sendKeys(lastname, LastName);
		Wait.sendKeys(emailId, Email);
		Thread.sleep(2000);
		Wait.click(statusDropDown);
		Thread.sleep(2000);

		HandleDropDown.selectDropDown(statusList, Status);
		Thread.sleep(2000);
		Wait.click(saveButton);
		Thread.sleep(2000);
	}

}
