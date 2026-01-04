package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	public static void selectDropDown(List<WebElement> lists,String Expectedvalue)
	{
		for(WebElement abc : lists)
		{
			String actualValue  =abc.getText();
			if(actualValue.equalsIgnoreCase(Expectedvalue))
			{
				abc.click();
				break;
			}
		}
	}

}
