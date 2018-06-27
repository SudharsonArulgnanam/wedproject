package testcases;


	
	import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class WriteExcel {

		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		XSSFWorkbook wbook = null;
			
			try
			{
				wbook= new XSSFWorkbook(new FileInputStream("./data/TC001.xlsx"));
				XSSFSheet sheet1 = wbook.getSheetAt(-1);
				sheet1.getRow(0).getCell(1).setCellValue("dhev");
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
		}

		FileOutputStream fs=null;
			try
			{
				fs = new FileOutputStream("./data/TC001.xlsx");
				wbook.write(fs);
				fs.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			}
}
