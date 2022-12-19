package readExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcel1 
{

	@Test
	public void readExcel() throws Exception
	{
		
		File src=new File("./TestData/AppData.xlsx");
	
        FileInputStream fis=new FileInputStream(src);

        XSSFWorkbook wb=new XSSFWorkbook(fis);
        
        wb.getSheet("Account").getRow(0).createCell(2).setCellValue("PASS");
           
        wb.getSheet("Account").getRow(1).createCell(2).setCellValue("11.00");
        
        FileOutputStream fout=new FileOutputStream(new File(src.toString()));
        
        wb.write(fout);
        
        wb.close();
        
        
	}
	
	
}
