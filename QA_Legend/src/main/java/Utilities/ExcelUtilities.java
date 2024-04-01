package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static FileInputStream f;
	public  String getString(int i, int j, String filePath, String sheet) throws IOException
	{
		f = new FileInputStream(System.getProperty("user.dir")+ filePath);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
	    Cell c = r.getCell(j);
 
		return c.getStringCellValue();
	}
	public String getNumeric(int i, int j, String filePath, String sheet) throws IOException
	{
		f = new FileInputStream(System.getProperty("user.dir")+ filePath);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		int value = (int) c.getNumericCellValue();
		return String.valueOf(value);
	}
	public String getDateValue(int i, int j, String filePath, String sheet) throws IOException
	{
		f = new FileInputStream(System.getProperty("user.dir")+ filePath);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);
		Row r = sh.getRow(i);
		Cell c = r.getCell(j);
		Date date = c.getDateCellValue();
		return String.valueOf(date);
	}
}
