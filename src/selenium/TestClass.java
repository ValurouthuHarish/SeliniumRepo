package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "D:\\Harish\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://google.com");
	       System.out.println(driver.getTitle());
	       driver.close();
	
	   }
}
