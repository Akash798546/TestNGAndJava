package ExcelWriteRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetEmployeeDataFromExcel {
	
	 static String filepath = "C://Users//Lenovo//OneDrive//Desktop//Data.xlsx";
	    static String searchName = "Peter"; // Name to search for
	    static XSSFCell cellName;
	    static XSSFCell cellSalary;
	    public static void main(String[] args) throws IOException
	    {
	    FileInputStream fis=new FileInputStream(filepath);
	    
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheet("Sheet1");
	    for(Row row:sheet)
	    {
	    	 cellName=(XSSFCell) row.getCell(0);
	    	 cellSalary=(XSSFCell) row.getCell(3);
	    	
	    	if(cellName.getStringCellValue()!=null && cellName.getCellType()==CellType.STRING)
	    	{
	    		String cellValue=cellName.getStringCellValue();
	    		if(cellValue.equals(searchName))
	    		{
	    			if(cellSalary!=null && cellSalary.getCellType()==CellType.NUMERIC)
	    			{
	    				
	    				System.out.println(cellSalary.getNumericCellValue());
	    				return;
	    			}
	    		}
	    	}
	    }
	    
	    	
	    	
	    	
	    }
	
	

}
