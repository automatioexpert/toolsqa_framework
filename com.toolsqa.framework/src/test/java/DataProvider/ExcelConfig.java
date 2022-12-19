package DataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig 
{

	XSSFWorkbook wb;
	
	public ExcelConfig()
	{
		
		File src=new File("./TestData/AppData.xlsx");
		
        try 
        {
			FileInputStream fis=new FileInputStream(src);

			wb=new XSSFWorkbook(fis);
			
			System.out.println("Excel is loaded and Ready to use");
			
		} catch (Exception e) {
			
			System.out.println("Unable to load excel sheet");
		} 
	}
	
	
	public String getStringData(String sheetName,int rowIndex,int columnIndex)
	{
		String data=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
		
		return data;
	}
	
	
	public XSSFSheet getSheetObject(String sheetName)
	{
		return wb.getSheet(sheetName);
	}
	
	
	public int getNumberOfRows(String sheetName)
	{
		int rowCount=wb.getSheet(sheetName).getPhysicalNumberOfRows();
		
		return rowCount;
		
	}
	
	public int getNumberOfColumns(String sheetName,int row)
	{
		int rowCount=wb.getSheet(sheetName).getRow(row).getPhysicalNumberOfCells();
		
		return rowCount;
		
	}
	
	
	public int getNumericData(String sheetName,int rowIndex,int columnIndex)
	{
		int data=(int)wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
		
		return data;
	}
	
	public void setExcelData(String sheetName,int rowIndex,int columnIndex,String result)
	{
		wb.getSheet(sheetName).getRow(rowIndex).createCell(columnIndex).setCellValue(result);
	}

	
	public Object getData(String sheetName,int rowIndex,int columnIndex)
	{
		
		
		int type=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getCellType();
		
		Object data = null;
		switch (type) 
		{
		case Cell.CELL_TYPE_STRING:
			       data=wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getStringCellValue();
			break;
			
		case Cell.CELL_TYPE_NUMERIC:
			      data=(int)wb.getSheet(sheetName).getRow(rowIndex).getCell(columnIndex).getNumericCellValue();
		    break;
		    
		case Cell.CELL_TYPE_FORMULA:
			  System.out.println("Formula data method has to be called");
	         break;
	         
		default:
			break;
			
			
		}
		return data;
	}
	
	
	
	
}
