package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utilities.utilities77;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AdminHomePage;
import pages.AdminLoginPage;

public class create {
	
	
	@Test
	public void createUser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saina\\Downloads\\chromedriver-win64 (3)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("adminUrl");
		AdminLoginPage al=new AdminLoginPage(driver);
	
		String UserName;
		String Password;
		 String adminUrl;
		UserName=utilities77.getProperty("AdminUserName");
		Password=utilities77.getProperty("AdminPassword");
		adminUrl=utilities77.getProperty("AdminUrl");

		
		al.login(UserName, Password);
		AdminHomePage aa=new AdminHomePage(driver);
		aa.verify();
		
	}
}
