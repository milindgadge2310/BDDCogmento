package PageLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import BaseLayer.BaseClass;

public class ExcelReder extends BaseClass {
	
	public static void excelRed() throws FileNotFoundException
	{
	File f=new File("C:\\Users\\OM\\git\\BDDCogmento\\src\\test\\resources\\TestData\\TestDatamilind.xlsx");
	FileInputStream fis=new FileInputStream(f);
	//XSSFWorkBook xssfwork=new XSSFWorkBook(fis);

	}
	
	public static void handleDropDown()
	{
		System.out.println("DropDown Handled");
	}
	
	public static void handleFrame()
	{
		System.out.println("frame handle");
	}
	
     
	public static void handleFluentWait()
	{
		System.out.println("Fluent wait");
	}

	public static void handleAlert()
	{
		System.out.println("Alert handled Sucesssfully");
	}
	public static void handleConflict()
	{
		System.out.println("Conflict handled Sucesssfully");
	}

}
