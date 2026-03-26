package generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	Workbook wb;
	Sheet sheet;
	
	public void loadExcelFile(String filepath,String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(filepath);
		Workbook wb=WorkbookFactory.create(fis);
		sheet=wb.getSheet(sheetName);
	}
	
	public String getData(int rowNo, int cellNo) throws EncryptedDocumentException, IOException {

		Cell cell = sheet.getRow(rowNo).getCell(cellNo);

	    if (cell.getCellType() == CellType.STRING) {
	        return cell.getStringCellValue();
	    } 
	    else if (cell.getCellType() == CellType.NUMERIC) {

	        double val = cell.getNumericCellValue();

	        // Convert to int (remove .0)
	        return String.valueOf((int) val);
	    }

	    return "";
	}
	
	//write data
	public void writeDataInTheCell(String filepath,String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException {

		Row row=sheet.getRow(rowNo);
		
		if(row==null) {
			row=sheet.createRow(rowNo);
		}
		Cell cell=row.getCell(cellNo);
		if(cell==null) {
			cell=row.createCell(cellNo);
		}
		cell.setCellValue(data);
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		fos.close();
	}
	
	//get entire data using DataProvider
	public Object[][] getDataFromTheExcelSheet(){
		int row_count=sheet.getRow(0).getRowNum();
		int col_count=sheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[row_count][col_count];
		for(int i=1;i<=row_count;i++) {
			for(int j=0;j<col_count;j++) {
				
			}
		}
		return data;
	}
	
	
	
	
}