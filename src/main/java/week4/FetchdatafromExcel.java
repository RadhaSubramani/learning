package week4;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFName;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class FetchdatafromExcel {

		public static void main(String[] args) throws IOException {
			
			FileInputStream inputFile = new FileInputStream("D:\\Radha\\Test.xlsx"); //Access the excel sheet
			XSSFWorkbook wBook = new XSSFWorkbook(inputFile); 
			XSSFSheet wsheet = wBook.getSheet("Apple");
				
				for(Row row : wsheet)
				{
					if(row.getRowNum()==0)
					{
						System.out.println("Row 0");
						String header1 = row.getCell(0).getStringCellValue();
						String header2 = row.getCell(1).getStringCellValue();
						String header3 = row.getCell(2).getStringCellValue();
						System.out.println(header1+"  "+header2+" " +header3);
					}
					
					else if(row.getRowNum()==1)
					{
						System.out.println("Row 1");
						
						String emp1 = row.getCell(0).getStringCellValue();
						String emp2 = row.getCell(1).getStringCellValue();
						String emp3 = row.getCell(2).getStringCellValue();
						System.out.println(emp1+"  "+emp2+" "+emp3);
					}
					
					else if(row.getRowNum()==2)
					{
						System.out.println("Row 2");
						String name1 = row.getCell(0).getStringCellValue();
						String name2 = row.getCell(1).getStringCellValue();
						String name3 = row.getCell(2).getStringCellValue();
						System.out.println(name1+"  "+name2+" " +name3);
						
					}
					else if(row.getRowNum()==3)
					{
						System.out.println("Row 2");
						String pass1 = row.getCell(0).getStringCellValue();
						String pass2 = row.getCell(1).getStringCellValue();
						String pass3 = row.getCell(2).getStringCellValue();
						System.out.println(pass1+"  "+pass2+" " +pass3);
					}
			
		}
	}
	}
					