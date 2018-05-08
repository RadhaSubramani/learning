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

	public class ReadExcel {

		
		public Object[][] readExcel() throws IOException{
			FileInputStream fis=new FileInputStream("C:\\Users\\Radha\\Desktop\\readexcel.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			int rowCount=0;
			int columnCount=0;

			Object[][] dd = new Object[rowCount][columnCount];
			for(int k=0; k<3; k++){
			XSSFSheet  sheet = wb.getSheetAt(k);
			
			rowCount = sheet.getLastRowNum();
			columnCount = sheet.getRow(0).getLastCellNum();
			
			
			for (int i = 1; i <=rowCount; i++) {
				XSSFRow row = sheet.getRow(i);
				
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);				
					
					dd[i-1][j] = cell.getStringCellValue();
				}
			}
			
			
		}
			wb.close();

			
			return dd;
			}

	}
