package ExcelWriteRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkerFileRead {
	
	static String path="D:\\TestData\\MOCK_DATA.xlsx";
	static int id=20 ;
	
	public static void main(String[] args) throws IOException
	{
		
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("data");
		boolean found=false;
		for(Row row:sheet)
		{
			if(row.getRowNum()==0)
			{
				continue;
			}
			
			XSSFCell CellId=(XSSFCell) row.getCell(0);
			XSSFCell cellName=(XSSFCell) row.getCell(1);
			XSSFCell cellLastName=(XSSFCell) row.getCell(2);
			XSSFCell cellEmail=(XSSFCell) row.getCell(3);
			XSSFCell cellGender=(XSSFCell) row.getCell(4);
			XSSFCell cellIp=(XSSFCell) row.getCell(5);
			
			if(CellId!=null && CellId.getCellType()==CellType.NUMERIC)
			{
				int CellValue=(int) CellId.getNumericCellValue();
				
				if(CellValue==id)
				{
					if(cellName!=null && cellName.getCellType()==CellType.STRING)
					{
						String name=cellName.getStringCellValue();
						System.out.println("The First Name of id- "+id+" is "+name);
					}
					else
					{
						System.out.println("Name not found");
					}
					if(cellLastName!=null && cellLastName.getCellType()==CellType.STRING)
					{
						String lastname=cellLastName.getStringCellValue();
						System.out.println("The Last Name of id- "+id+" is "+lastname);
					}
					else
					{
						System.out.println("Last Name not found");
					}
					if(cellEmail!=null && cellEmail.getCellType()==CellType.STRING)
					{
						String Email=cellEmail.getStringCellValue();
						System.out.println("The Email of id- "+id+" is "+Email);
					}
					else
					{
						System.out.println("Email not found");
					}
					if(cellGender!=null && cellGender.getCellType()==CellType.STRING)
					{
						String Gender=cellGender.getStringCellValue();
						System.out.println("The Gender of id- "+id+" is "+Gender);
					}
					else
					{
						System.out.println("Gender not found");
					}
					if(cellIp!=null && cellIp.getCellType()==CellType.STRING)
					{
						String Ip=cellIp.getStringCellValue();
						System.out.println("The IP of id- "+id+" is "+Ip);
					}
					else
					{
						System.out.println("IP not found");
					}
				}
				
				
				
			}
		}
		
		
		
		
		
		
	}

}
