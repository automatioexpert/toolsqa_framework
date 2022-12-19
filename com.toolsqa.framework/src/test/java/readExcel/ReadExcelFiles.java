package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFiles 
{

	@Test
	public void readExcel() throws Exception
	{
		
		File src=new File("./TestData/AppData.xlsx");
	
        FileInputStream fis=new FileInputStream(src);
		
        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        System.out.println("Excel is loaded");
        
        XSSFSheet sh1=wb.getSheetAt(0);
        
        XSSFRow r1=sh1.getRow(0);
        
	    XSSFCell c1=r1.getCell(0);
	    
	    String data1=c1.getStringCellValue();
	    
	    System.out.println("Data from excel is "+data1);
	    
        XSSFRow r2=sh1.getRow(1);
        
	    XSSFCell c2=r2.getCell(1);
	    
	    int data2=(int)c2.getNumericCellValue();
	    
	    System.out.println("Data from excel is "+data2);
	    
	}
	
	
}
