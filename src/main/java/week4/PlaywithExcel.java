package week4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PlaywithExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream inputFile = new FileInputStream("D:\\Radha\\Test.xlsx"); //Access the excel sheet
		// TODO Auto-generated method stub
		XSSFWorkbook wBook = new XSSFWorkbook(inputFile);// open the excel
		
		XSSFSheet wSheet = wBook.getSheetAt(0); //choose the sheet
		XSSFRow wRow = wSheet.getRow(2);//choose the row
		XSSFCell wCell = wRow.getCell(2);//choose the cell/column
		System.out.println("Cell 2 value  :" +wCell);
		
	}

	
}
