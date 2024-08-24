package ExcelWriteRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EmployeeDataFromExcel {
	
	static String filepath="C://Users//Lenovo//OneDrive//Desktop//Data.xlsx";
	
	public static void main(String[] args) throws IOException
	{
		
		
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();
		int cellCount=sheet.getRow(0).getLastCellNum();
//		for(int i=0;i<=rowCount;i++)
//		{
//			XSSFRow row=sheet.getRow(i);
//			for(int j=0;j<cellCount;j++)
//			{
//				XSSFCell cell=row.getCell(j);
//				System.out.print(cell.toString()+"\t");
//			}
//			System.out.println("");
//		}
		for(int i=0;i<=rowCount;i++)
		{
			XSSFRow row =sheet.getRow(i);
			if(row.toString().equals("Peter"))
			{
           XSSFCell cell=row.getCell(3);
           System.out.println();

			}
			
		}
//		
		
		
		
		
		
	}

}
