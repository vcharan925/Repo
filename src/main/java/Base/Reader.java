package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reader {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	String filePath="C:\\Users\\appadmin\\git\\Repo\\src\\test\\java\\resources\\ReadExcel.xlsx";
	DataFormatter formatter = new DataFormatter();
	
	@Test
	public void ReadExcel() {
		try {
		file = new File(filePath);
		fis = new FileInputStream(file);
		wbook = new XSSFWorkbook();
		sheet = wbook.getSheet("firstPage");
		
		//Row count 
		int rowCount;
		rowCount= sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Header row intialising
		XSSFRow headerRow = sheet.getRow(0);
		
		//Coulmn count
		int columnCount= headerRow.getLastCellNum();
		System.out.println(columnCount);
		
		//Datarow
		
        XSSFRow	dataRow= sheet.getRow(1);
		
        //data map
        Map<String, String> datamap = new HashMap();
        
		for(int i =0;i<rowCount;i++) {
		
			//reading Key values 
			String keyCell = formatter.formatCellValue(headerRow.getCell(i));
			
			//reading values 
			String cell = formatter.formatCellValue(dataRow.getCell(i));

			//Add key & cell into map
			datamap.put(keyCell, cell);
			
			System.out.println(datamap);
			
		}
		
		
		//columnCount=
		
		}
		catch(Exception e) {
			Reporter.log("Exception occured while reading excel:"+e.getMessage(), true);
		}
	}
	
	

}
