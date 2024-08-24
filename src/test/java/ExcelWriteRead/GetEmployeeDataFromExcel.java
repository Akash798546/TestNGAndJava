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
	    static String searchName = "Chris"; // Name to search for
	    
	    public static void main(String[] args) throws IOException
	    {
	    	
	    	FileInputStream fis=new FileInputStream(filepath);
	    	
	    	XSSFWorkbook wb=new XSSFWorkbook(fis);
	    	XSSFSheet sheet=wb.getSheet("Sheet1");
	    	boolean found=false;
	    	for(Row row:sheet)
	    	{
	    		if(row.getRowNum()==0)
	    		{
	    			continue;
	    		}
	    		
	    		XSSFCell cellName=(XSSFCell) row.getCell(0);
	    		XSSFCell salaryCell=(XSSFCell) row.getCell(2);
	    		if(cellName!=null && cellName.getCellType()==CellType.STRING)
	    		{
	    			String cellValue=cellName.getStringCellValue();
	    			if(cellValue.equals(searchName))
	    			{
	    				if(salaryCell!=null && salaryCell.getCellType()==CellType.NUMERIC)
	    				{
	    					int salary=(int) salaryCell.getNumericCellValue();
	    					System.out.println("The id of "+searchName+" is "+salary);
	    				}
	    			}
	    		}
	    		
	    	}
	    	
	    	
	    	
	    }
	
	

}
