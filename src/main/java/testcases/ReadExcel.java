package testcases;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook = null;
		
		try
		{
			wbook= new XSSFWorkbook(new FileInputStream("./data/TC00.xlsx"));
			XSSFSheet sheet1 = wbook.getSheetAt(0);
			String stringCellValue = sheet1.getRow(0).getCell(1).getStringCellValue();
			System.out.println(stringCellValue);
			int totalrow = sheet1.getLastRowNum();// this will start the index with o
			int columncount = sheet1.getRow(1).getLastCellNum();
			int physicalNumberOfRows = sheet1.getPhysicalNumberOfRows();// this will start the index with 1
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		

	}

}}
