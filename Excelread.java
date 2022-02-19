package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excelread {
	public static void main(String[] args) throws IOException  {
		File file= new File("F:\\Sushil\\u&p.xlsx");
		FileInputStream fis= new FileInputStream(file);
		Workbook wb= new XSSFWorkbook(fis);
	    Sheet sheet=wb.getSheet("Sheet1");
	    int lastrowno=sheet.getLastRowNum();
	    System.out.println("Row no:  "+ lastrowno);
	    int lastcellno=sheet.getRow(0).getLastCellNum();
	    System.out.println("last cell no :"  + lastcellno);
	    
	    for(int i=0; i<lastrowno; i++)
	    {
	    	for(int j=0; j<lastcellno; j++)		
	    	{

				String value=sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+  "    ");
			}
			System.out.println();

		}
	    }
		
		
	}


