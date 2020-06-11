package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromelogin {
	WebDriver driver;
	public static void  main(String[]args) {
		
		
		
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\Vidya\\Downloads\\chromedriver_win32(6)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
	}

}
