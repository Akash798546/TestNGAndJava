package ExcelWriteRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

    static String filepath = "C://Users//Lenovo//OneDrive//Desktop//Data.xlsx";

    public static void main(String[] args) {
        FileInputStream fis = null;
        XSSFWorkbook wb = null;
        try {
            fis = new FileInputStream(filepath);
            wb = new XSSFWorkbook(fis);
            XSSFSheet sheet = wb.getSheet("Sheet1");

            int rowCount = sheet.getLastRowNum();
            int cellCount = sheet.getRow(0).getLastCellNum();

            for (int i = 0; i <= rowCount; i++) {
                XSSFRow row = sheet.getRow(i);
                if (row == null) continue; // Skip if the row is null

                for (int j = 0; j < cellCount; j++) { // Change `<=` to `<`
                    XSSFCell cell = row.getCell(j); // Use `row.getCell(j)` instead of `sheet.getRow(j).getCell(j)`
                    if (cell != null) { // Check if the cell is null
                        System.out.print(cell.toString() + "\t"); // Print cell value
                    } else {
                        System.out.print("null\t"); // Handle null cells
                    }
                }
                System.out.println(); // Move to the next line after printing all cells in the row
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (wb != null) {
                    wb.close(); // Close the workbook
                }
                if (fis != null) {
                    fis.close(); // Close the file input stream
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
