package week4;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelcellIterate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook=new XSSFWorkbook("D:\\Radha\\Test.xlsx");
		//XSSFSheet wsheet=wbook.getSheet("Mango");
		for(Sheet sheet:wbook)
		{
			System.out.println("SheetName  : " + sheet.getSheetName());
			
			for(Row eachrow : sheet)
			{
			if(eachrow.getRowNum()==0)
				continue; //below statement will not work, but continue the next iteration
			else
			{
				int i=0;
				for(Cell cell:eachrow)
				{
				if(i==0)
				{
					//System.out.println();
				System.out.print(eachrow.getCell(i).getNumericCellValue()+"   ");
				
					
				}
				else
				{
				System.out.print(eachrow.getCell(i).getStringCellValue()+"    ");
				
				}
				i++;
				
				
					
			}
		}
		
		
			System.out.println();
		}
	}

}
}
