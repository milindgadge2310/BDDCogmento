package TestLayer;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;
import UtilityLayer.ExcelReader;

public class ContactPageTest extends BaseClass {
	
	private static ContactPage contactpage;

	@Test(dataProvider = "TestData")
	public void validateNewContact(String Fname, String Lname, String Email, String Status)
			throws InterruptedException {
		contactpage = new ContactPage();
		contactpage.createNewContact(Fname, Lname, Email, Status);
	}

	@DataProvider(name = "TestData")
	public Object[][] getTestData() {
		String Path = System.getProperty("user.dir") + "//src//test//resources//TestData//TestDatamilind.xlsx";

		ExcelReader excel = new ExcelReader(Path);

		Object[][] data = excel.getAllSheetTestData(0);

		return data;
	

	}
}
