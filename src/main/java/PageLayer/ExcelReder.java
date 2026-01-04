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
}
