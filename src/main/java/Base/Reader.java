package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Reader {
	
	File file;
	FileInputStream fis;
	XSSFWorkbook wbook;
	XSSFSheet sheet;
	String filePath="C:\\Users\\shank\\git\\Repo\\src\\test\\java\\resources\\ReadExcel.xlsx";
	DataFormatter formatter = new DataFormatter();
	
	
	@Test(dataProvider = "dProvider")
	public void printvalue(Map<String, String> testdata) {
	System.out.println(testdata);	
	}
	
	@DataProvider(name="dProvider")
	public Object[][] ReadExcel() throws Exception{

		file = new File(filePath);
		fis = new FileInputStream(file);
		wbook = new XSSFWorkbook(fis);
		sheet = wbook.getSheet("firstPage");
		
		System.out.println("Check ");
		
		//Row count 
		int rowCount= sheet.getLastRowNum();
		System.out.println(rowCount);
		
		Map<String, String> map = new HashMap();
		
		List<Map<String,String>> list = new ArrayList<>();
		
		//Datarow
		for(int i =0; i<rowCount;i++) {
		
			 XSSFRow headerRow = sheet.getRow(0);
			 XSSFRow dataRow= sheet.getRow(i);
			 int columnCount= headerRow.getLastCellNum();
			 for(int j = 0;j<columnCount; j++) {
				 
				  
				 String key = formatter.formatCellValue(headerRow.getCell(j));
				 String value = formatter.formatCellValue(dataRow.getCell(j));
				 
				 
				 map.put(key, value);
				 
			 }
			 
			 list.add(map);
			 
			 }
		
		Object[][] obj = new Object[list.size()][1];
		
		for(int i=0;i<list.size();i++) {
	
			obj[i][0]= list.get(i);
			
				
		}
		return obj;
		
    	
	}
	
	

}
