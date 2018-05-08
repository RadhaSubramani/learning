package readexcel;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.testng.annotations.Test;

	public class ReadExcel1 {

		
		public Object[][] readExcel() throws IOException{
			FileInputStream fis=new FileInputStream("C:\\Users\\Radha\\Desktop\\Book1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet  sheet = wb.getSheetAt(0);
			
			int rowCount = sheet.getLastRowNum();
			int columnCount = sheet.getRow(0).getLastCellNum();
			
			Object[][] dd = new Object[rowCount][columnCount];
			
			for (int i = 1; i <=rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);				
					
					dd[i-1][j] = cell.getStringCellValue();
				}
			}
			wb.close();
			return dd;
		}

	}

