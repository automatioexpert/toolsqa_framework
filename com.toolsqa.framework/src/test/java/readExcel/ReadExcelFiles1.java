package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcelFiles1 
{

	@Test
	public void readExcel() throws Exception
	{
		
		File src=new File("./TestData/AppData.xlsx");
	
        FileInputStream fis=new FileInputStream(src);

        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        String data1=wb.getSheet("Login").getRow(0).getCell(0).getStringCellValue();
        
        int data2=(int)wb.getSheet("Login").getRow(0).getCell(1).getNumericCellValue();
        
        String data3=wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
        
        int data4=(int)wb.getSheet("Login").getRow(1).getCell(1).getNumericCellValue();
        
        System.out.println(data1);
        
        System.out.println(data2);
        
        System.out.println(data3);
        
        System.out.println(data4);
	    
	}
	
	
}
