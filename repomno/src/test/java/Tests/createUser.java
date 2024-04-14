package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createUser {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver();

		driver.manage().window().maximize();
		//Pass the URL
		driver.get("https://www.flipkart.com/");
		List<WebElement>links=driver.findElements(By.tagName("a"));
		String[] str = new String[links.size()];
		System.out.println(links.size());
		int index=0;
		for(WebElement link:links) {
			System.out.println(str[index++]=link.getText());
		}
		driver.quit();
}
}