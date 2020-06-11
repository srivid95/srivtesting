package testcase;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavenwrappermethod {

	WebDriver driver;
	
	public void insertapp(String url) {
	WebDriverManager.firefoxdriver().setup();
	driver= new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(url);
	}
	
	public void enterbyid(String val,String name) {
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void enterbyname(String val,String name) {
		driver.findElement(By.id(val)).sendKeys(name);
	}
	
	public void clickbyid(String val) {
		driver.findElement(By.id(val)).click();
	}
	
	public void clickbyxpath(String val, String name) {
		driver.findElement(By.xpath(val)).click();
	}
	
	public void enterbyxpath(String val,String name) {
		driver.findElement(By.xpath(val)).sendKeys(name);
	}
	
	public void screenshot(String filename) throws Exception{
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(file, new File("C:\\Users\\Vidya\\eclipse-workspace\\Webdrivers\\screenshot/"+ filename+ ".png"));
	
	}
	
	
	
	public void closeapp() {
	driver.close();
		
	}
	
	

	
	
}
