package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.HomePage;

public class HomePageTest extends BaseClass {
	
	private static HomePage homepage;

	@Test(priority = 1)
	public void validateHomePageLogo() {
		homepage = new HomePage();
		boolean actualStatus = homepage.checkLogoStatus();
		Assert.assertTrue(actualStatus);
	}

	@Test(priority = 2)
	public void validateHomePageTitle() {
		String actualTitle = homepage.getHomePageTitle();
		Assert.assertNotEquals(actualTitle, "Cogmento CRM");
	}

	@Test(priority = 3)
	public void validateHomePageUrl() {
		boolean actualdomainName = homepage.getHomePageUrl().contains("ui.cogmento");
		Assert.assertEquals(actualdomainName, true);
	}

}
