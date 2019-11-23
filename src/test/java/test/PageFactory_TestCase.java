package test;
import java.util.concurrent.TimeUnit;

import pagefactory.Home_PG_POF;
 
import pagefactory.LogIn_PG_POF;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;
 
import org.openqa.selenium.support.PageFactory;
 
import org.testng.annotations.Test;
 
public class PageFactory_TestCase {
 
 static WebDriver driver;
 
 Home_PG_POF HomePage;
 
 LogIn_PG_POF LoginPage;
 
@Test
 
  public void beforeMethod() {
 
   driver = new FirefoxDriver();
 
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
      driver.get("http://www.yahoo.com");
 
      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
 
      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
		/*
		 * } public void test() {
		 */
 
      HomePage.Signin.click();
 
      LoginPage.txtbx_UserName.sendKeys("saicharan.cherry145@yahoo.com");
      
      HomePage.Next.click();
      
      LoginPage.txtbx_Password.sendKeys("Yahoo3205");
      
      LoginPage.btn_Login.click();
 
      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
  //}
 
		/* public void afterMethod() { */
 
   driver.close();
 
  }
 
}
