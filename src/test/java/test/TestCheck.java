package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Base.Reader;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCheck {
	
	static WebDriver driver;
	
	@Test(dataProvider = "dProvider",enabled =true,priority=0, dataProviderClass= Reader.class)
	public void beforeMethod(Map<String, String> testdata) {
	 
	   driver = new FirefoxDriver();
	 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	   driver.get("http://www.yahoo.com");
	   
	   String d= testdata.get("name");
	   driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys(testdata.get("name"));
	   
	   
	}
	}


