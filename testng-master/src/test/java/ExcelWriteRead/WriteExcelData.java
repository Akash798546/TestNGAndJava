package ExcelWriteRead;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteExcelData {
	
  public static void main(String[] args) throws IOException
	{
	
	XSSFWorkbook wb=new XSSFWorkbook();
	
	XSSFSheet sheet =wb.createSheet("SampleSheet");
	
	Map<String , Object[]> dataSet=new TreeMap<String , Object[]>();
	dataSet.put("1", new Object[] {"ID","Name","COMPANY"});
	dataSet.put("2", new Object[] {"101","Akash","TIL"});
	dataSet.put("3", new Object[] {"I02","Rishabh","TCS"});
	dataSet.put("4", new Object[] {"103","Krishna","TBS"});
	dataSet.put("5", new Object[] {"104","Pratinav","CoolBoots"});
	dataSet.put("6", new Object[] {"105","Aryan","Axis"});
	
	
	Set<String> set=dataSet.keySet();
	int rownum=0;
	
	for(String key:set)
	{
		XSSFRow row=sheet.createRow(rownum++);
		Object[] data=dataSet.get(key);
		
		int cellnum=0;
		
		for (Object value:data)
		{
			XSSFCell cell=row.createCell(cellnum++);
			if(value instanceof String)
			{
				cell.setCellValue((String)value);
			}
			if(value instanceof Integer)
			{
				cell.setCellValue((int)value);
			}
		}
				
		
	}
	
	FileOutputStream fos=new FileOutputStream("SampleTest.xlsx");
	wb.write(fos);
		
}
  
 
}