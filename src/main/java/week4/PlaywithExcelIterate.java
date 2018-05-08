package week4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PlaywithExcelIterate {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputFile = new FileInputStream("D:\\Radha\\Test.xlsx"); //Access the excel sheet
		XSSFWorkbook wBook = new XSSFWorkbook(inputFile);
		for(Sheet sheet:wBook)
		{
			System.out.println("SheetName  : " + sheet.getSheetName());
			
			for(Row row : sheet)
			{
				if(row.getRowNum()==0)
						
				{
					System.out.println("Employee ID :" +row.getCell(0).getNumericCellValue());
					System.out.println("Username is :" +row.getCell(1).getStringCellValue());
					System.out.println("Password is :" +row.getCell(2).getNumericCellValue());
				}
			}
				
				
			
		}
				
	
	
	}
	
}


