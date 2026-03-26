package Demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;



public class ReadDataFromExcel {
	
	@Test
	public void test() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_Recruitment_Vacancy_TestData/vacancies.xlsx");
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("AddVacancy");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		for(int i=0;i<sheet.getLastRowNum();i++) {
			row=sheet.getRow(i);
			for(int j=0;j<row.getLastCellNum()-1;j++) {
				cell=row.getCell(j);
				System.out.print(cell.getStringCellValue()+" ");
			}
			System.out.println();
			
		}
		workbook.close();
		
	}

}
