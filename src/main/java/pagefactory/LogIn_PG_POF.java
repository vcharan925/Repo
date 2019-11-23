package pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
public class LogIn_PG_POF {
 
 final WebDriver driver;
 
 @FindBy(id="login-username")
 
 public WebElement txtbx_UserName;
 
 @FindBy(id="login-passwd")
 
 public WebElement txtbx_Password;
 
 @FindBy(id="login-signin")
 
 public WebElement btn_Login ;
 
 public LogIn_PG_POF(WebDriver driver)
 
 {
 
 this.driver = driver;
 
 }
 

 
 public void LogIn_Action(String sUserName){
 
 txtbx_UserName.sendKeys(sUserName);
 
 
 
 btn_Login.click();
 
 }
 
}