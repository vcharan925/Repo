package pagefactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.FindBy;
 
public class Home_PG_POF {
 
 final WebDriver driver;
 
 @FindBy(id = "uh-signin")
 
 public WebElement Signin;
 
 @FindBy(name = "signin")
 
 public WebElement Next;
 
// This is a constructor, as every page need a base driver to find web elements
 
 public Home_PG_POF(WebDriver driver)
 
 {
 
 this.driver = driver;
 
 }
 
}