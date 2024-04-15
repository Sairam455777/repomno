package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage {
system.out.println("sai ram updated its11111");
	WebDriver driver;
	public AdminHomePage(WebDriver driver) {
		this.driver=driver;
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//a[contains(text(), '- Admin')])]")
WebElement admin;

public boolean verify() {
	return admin.isDisplayed();
}
}
