package Base;

//import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {

	public static WebDriver driver;
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static void jsClick(WebElement element) {

		// Perform Click on LOGIN button using JavascriptExecutor
		js.executeScript("arguments[0].click();", element);

	}

	public static void jsEnterText(String ID,String value) {

		// Perform Click on LOGIN button using JavascriptExecutor
		//js.executeScript("document.getElementById('"+ID+"').value='"+value+"';");
		js.executeScript("document.getElementById('login-username').value='Saicharan';");

	}

	/*
	 * public void excelReader() {
	 * 
	 * }
	 */
}
