package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Base.Base;



public class AppTest extends Base
{
	 static WebElement element;
	 static WebDriver driver;
	static JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","F:\\EclipseWorkspace\\Final\\drivrs\\chromedriver.exe");
		//create Chrome instance
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		/*
		 * element = driver.findElement(By.id("login-username")); jsClick(element);login-username
		 */
		
		//jsEnterText("login-username","Saicharan");
		//js.executeScript("document.getElementById('login-username').value='Saicharan';");
		//js.executeScript("document.getElementById('login-username').value='Saicharan'");
		//
		//js.executeScript("document.getElementById('login-username').value='SoftwareTestingMaterial.com';");
		
		WebElement us = driver.findElement(By.id("login-username"));
		int attempt=0;
		System.out.println("entering - loop");
		while(attempt<10) {
			try {
				Thread.sleep(2000);
				System.out.println("Inside loop");
				js.executeScript("arguments[0].click();",us);
				js.executeScript("arguments[1].value=arguments[0];", "",us);
				js.executeScript("arguments[1].value=arguments[0];","ghjk",us);
				//js.executeScript("arguments[0].value='Kirtesh';",us);
				attempt++;
				break;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		}
	}
}
