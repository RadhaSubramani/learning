package week4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateSheetwithCellStyle {

		   public static void main(String[] args)throws Exception

		   {
			 
		      XSSFWorkbook workbook = new XSSFWorkbook(); //To create workbook
		     

		      XSSFSheet spreadsheet = workbook.createSheet("Radha");//To create sheet
		      
		      XSSFRow row=spreadsheet.createRow(0); //To create row
		      
		      XSSFRow row1=spreadsheet.createRow(1);
		      
		      XSSFRow row2=spreadsheet.createRow(2);
		      
		      XSSFRow row3=spreadsheet.createRow(3);
		      
		        
		      //Below lines are for setting background and font color specific for cell of row 1
		      //ROW 1
		      
		      CellStyle style = workbook.createCellStyle();
			  style.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
			  style.setFillPattern(CellStyle.SOLID_FOREGROUND);	
			  
			  //Font color is set common for all cell text value
			  Font font = workbook.createFont();
		      font.setColor(IndexedColors.BLACK.getIndex());
		      style.setFont(font);
			  
			  
		      Cell cell=row.createCell(0); //to create cell
		      cell.setCellValue("Status"); //provide value to cell
		      cell.setCellStyle(style);
		     
			  //ROW 2 - Below lines are for setting background and font color specific for cell 0 of row 2
		      CellStyle style1 = workbook.createCellStyle();
			  style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			  style1.setFillPattern(CellStyle.SOLID_FOREGROUND);	
		      style1.setFont(font);
		      
		      Cell cell1=row1.createCell(0); //to create cell
		      cell1.setCellValue("Pass"); //provide value to cell
		      cell1.setCellStyle(style1);
		    		     
		     //ROW 3 - Below lines are for setting background and font color specific for cell 0 of row 3
		      CellStyle style2 = workbook.createCellStyle();
			  style2.setFillForegroundColor(IndexedColors.RED.getIndex());
			  style2.setFillPattern(CellStyle.SOLID_FOREGROUND);	
		      style2.setFont(font);
		      
		      Cell cell2=row2.createCell(0); //to create cell
		      cell2.setCellValue("Fail"); //provide value to cell
		      cell2.setCellStyle(style2);
		      
		      //ROW 4- Below lines are for setting background and font color specific for cell 0 of row 4
		      CellStyle style3 = workbook.createCellStyle();
			  style3.setFillForegroundColor(IndexedColors.BLUE.getIndex());
			  style3.setFillPattern(CellStyle.SOLID_FOREGROUND);	
			  style3.setFont(font);
				      
			  Cell cell3=row3.createCell(0); //to create cell
			  cell3.setCellValue("Blocked"); //provide value to cell
			  cell3.setCellStyle(style3);
				      
		      FileOutputStream out = new FileOutputStream(new File("D:\\Radha\\createsheet.xlsx"));

		      workbook.write(out);

		      out.close();

		      System.out.println("typesofcells.xlsx written successfully");
		      
		      

		   }

	


	}


