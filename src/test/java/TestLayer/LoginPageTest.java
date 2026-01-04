package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	
	@BeforeTest
	public void setUP()
	{
		BaseClass.initialization();
	}
	
	@Test
	public void validateLoginFunctionality()
	{
		String username =prop.getProperty("USERNAME");
		String password=  prop.getProperty("PASSWORD");
		
		LoginPage loginpage = new LoginPage();
		loginpage.loginFunctionality(username, password);
	}
	@AfterTest
	public void tearDown()
	{
	//	driver.quit();
	}
	
	
	

}
