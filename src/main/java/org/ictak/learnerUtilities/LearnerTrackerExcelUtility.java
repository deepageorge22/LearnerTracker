package org.ictak.learnerUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnerTrackerExcelUtility {
	
	public static XSSFWorkbook excelWbook;
    public static XSSFSheet excelSheet;
    
   public static String getCellData(int rowNum,int colNum) throws IOException
       {
    FileInputStream input=new FileInputStream("C:\\Users\\deepa\\eclipse-workspace\\INTERSHIP_PROJECT_LEARNERTRACKER\\NewLearnerTracker\\src\\main\\resources\\LearnerTrackerTestData.xlsx");
    excelWbook= new XSSFWorkbook(input);
    excelSheet=excelWbook.getSheetAt(0);
    
    return excelSheet.getRow(rowNum).getCell(colNum).getStringCellValue();

   }

}
