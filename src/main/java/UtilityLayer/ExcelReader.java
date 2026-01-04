package UtilityLayer;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass {
	
	
	private static XSSFWorkbook workbook;

	public ExcelReader(String Excelpath) {
		try {
			FileInputStream fis = new FileInputStream(Excelpath);
			workbook = new XSSFWorkbook(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getTotalRowCount(int sheetIndex) {
		return workbook.getSheetAt(sheetIndex).getLastRowNum() + 1;
	}

	public int getTotalColumnCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}

	public Object getSheetTestData(int sheetindex, int rows, int cells) {
		XSSFSheet sheet = workbook.getSheetAt(sheetindex);
		String testdata = sheet.getRow(rows).getCell(cells).getStringCellValue();
		return testdata;
	}

	public Object[][] getAllSheetTestData(int sheetIndex) {
		int rows = getTotalRowCount(sheetIndex);
		int cells = getTotalColumnCount(sheetIndex);

		Object[][] data = new Object[rows][cells];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cells; j++) {
				data[i][j] = getSheetTestData(sheetIndex, i, j);
			}
		}

		return data;
	}

}
