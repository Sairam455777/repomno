package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
<<<<<<< HEAD
system.out.println("we editing some data into the sai repomno file");
=======
	system.out.println("RRRRRRRR");
>>>>>>> fba8b9a5beff4cd7bf18616cc4c0f128c5a662d0
	WebDriver driver;
	public AdminLoginPage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(name="username")
 WebElement UserName;
@FindBy(name="password")
WebElement password;
@FindBy(xpath="//button[text()='sign In']")
WebElement button;


public void login(String un,String pwd) {
	UserName.sendKeys(un);
password.sendKeys(pwd);
button.click();


}
}
